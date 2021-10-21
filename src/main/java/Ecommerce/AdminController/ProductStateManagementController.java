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

import Ecommerce.Entity.ProductState;
import Ecommerce.Service.ProductStateServiceImpl;
import Ecommerce.Validator.ProductStateValidator;

@Controller
public class ProductStateManagementController {
	@Autowired
	private ProductStateServiceImpl productStateServiceImpl;
	
	@RequestMapping(value = { "quan-tri/danh-sach-trang-thai-san-pham", "quan-tri/danh-sach-trang-thai-san-pham/{message}" }, method = RequestMethod.GET)
	public ModelAndView ProductStateList(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/product-state-list");
		modelAndView.addObject("productStates", productStateServiceImpl.GetProductStates());
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

	@RequestMapping(value = "quan-tri/chi-tiet-trang-thai-san-pham/{id}", method = RequestMethod.GET)
	public ModelAndView ProductStateDetail(HttpSession httpSession, @PathVariable BigDecimal id) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-san-pham");

		ProductState productState = productStateServiceImpl.GetProductState(id);
		if (productState == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-san-pham");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/product-state-detail");
		modelAndView.addObject("productState", productState);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		return modelAndView;
	}

	@RequestMapping(value = {"quan-tri/tao-moi-trang-thai-san-pham", "quan-tri/tao-moi-trang-thai-san-pham/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateProductState(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/create-product-state");
		modelAndView.addObject("productState", new ProductState());
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

	@RequestMapping(value = "quan-tri/tao-moi-trang-thai-san-pham", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateProductState(HttpSession httpSession, @ModelAttribute("productState") ProductState productState, 
			BindingResult bindingResult, ProductStateValidator productStateValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		productStateValidator.validate(productState, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/create-product-state");
			modelAndView.addObject("productState", productState);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(productStateServiceImpl.CreateProductState(productState))
			return new ModelAndView("redirect:/quan-tri/tao-moi-trang-thai-san-pham/add-success");
		
		return new ModelAndView("redirect:/quan-tri/tao-moi-trang-thai-san-pham/add-failed");
	}

	@RequestMapping(value = {"quan-tri/chinh-sua-trang-thai-san-pham/{id}", "quan-tri/chinh-sua-trang-thai-san-pham/{id}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateProductState(HttpSession httpSession, @PathVariable BigDecimal id, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-san-pham");

		ProductState productState = productStateServiceImpl.GetProductState(id);
		if (productState == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-san-pham");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/update-product-state");
		modelAndView.addObject("productState", productState);
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
	
	@RequestMapping(value = "quan-tri/chinh-sua-trang-thai-san-pham/{id}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateProductState(HttpSession httpSession, @ModelAttribute("productState") ProductState productState, 
			BindingResult bindingResult, ProductStateValidator productStateValidator) {	
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		productStateValidator.validate(productState, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/update-product-state");
			modelAndView.addObject("productState", productState);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(productStateServiceImpl.UpdateProductState(productState))
			return new ModelAndView("redirect:/quan-tri/chinh-sua-trang-thai-san-pham/{id}/edit-success");
		
		return new ModelAndView("redirect:/quan-tri/chinh-sua-trang-thai-san-pham/{id}/edit-failed");
	}

	@RequestMapping(value = "quan-tri/xoa-trang-thai-san-pham", method = RequestMethod.POST)
	public ModelAndView DeleteProductState(HttpSession httpSession, @RequestParam(value = "id", required = true) BigDecimal id) {		
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if(id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-san-pham");
		
		if(productStateServiceImpl.DeleteProductState(id))
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-san-pham/delete-success");
		
		return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-san-pham/delete-failed");
	}
}
