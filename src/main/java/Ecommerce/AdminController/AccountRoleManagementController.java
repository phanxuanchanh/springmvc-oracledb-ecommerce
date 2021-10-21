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

import Ecommerce.Entity.AccountRole;
import Ecommerce.Service.AccountRoleServiceImpl;
import Ecommerce.Validator.AccountRoleValidator;

@Controller
public class AccountRoleManagementController {
	@Autowired
	private AccountRoleServiceImpl accountRoleServiceImpl;
	
	@RequestMapping(value = { "quan-tri/danh-sach-quyen-han", "quan-tri/danh-sach-quyen-han/{message}" }, method = RequestMethod.GET)
	public ModelAndView AccountRoleList(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/account-role-list");
		modelAndView.addObject("accountRoles", accountRoleServiceImpl.GetAccountRoles());
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

	@RequestMapping(value = "quan-tri/chi-tiet-quyen-han/{id}", method = RequestMethod.GET)
	public ModelAndView AccountRoleDetail(HttpSession httpSession, @PathVariable BigDecimal id) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-quyen-han");

		AccountRole accountRole = accountRoleServiceImpl.GetAccountRole(id);
		if (accountRole == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-quyen-han");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/account-role-detail");
		modelAndView.addObject("accountRole", accountRole);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		return modelAndView;
	}

	@RequestMapping(value = {"quan-tri/tao-moi-quyen-han", "quan-tri/tao-moi-quyen-han/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateAccountRole(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/create-account-role");
		modelAndView.addObject("accountRole", new AccountRole());
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

	@RequestMapping(value = "quan-tri/tao-moi-quyen-han", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateAccountRole(HttpSession httpSession, @ModelAttribute("accountRole") AccountRole accountRole, 
			BindingResult bindingResult, AccountRoleValidator accountRoleValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		accountRoleValidator.validate(accountRole, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/create-account-role");
			modelAndView.addObject("accountRole", accountRole);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(accountRoleServiceImpl.CreateAccountRole(accountRole))
			return new ModelAndView("redirect:/quan-tri/tao-moi-quyen-han/add-success");
		
		return new ModelAndView("redirect:/quan-tri/tao-moi-quyen-han/add-failed");
	}

	@RequestMapping(value = {"quan-tri/chinh-sua-quyen-han/{id}", "quan-tri/chinh-sua-quyen-han/{id}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateAccountRole(HttpSession httpSession, @PathVariable BigDecimal id, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-quyen-han");

		AccountRole accountRole = accountRoleServiceImpl.GetAccountRole(id);
		if (accountRole == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-quyen-han");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/update-account-role");
		modelAndView.addObject("accountRole", accountRole);
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
	
	@RequestMapping(value = "quan-tri/chinh-sua-quyen-han/{id}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateAccountRole(HttpSession httpSession, @ModelAttribute("accountRole") AccountRole accountRole, 
			BindingResult bindingResult, AccountRoleValidator accountRoleValidator) {	
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		accountRoleValidator.validate(accountRole, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/update-account-role");
			modelAndView.addObject("accountRole", accountRole);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername);
			return modelAndView;
		}

		if(accountRoleServiceImpl.UpdateAccountRole(accountRole))
			return new ModelAndView("redirect:/quan-tri/chinh-sua-quyen-han/{id}/edit-success");
		
		return new ModelAndView("redirect:/quan-tri/chinh-sua-quyen-han/{id}/edit-failed");
	}

	@RequestMapping(value = "quan-tri/xoa-quyen-han", method = RequestMethod.POST)
	public ModelAndView DeleteAccountRole(HttpSession httpSession, @RequestParam(value = "id", required = true) BigDecimal id) {		
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if(id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-quyen-han");
		
		if(accountRoleServiceImpl.DeleteAccountRole(id))
			return new ModelAndView("redirect:/quan-tri/danh-sach-quyen-han/delete-success");
		
		return new ModelAndView("redirect:/quan-tri/danh-sach-quyen-han/delete-failed");
	}
}
