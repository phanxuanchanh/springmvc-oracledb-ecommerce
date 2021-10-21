package Ecommerce.SystemController;

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

import Ecommerce.SystemDTO.RoleInput;
import Ecommerce.SystemDTO.RolePermissionForm;
import Ecommerce.SystemEntity.Role;
import Ecommerce.SystemService.ObjectPrivilegeServiceImpl;
import Ecommerce.SystemService.RoleServiceImpl;
import Ecommerce.SystemService.SystemPrivilegeServiceImpl;
import Ecommerce.SystemValidator.RoleInputValidator;
import Ecommerce.SystemValidator.RolePermissionFormValidator;

@Controller
public class RoleController {
	@Autowired
	private RoleServiceImpl roleServiceImpl;
	
	@Autowired
	private SystemPrivilegeServiceImpl systemPrivilegeServiceImpl;
	
	@Autowired
	private ObjectPrivilegeServiceImpl objectPrivilegeServiceImpl;
	
	@RequestMapping(value = {"he-thong/dba_roles", "he-thong/dba_roles/{message}"}, method = RequestMethod.GET)
	public ModelAndView RoleList(HttpSession httpSession, @PathVariable(required = false) String message,  @RequestParam(value = "role_name_keyword", required = false) String roleNameKeyword) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/role-list");
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		
		if(roleNameKeyword == null)
			modelAndView.addObject("roles", roleServiceImpl.GetRoles());
		else 
			modelAndView.addObject("roles", roleServiceImpl.GetRoles_ByRoleNameKeyword(roleNameKeyword));
		
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
	
	@RequestMapping(value = "he-thong/chi-tiet-role/{roleId}", method = RequestMethod.GET)
	public ModelAndView RoleDetail(HttpSession httpSession, @PathVariable BigDecimal roleId) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (roleId.intValue() <= 0)
			return new ModelAndView("redirect:/he-thong/dba_roles");

		Role role = roleServiceImpl.GetRole(roleId);
		if (role == null)
			return new ModelAndView("redirect:/he-thong/dba_roles");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/role-detail");
		modelAndView.addObject("role", role);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
	
	@RequestMapping(value = {"he-thong/tao-moi-role", "he-thong/tao-moi-role/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateRole(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/create-role");
		modelAndView.addObject("roleInput", new RoleInput());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
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

	@RequestMapping(value = "he-thong/tao-moi-role", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateUser(HttpSession httpSession, @ModelAttribute("roleInput") RoleInput roleInput, 
			BindingResult bindingResult, RoleInputValidator roleInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		roleInputValidator.validate(roleInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/create-role");
			modelAndView.addObject("roleInput", roleInput);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(roleServiceImpl.CreateRole(roleInput))
			return new ModelAndView("redirect:/he-thong/tao-moi-role/add-success");
		
		return new ModelAndView("redirect:/he-thong/tao-moi-role/add-failed");
	}
	
	@RequestMapping(value = {"he-thong/chinh-sua-role/{roleName}", "he-thong/chinh-sua-role/{roleName}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateUser(HttpSession httpSession, @PathVariable(required = true) String roleName, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		Role role = roleServiceImpl.GetRole_ByRoleName(roleName);
		if (role == null)
			return new ModelAndView("redirect:/he-thong/dba_roles");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/update-role");
		modelAndView.addObject("roleInput", new RoleInput(roleName, null));
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
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
	
	@RequestMapping(value = "he-thong/chinh-sua-role/{roleName}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateUser(HttpSession httpSession, @ModelAttribute("roleInput") RoleInput roleInput, 
			BindingResult bindingResult, RoleInputValidator roleInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		roleInputValidator.validate(roleInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/update-role");
			modelAndView.addObject("roleInput", roleInput);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(roleServiceImpl.UpdateRole(roleInput))
			return new ModelAndView("redirect:/he-thong/chinh-sua-role/{roleName}/edit-success");
		
		return new ModelAndView("redirect:/he-thong/chinh-sua-role/{roleName}/edit-failed");
	}
	
	@RequestMapping(value = {"he-thong/gan-thu-hoi-quyen-role/{roleName}", "he-thong/gan-thu-hoi-quyen-role/{roleName}/{message}"}, method = RequestMethod.GET)
	public ModelAndView Grant_RevokePermissions(HttpSession httpSession, @PathVariable(required = true) String roleName, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		Role role = roleServiceImpl.GetRole_ByRoleName(roleName);
		if (role == null)
			return new ModelAndView("redirect:/he-thong/dba_roles");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/grant-revoke-permission_role");
		modelAndView.addObject("rolePermissionForm", new RolePermissionForm(roleName, null, null));
		modelAndView.addObject("systemPrivileges", systemPrivilegeServiceImpl.GetSystemPrivileges_ByGrantee(roleName));
		modelAndView.addObject("objectPrivileges", objectPrivilegeServiceImpl.GetObjectPrivileges_ByGrantee(roleName));
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		if(message != null) {
			if(message.equals("grant-success"))
				modelAndView.addObject("state", "Gán quyền thành công");
			else if(message.equals("grant-failed"))
				modelAndView.addObject("state", "Gán quyền thất bại");
			else if(message.equals("revoke-success"))
				modelAndView.addObject("state", "Thu hồi quyền thành công");
			else if(message.equals("revoke-failed"))
				modelAndView.addObject("state", "Thu hồi quyền thất bại");
			else 
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/gan-thu-hoi-quyen-role/{roleName}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView Grant_RevokePermissions(HttpSession httpSession, @ModelAttribute("rolePermissionForm") RolePermissionForm rolePermissionForm,
			BindingResult bindingResult, RolePermissionFormValidator rolePermissionFormValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		rolePermissionFormValidator.validate(rolePermissionForm, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/grant-revoke-permission_role");
			modelAndView.addObject("rolePermissionForm", rolePermissionForm);
			modelAndView.addObject("systemPrivileges", systemPrivilegeServiceImpl.GetSystemPrivileges_ByGrantee(rolePermissionForm.getRole_name()));
			modelAndView.addObject("objectPrivileges", objectPrivilegeServiceImpl.GetObjectPrivileges_ByGrantee(rolePermissionForm.getRole_name()));
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}
		
		if(rolePermissionForm.getOption().equals("grant")) {
			if(roleServiceImpl.GrantPermissions(rolePermissionForm))
				return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-role/{roleName}/grant-success");
			
			return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-role/{roleName}/grant-failed");
		}else {
			if(roleServiceImpl.RevokePermissions(rolePermissionForm))
				return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-role/{roleName}/revoke-success");
			
			return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-role/{roleName}/revoke-failed");
		}
	}
	
	@RequestMapping(value = "he-thong/xoa-role", method = RequestMethod.POST)
	public ModelAndView DeleteUser(HttpSession httpSession, @RequestParam(value = "roleName", required = true) String roleName) {	
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if(roleName == null)
			return new ModelAndView("redirect:/he-thong/dba_roles");
		
		if(roleServiceImpl.DeleteRole(roleName))
			return new ModelAndView("redirect:/he-thong/dba_roles/delete-success");
		
		return new ModelAndView("redirect:/he-thong/dba_roles/delete-failed");
	}
}
