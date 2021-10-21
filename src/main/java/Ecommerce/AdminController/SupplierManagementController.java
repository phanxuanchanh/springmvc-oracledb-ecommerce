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

import Ecommerce.Entity.Supplier;
import Ecommerce.Service.SupplierServiceImpl;
import Ecommerce.Validator.SupplierValidator;

@Controller
public class SupplierManagementController {
	@Autowired
	private SupplierServiceImpl supplierServiceImpl;
	
	@RequestMapping(value = { "quan-tri/danh-sach-nha-cung-cap", "quan-tri/danh-sach-nha-cung-cap/{message}" }, method = RequestMethod.GET)
	public ModelAndView SupplierList(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/supplier-list");
		modelAndView.addObject("suppliers", supplierServiceImpl.GetSuppliers());
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

	@RequestMapping(value = "quan-tri/chi-tiet-nha-cung-cap/{id}", method = RequestMethod.GET)
	public ModelAndView SupplierDetail(HttpSession httpSession, @PathVariable BigDecimal id) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-nha-cung-cap");

		Supplier supplier = supplierServiceImpl.GetSupplier(id);
		if (supplier == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-nha-cung-cap");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/supplier-detail");
		modelAndView.addObject("supplier", supplier);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		return modelAndView;
	}

	@RequestMapping(value = {"quan-tri/tao-moi-nha-cung-cap", "quan-tri/tao-moi-nha-cung-cap/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateSupplier(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/create-supplier");
		modelAndView.addObject("supplier", new Supplier());
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

	@RequestMapping(value = "quan-tri/tao-moi-nha-cung-cap", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateSupplier(HttpSession httpSession, @ModelAttribute("supplier") Supplier supplier, 
			BindingResult bindingResult, SupplierValidator supplierValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		supplierValidator.validate(supplier, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/create-supplier");
			modelAndView.addObject("supplier", supplier);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(supplierServiceImpl.CreateSupplier(supplier))
			return new ModelAndView("redirect:/quan-tri/tao-moi-nha-cung-cap/add-success");
		
		return new ModelAndView("redirect:/quan-tri/tao-moi-nha-cung-cap/add-failed");
	}

	@RequestMapping(value = {"quan-tri/chinh-sua-nha-cung-cap/{id}", "quan-tri/chinh-sua-nha-cung-cap/{id}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateSupplier(HttpSession httpSession, @PathVariable BigDecimal id, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-nha-cung-cap");

		Supplier supplier = supplierServiceImpl.GetSupplier(id);
		if (supplier == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-nha-cung-cap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/update-supplier");
		modelAndView.addObject("supplier", supplier);
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
	
	@RequestMapping(value = "quan-tri/chinh-sua-nha-cung-cap/{id}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateSupplier(HttpSession httpSession, @ModelAttribute("supplier") Supplier supplier, 
			BindingResult bindingResult, SupplierValidator supplierValidator) {	
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		supplierValidator.validate(supplier, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/update-supplier");
			modelAndView.addObject("supplier", supplier);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(supplierServiceImpl.UpdateSupplier(supplier))
			return new ModelAndView("redirect:/quan-tri/chinh-sua-nha-cung-cap/{id}/edit-success");
		
		return new ModelAndView("redirect:/quan-tri/chinh-sua-nha-cung-cap/{id}/edit-failed");
	}

	@RequestMapping(value = "quan-tri/xoa-nha-cung-cap", method = RequestMethod.POST)
	public ModelAndView DeleteSupplier(HttpSession httpSession, @RequestParam(value = "id", required = true) BigDecimal id) {		
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if(id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-nha-cung-cap");
		
		if(supplierServiceImpl.DeleteSupplier(id))
			return new ModelAndView("redirect:/quan-tri/danh-sach-nha-cung-cap/delete-success");
		
		return new ModelAndView("redirect:/quan-tri/danh-sach-nha-cung-cap/delete-failed");
	}
}
