package Ecommerce.AdminController;

import java.math.BigDecimal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.Entity.Product;
import Ecommerce.Service.ProductServiceImpl;
import Ecommerce.Validator.ProductValidator;

@Controller
public class ProductManagementController {
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@RequestMapping(value = { "quan-tri/danh-sach-san-pham", "quan-tri/danh-sach-san-pham/{message}" }, method = RequestMethod.GET)
	public ModelAndView ProductList(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/product-list");
		modelAndView.addObject("products", productServiceImpl.GetProducts());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		if(message != null) {
			if(message.equals("delete-success"))
				modelAndView.addObject("state", "Xóa thành công");
			else if(message.equals("delete-failed"))
				modelAndView.addObject("state", "Xóa thất bại");
			else 
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}

	@RequestMapping(value = "quan-tri/chi-tiet-san-pham/{id}", method = RequestMethod.GET)
	public ModelAndView ProductDetail(HttpSession httpSession, @PathVariable BigDecimal id) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
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
		return modelAndView;
	}

	@RequestMapping(value = {"quan-tri/tao-moi-san-pham", "quan-tri/tao-moi-san-pham/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateProduct(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/create-product");
		modelAndView.addObject("product", new Product());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		if(message != null) {
			if(message.equals("add-success"))
				modelAndView.addObject("state", "Thêm thành công");
			else if(message.equals("add-failed"))
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
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		productValidator.validate(product, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/create-product");
			modelAndView.addObject("product", product);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(productServiceImpl.CreateProduct(product))
			return new ModelAndView("redirect:/quan-tri/tao-moi-san-pham/add-success");
		
		return new ModelAndView("redirect:/quan-tri/tao-moi-san-pham/add-failed");
	}

	@RequestMapping(value = {"quan-tri/chinh-sua-san-pham/{id}", "quan-tri/chinh-sua-san-pham/{id}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateProduct(HttpSession httpSession, @PathVariable BigDecimal id, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
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
		if(message != null) {
			if(message.equals("edit-success"))
				modelAndView.addObject("state", "Chỉnh sửa thành công");
			else if(message.equals("edit-failed"))
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
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		productValidator.validate(product, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/update-product");
			modelAndView.addObject("product", product);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(productServiceImpl.UpdateProduct(product))
			return new ModelAndView("redirect:/quan-tri/chinh-sua-san-pham/{id}/edit-success");
		
		return new ModelAndView("redirect:/quan-tri/chinh-sua-san-pham/{id}/edit-failed");
	}

	@RequestMapping(value = "quan-tri/xoa-san-pham", method = RequestMethod.POST)
	public ModelAndView DeleteProduct(HttpSession httpSession, @RequestParam(value = "id", required = true) BigDecimal id) {		
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if(id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham");
		
		if(productServiceImpl.DeleteProduct(id))
			return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham/delete-success");
		
		return new ModelAndView("redirect:/quan-tri/danh-sach-san-pham/delete-failed");
	}
}
