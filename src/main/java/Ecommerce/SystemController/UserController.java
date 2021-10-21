package Ecommerce.SystemController;

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

import Ecommerce.SystemDTO.UserInput;
import Ecommerce.SystemDTO.UserPermissionForm;
import Ecommerce.SystemEntity.User;
import Ecommerce.SystemService.ObjectPrivilegeServiceImpl;
import Ecommerce.SystemService.ProfileServiceImpl;
import Ecommerce.SystemService.SystemPrivilegeServiceImpl;
import Ecommerce.SystemService.TablespaceServiceImpl;
import Ecommerce.SystemService.UserServiceImpl;
import Ecommerce.SystemValidator.UserInputValidator;
import Ecommerce.SystemValidator.UserPermissionFormValidator;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private TablespaceServiceImpl tablespaceServiceImpl;
	
	@Autowired
	private ProfileServiceImpl profileServiceImpl;
	
	@Autowired
	private SystemPrivilegeServiceImpl systemPrivilegeServiceImpl;
	
	@Autowired
	private ObjectPrivilegeServiceImpl objectPrivilegeServiceImpl;
	
	@RequestMapping(value = {"he-thong/dba_users", "he-thong/dba_users/{message}"}, method = RequestMethod.GET)
	public ModelAndView UserList(HttpSession httpSession, @PathVariable(required = false) String message,  @RequestParam(value = "username_keyword", required = false) String usernameKeyword) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/user-list");
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		if(usernameKeyword == null)
			modelAndView.addObject("users", userServiceImpl.GetUsers());
		else 
			modelAndView.addObject("users", userServiceImpl.GetUsers_ByUsernameKeyword(usernameKeyword));
		
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
	
	@RequestMapping(value = "he-thong/chi-tiet-tai-khoan-user/{username}", method = RequestMethod.GET)
	public ModelAndView UserDetail(HttpSession httpSession, @PathVariable String username) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (username == null)
			return new ModelAndView("redirect:/he-thong/dba_users");

		User user = userServiceImpl.GetUser(username);
		if (user == null)
			return new ModelAndView("redirect:/he-thong/dba_users");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/user-detail");
		modelAndView.addObject("user", user);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
	
	@RequestMapping(value = {"he-thong/tao-moi-tai-khoan-user", "he-thong/tao-moi-tai-khoan-user/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateUser(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/create-user");
		modelAndView.addObject("userInput", new UserInput());
		modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
		modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
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

	@RequestMapping(value = "he-thong/tao-moi-tai-khoan-user", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateUser(HttpSession httpSession, @ModelAttribute("tablespaceInput") UserInput userInput, 
			BindingResult bindingResult, UserInputValidator userInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		userInputValidator.validate(userInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/create-user");
			modelAndView.addObject("userInput", userInput);
			modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
			modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(userServiceImpl.CreateUser(userInput))
			return new ModelAndView("redirect:/he-thong/tao-moi-tai-khoan-user/add-success");
		
		return new ModelAndView("redirect:/he-thong/tao-moi-tai-khoan-user/add-failed");
	}
	
	@RequestMapping(value = {"he-thong/chinh-sua-tai-khoan-user/{username}", "he-thong/chinh-sua-tai-khoan-user/{username}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateUser(HttpSession httpSession, @PathVariable(required = true) String username, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		User user = userServiceImpl.GetUser(username);
		if (user == null)
			return new ModelAndView("redirect:/he-thong/dba_users");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/update-user");
		modelAndView.addObject("userInput", new UserInput(user.getUsername(), null, user.getDefault_tablespace(), null, user.getProfile()));
		modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
		modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
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
	
	@RequestMapping(value = "he-thong/chinh-sua-tai-khoan-user/{username}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateUser(HttpSession httpSession, @ModelAttribute("userInput") UserInput userInput, 
			BindingResult bindingResult, UserInputValidator userInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		userInputValidator.validate(userInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/update-user");
			modelAndView.addObject("userInput", userInput);
			modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
			modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(userServiceImpl.UpdateUser(userInput))
			return new ModelAndView("redirect:/he-thong/chinh-sua-tai-khoan-user/{username}/edit-success");
		
		return new ModelAndView("redirect:/he-thong/chinh-sua-tai-khoan-user/{username}/edit-failed");
	}
	
	@RequestMapping(value = {"he-thong/gan-thu-hoi-quyen-tai-khoan-user/{username}", "he-thong/gan-thu-hoi-quyen-tai-khoan-user/{username}/{message}"}, method = RequestMethod.GET)
	public ModelAndView Grant_RevokePermissions(HttpSession httpSession, @PathVariable(required = true) String username, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		User user = userServiceImpl.GetUser(username);
		if (user == null)
			return new ModelAndView("redirect:/he-thong/dba_users");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/grant-revoke-permission_user");
		modelAndView.addObject("userPermissionForm", new UserPermissionForm(username, null, null));
		modelAndView.addObject("systemPrivileges", systemPrivilegeServiceImpl.GetSystemPrivileges_ByGrantee(username));
		modelAndView.addObject("objectPrivileges", objectPrivilegeServiceImpl.GetObjectPrivileges_ByGrantee(username));
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
	
	@RequestMapping(value = "he-thong/gan-thu-hoi-quyen-tai-khoan-user/{username}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView Grant_RevokePermissions(HttpSession httpSession, @ModelAttribute("userPermissionForm") UserPermissionForm userPermissionForm,
			BindingResult bindingResult, UserPermissionFormValidator userPermissionFormValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		userPermissionFormValidator.validate(userPermissionForm, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/grant-revoke-permission_user");
			modelAndView.addObject("userPermissionForm", userPermissionForm);
			modelAndView.addObject("systemPrivileges", systemPrivilegeServiceImpl.GetSystemPrivileges_ByGrantee(userPermissionForm.getUsername()));
			modelAndView.addObject("objectPrivileges", objectPrivilegeServiceImpl.GetObjectPrivileges_ByGrantee(userPermissionForm.getUsername()));
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}
		
		if(userPermissionForm.getOption().equals("grant")) {
			if(userServiceImpl.GrantPermissions(userPermissionForm))
				return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-tai-khoan-user/{username}/grant-success");
			
			return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-tai-khoan-user/{username}/grant-failed");
		}else {
			if(userServiceImpl.RevokePermissions(userPermissionForm))
				return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-tai-khoan-user/{username}/revoke-success");
			
			return new ModelAndView("redirect:/he-thong/gan-thu-hoi-quyen-tai-khoan-user/{username}/revoke-failed");
		}
	}
	
	@RequestMapping(value = "he-thong/xoa-tai-khoan-user", method = RequestMethod.POST)
	public ModelAndView DeleteUser(HttpSession httpSession, @RequestParam(value = "username", required = true) String username) {		
		if(username == null)
			return new ModelAndView("redirect:/he-thong/dba_users");
		
		if(userServiceImpl.DeleteUser(username))
			return new ModelAndView("redirect:/he-thong/dba_users/delete-success");
		
		return new ModelAndView("redirect:/he-thong/dba_users/delete-failed");
	}
}
