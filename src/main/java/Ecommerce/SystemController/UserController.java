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
import Ecommerce.SystemEntity.User;
import Ecommerce.SystemService.ProfileServiceImpl;
import Ecommerce.SystemService.TablespaceServiceImpl;
import Ecommerce.SystemService.UserServiceImpl;
import Ecommerce.SystemValidator.UserInputValidator;

@Controller
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Autowired
	private TablespaceServiceImpl tablespaceServiceImpl;
	
	@Autowired
	private ProfileServiceImpl profileServiceImpl;
	
	@RequestMapping(value = {"he-thong/dba_users", "he-thong/dba_users/{message}"}, method = RequestMethod.GET)
	public ModelAndView UserList(HttpSession httpSession, @PathVariable(required = false) String message,  @RequestParam(value = "username_keyword", required = false) String usernameKeyword) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/user-list");
		if(usernameKeyword == null)
			modelAndView.addObject("dba_users", userServiceImpl.GetUsers());
		else 
			modelAndView.addObject("dba_users", userServiceImpl.GetUsers_ByUsernameKeyword(usernameKeyword));
		
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
		if (username == null)
			return new ModelAndView("redirect:/he-thong/dba_users");

		User user = userServiceImpl.GetUser(username);
		if (user == null)
			return new ModelAndView("redirect:/he-thong/dba_users");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/user-detail");
		modelAndView.addObject("dba_user", user);
		return modelAndView;
	}
	
	@RequestMapping(value = {"he-thong/tao-moi-tai-khoan-user", "he-thong/tao-moi-tai-khoan-user/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateUser(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/create-user");
		modelAndView.addObject("userInput", new UserInput());
		modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
		modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
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
		userInputValidator.validate(userInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/create-user");
			modelAndView.addObject("userInput", userInput);
			modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
			modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
			return modelAndView;
		}

		if(userServiceImpl.CreateUser(userInput))
			return new ModelAndView("redirect:/he-thong/tao-moi-tai-khoan-user/add-success");
		
		return new ModelAndView("redirect:/he-thong/tao-moi-tai-khoan-user/add-failed");
	}
	
	@RequestMapping(value = {"he-thong/chinh-sua-tai-khoan-user/{username}", "he-thong/chinh-sua-tai-khoan-user/{username}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateUser(HttpSession httpSession, @PathVariable(required = true) String username, @PathVariable(required = false) String message) {
		User user = userServiceImpl.GetUser(username);
		if (user == null)
			return new ModelAndView("redirect:/he-thong/dba_users");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/update-user");
		modelAndView.addObject("userInput", new UserInput(user.getUsername(), null, user.getDefault_tablespace(), null, user.getProfile()));
		modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
		modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
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
	public ModelAndView UpdateProfile(HttpSession httpSession, @ModelAttribute("userInput") UserInput userInput, 
			BindingResult bindingResult, UserInputValidator userInputValidator) {
		userInputValidator.validate(userInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/update-user");
			modelAndView.addObject("userInput", userInput);
			modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
			modelAndView.addObject("profiles", profileServiceImpl.GetProfiles_Distinct());
			return modelAndView;
		}

		if(userServiceImpl.UpdateUser(userInput))
			return new ModelAndView("redirect:/he-thong/chinh-sua-tai-khoan-user/{username}/edit-success");
		
		return new ModelAndView("redirect:/he-thong/chinh-sua-tai-khoan-user/{username}/edit-failed");
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
