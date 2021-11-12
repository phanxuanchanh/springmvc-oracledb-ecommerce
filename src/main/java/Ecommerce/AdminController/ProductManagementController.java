package Ecommerce.AdminController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.opencsv.CSVWriter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Ecommerce.Entity.Product;
import Ecommerce.Service.ProductCategoryServiceImpl;
import Ecommerce.Service.ProductServiceImpl;
import Ecommerce.Service.ProductStateServiceImpl;
import Ecommerce.Service.SupplierServiceImpl;
import Ecommerce.Validator.ProductValidator;

@Controller
public class ProductManagementController {
	@Autowired
	private ProductServiceImpl productServiceImpl;

	@Autowired
	private ProductStateServiceImpl productStateServiceImpl;

	@Autowired
	private ProductCategoryServiceImpl productCategoryServiceImpl;

	@Autowired
	private SupplierServiceImpl supplierServiceImpl;

	@RequestMapping(value = { "quan-tri/danh-sach-san-pham",
			"quan-tri/danh-sach-san-pham/{message}" }, method = RequestMethod.GET)
	public ModelAndView ProductList(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/product-list");
		modelAndView.addObject("products", productServiceImpl.GetProducts());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		if (message != null) {
			if (message.equals("delete-success"))
				modelAndView.addObject("state", "Xóa thành công");
			else if (message.equals("delete-failed"))
				modelAndView.addObject("state", "Xóa thất bại");
			else
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}

	@RequestMapping(value = "quan-tri/chi-tiet-san-pham/{id}", method = RequestMethod.GET)
	public ModelAndView ProductDetail(HttpSession httpSession, @PathVariable BigDecimal id) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham");

		Product product = productServiceImpl.GetProduct(id);
		if (product == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/product-detail");
		modelAndView.addObject("product", product);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		modelAndView.addObject("productCategory",
				productCategoryServiceImpl.GetProductCategory(product.getProductCategoryId()));
		modelAndView.addObject("productState", productStateServiceImpl.GetProductState(product.getProductStateId()));
		modelAndView.addObject("supplier", supplierServiceImpl.GetSupplier(product.getSupplierId()));
		return modelAndView;
	}

	@RequestMapping(value = "quan-tri/xuat-danh-sach-san-pham-xlsx", method = RequestMethod.GET)
	public ModelAndView ExportXLSX(HttpServletRequest httpServletRequest) throws IOException {
		Object obj = httpServletRequest.getSession().getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		List<Product> products = productServiceImpl.GetProducts();
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Products");

		Row firstRow = sheet.createRow(0);
		Cell cellOfFirstRow = firstRow.createCell(0);
		cellOfFirstRow.setCellValue("ID");
		cellOfFirstRow = firstRow.createCell(1);
		cellOfFirstRow.setCellValue("Tên");
		cellOfFirstRow = firstRow.createCell(2);
		cellOfFirstRow.setCellValue("Mô tả");
		cellOfFirstRow = firstRow.createCell(3);
		cellOfFirstRow.setCellValue("Giá");
		cellOfFirstRow = firstRow.createCell(4);
		cellOfFirstRow.setCellValue("Giảm giá");
		cellOfFirstRow = firstRow.createCell(5);
		cellOfFirstRow.setCellValue("Số lượng");
		cellOfFirstRow = firstRow.createCell(6);
		cellOfFirstRow.setCellValue("Thể loại");
		cellOfFirstRow = firstRow.createCell(7);
		cellOfFirstRow.setCellValue("Trạng thái");
		cellOfFirstRow = firstRow.createCell(8);
		cellOfFirstRow.setCellValue("Nhà cung cấp");
		cellOfFirstRow = firstRow.createCell(9);
		cellOfFirstRow.setCellValue("Ngày tạo");
		cellOfFirstRow = firstRow.createCell(10);
		cellOfFirstRow.setCellValue("Ngày cập nhật");

		int rowCount = 0;
		for (Product product : products) {
			Row row = sheet.createRow(++rowCount);

			Cell cell = row.createCell(0);
			cell.setCellValue(product.getID().intValue());
			cell = row.createCell(1);
			cell.setCellValue(product.getName());
			cell = row.createCell(2);
			cell.setCellValue(product.getDescription());
			cell = row.createCell(3);
			cell.setCellValue(product.getPrice().doubleValue());
			cell = row.createCell(4);
			cell.setCellValue(product.getDiscount().doubleValue());
			cell = row.createCell(5);
			cell.setCellValue(product.getQuanty().intValue());
			cell = row.createCell(6);
			cell.setCellValue(productCategoryServiceImpl.GetProductCategory(product.getProductCategoryId()).getName());
			cell = row.createCell(7);
			cell.setCellValue(productStateServiceImpl.GetProductState(product.getProductStateId()).getName());
			cell = row.createCell(8);
			cell.setCellValue(supplierServiceImpl.GetSupplier(product.getSupplierId()).getName());
			cell = row.createCell(9);
			cell.setCellValue(product.getCreateAt());
			cell = row.createCell(10);
			cell.setCellValue(product.getUpdateAt());
		}

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String dir = httpServletRequest.getServletContext().getRealPath("/file-upload/xlsx");
		String filePath = String.format("%s/product_list_%s.xlsx", dir, dtf.format(now));
		String fileName = String.format("product_list_%s.xlsx", dtf.format(now));
		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);
		return new ModelAndView(String.format("redirect:/quan-tri/tai-xuong-file.xlsx?filename=%s", fileName));
	}

	@RequestMapping(value = "quan-tri/xuat-danh-sach-san-pham-csv", method = RequestMethod.GET)
	public ModelAndView ExportCSV(HttpServletRequest httpServletRequest) throws IOException {
		Object obj = httpServletRequest.getSession().getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		List<Product> products = productServiceImpl.GetProducts();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String dir = httpServletRequest.getServletContext().getRealPath("/file-upload/csv");
		String filePath = String.format("%s/product_list_%s.csv", dir, dtf.format(now));
		String fileName = String.format("product_list_%s.csv", dtf.format(now));
		File file = new File(filePath);
		FileWriter outputfile = new FileWriter(file);
		CSVWriter writer = new CSVWriter(outputfile);

		String[] header = { "ID", "Tên", "Giá", "Giảm giá", "Số lượng", "Thể loại", "Trạng thái", "Nhà cung cấp",
				"Ngày tạo", "Ngày cập nhật" };
		writer.writeNext(header);

		for (Product product : products) {
			String[] row = new String[] { product.getID().toString(), product.getName(), product.getPrice().toString(),
					product.getDiscount().toString(), product.getQuanty().toString(),
					productCategoryServiceImpl.GetProductCategory(product.getProductCategoryId()).getName(),
					productStateServiceImpl.GetProductState(product.getProductStateId()).getName(),
					supplierServiceImpl.GetSupplier(product.getSupplierId()).getName(),
					product.getCreateAt().toString(), product.getUpdateAt().toString() };
			writer.writeNext(row);
		}
		writer.close();

		return new ModelAndView(String.format("redirect:/quan-tri/tai-xuong-file.csv?filename=%s", fileName));
	}

	@RequestMapping(value = "quan-tri/tai-xuong-file.xlsx", method = RequestMethod.GET)
	public HttpEntity<ByteArrayResource> GetFileXLSX(HttpServletRequest httpServletRequest,
			@RequestParam(value = "filename", required = true) String fileName) throws IOException {
		Object obj = httpServletRequest.getSession().getAttribute("loginState");
		if (obj == null)
			return null;

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return null;

		ServletContext servletContext = httpServletRequest.getServletContext();
		InputStream in = servletContext.getResourceAsStream(String.format("/file-upload/xlsx/%s", fileName));
		HttpHeaders header = new HttpHeaders();
		header.setContentType(new MediaType("application", "force-download"));
		header.set(HttpHeaders.CONTENT_DISPOSITION, String.format("attachment; filename=%s", fileName));
		byte[] byteArray = IOUtils.toByteArray(in);
		return new HttpEntity<>(new ByteArrayResource(byteArray), header);
	}

	@RequestMapping(value = "quan-tri/tai-xuong-file.csv", method = RequestMethod.GET)
	public HttpEntity<ByteArrayResource> GetFileCSV(HttpServletRequest httpServletRequest,
			@RequestParam(value = "filename", required = true) String fileName) throws IOException {
		Object obj = httpServletRequest.getSession().getAttribute("loginState");
		if (obj == null)
			return null;

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return null;

		ServletContext servletContext = httpServletRequest.getServletContext();
		InputStream in = servletContext.getResourceAsStream(String.format("/file-upload/csv/%s", fileName));
		HttpHeaders header = new HttpHeaders();
		header.setContentType(new MediaType("application", "force-download"));
		header.set(HttpHeaders.CONTENT_DISPOSITION, String.format("attachment; filename=%s", fileName));
		byte[] byteArray = IOUtils.toByteArray(in);
		return new HttpEntity<>(new ByteArrayResource(byteArray), header);
	}

	@RequestMapping(value = { "quan-tri/tao-moi-san-pham",
			"quan-tri/tao-moi-san-pham/{message}" }, method = RequestMethod.GET)
	public ModelAndView CreateProduct(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/create-product");
		modelAndView.addObject("product", new Product());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		modelAndView.addObject("productCategories", productCategoryServiceImpl.GetProductCategories());
		modelAndView.addObject("productStates", productStateServiceImpl.GetProductStates());
		modelAndView.addObject("suppliers", supplierServiceImpl.GetSuppliers());
		if (message != null) {
			if (message.equals("add-success"))
				modelAndView.addObject("state", "Thêm thành công");
			else if (message.equals("add-failed"))
				modelAndView.addObject("state", "Thêm thất bại");
			else
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}

	@RequestMapping(value = "quan-tri/tao-moi-san-pham", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateProduct(HttpSession httpSession, @ModelAttribute("product") Product product,
			BindingResult bindingResult, ProductValidator productValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		productValidator.validate(product, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/create-product");
			modelAndView.addObject("product", product);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			modelAndView.addObject("productCategories", productCategoryServiceImpl.GetProductCategories());
			modelAndView.addObject("productStates", productStateServiceImpl.GetProductStates());
			modelAndView.addObject("suppliers", supplierServiceImpl.GetSuppliers());
			return modelAndView;
		}

		if (productServiceImpl.CreateProduct(product))
			return new ModelAndView("redirect:/quan-tri/tao-moi-san-pham/add-success");

		return new ModelAndView("redirect:/quan-tri/tao-moi-san-pham/add-failed");
	}

	@RequestMapping(value = { "quan-tri/chinh-sua-san-pham/{id}",
			"quan-tri/chinh-sua-san-pham/{id}/{message}" }, method = RequestMethod.GET)
	public ModelAndView UpdateProduct(HttpSession httpSession, @PathVariable BigDecimal id,
			@PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham");

		Product product = productServiceImpl.GetProduct(id);
		if (product == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/update-product");
		modelAndView.addObject("product", product);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		modelAndView.addObject("productCategories", productCategoryServiceImpl.GetProductCategories());
		modelAndView.addObject("productStates", productStateServiceImpl.GetProductStates());
		modelAndView.addObject("suppliers", supplierServiceImpl.GetSuppliers());
		if (message != null) {
			if (message.equals("edit-success"))
				modelAndView.addObject("state", "Chỉnh sửa thành công");
			else if (message.equals("edit-failed"))
				modelAndView.addObject("state", "Chỉnh sửa thất bại");
			else
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}

	@RequestMapping(value = "quan-tri/chinh-sua-san-pham/{id}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateProduct(HttpSession httpSession, @ModelAttribute("product") Product product,
			BindingResult bindingResult, ProductValidator productValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		productValidator.validate(product, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/update-product");
			modelAndView.addObject("product", product);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			modelAndView.addObject("productCategories", productCategoryServiceImpl.GetProductCategories());
			modelAndView.addObject("productStates", productStateServiceImpl.GetProductStates());
			modelAndView.addObject("suppliers", supplierServiceImpl.GetSuppliers());
			return modelAndView;
		}

		if (productServiceImpl.UpdateProduct(product))
			return new ModelAndView("redirect:/quan-tri/chinh-sua-san-pham/{id}/edit-success");

		return new ModelAndView("redirect:/quan-tri/chinh-sua-san-pham/{id}/edit-failed");
	}

	@RequestMapping(value = "quan-tri/xoa-san-pham", method = RequestMethod.POST)
	public ModelAndView DeleteProduct(HttpSession httpSession,
			@RequestParam(value = "id", required = true) BigDecimal id) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham");

		if (productServiceImpl.DeleteProduct(id))
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham/delete-success");

		return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham/delete-failed");
	}
}
