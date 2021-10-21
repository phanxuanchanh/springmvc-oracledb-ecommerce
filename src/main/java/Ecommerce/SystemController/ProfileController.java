package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemDTO.ProfileInput;
import Ecommerce.SystemDTO.ProfileInput2;
import Ecommerce.SystemService.ProfileServiceImpl;
import Ecommerce.SystemValidator.ProfileInput2Validator;
import Ecommerce.SystemValidator.ProfileInputValidator;

@Controller
public class ProfileController {
	@Autowired
	private ProfileServiceImpl profileServiceImpl;
	
	@RequestMapping(value = "he-thong/dba_profiles", method = RequestMethod.GET)
	public ModelAndView ProfileList(HttpSession httpSession) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/profile-list");
		modelAndView.addObject("profiles", profileServiceImpl.GetProfiles());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
	
	@RequestMapping(value = {"he-thong/tao-moi-profile", "he-thong/tao-moi-profile/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateProfile(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/create-profile");
		modelAndView.addObject("profileInput", new ProfileInput());
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

	@RequestMapping(value = "he-thong/tao-moi-profile", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateProfile(HttpSession httpSession, @ModelAttribute("profileInput") ProfileInput profileInput, 
			BindingResult bindingResult, ProfileInputValidator profileInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		profileInputValidator.validate(profileInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/create-profile");
			modelAndView.addObject("profileInput", profileInput);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(profileServiceImpl.CreateProfile(profileInput))
			return new ModelAndView("redirect:/he-thong/tao-moi-profile/add-success");
		
		return new ModelAndView("redirect:/he-thong/tao-moi-profile/add-failed");
	}
	
	@RequestMapping(value = {"he-thong/chinh-sua-profile", "he-thong/chinh-sua-profile/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateProfile(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/update-profile");
		modelAndView.addObject("profileInput", new ProfileInput());
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
	
	@RequestMapping(value = "he-thong/chinh-sua-profile", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateProfile(HttpSession httpSession, @ModelAttribute("profileInput") ProfileInput profileInput, 
			BindingResult bindingResult, ProfileInputValidator profileInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		profileInputValidator.validate(profileInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/update-profile");
			modelAndView.addObject("profileInput", profileInput);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(profileServiceImpl.UpdateProfile(profileInput))
			return new ModelAndView("redirect:/he-thong/chinh-sua-profile/edit-success");
		
		return new ModelAndView("redirect:/he-thong/chinh-sua-profile/edit-failed");
	}
	
	@RequestMapping(value = {"he-thong/xoa-profile", "he-thong/xoa-profile/{message}"}, method = RequestMethod.GET)
	public ModelAndView DeleteProfile(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/delete-profile");
		modelAndView.addObject("profileInput2", new ProfileInput());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
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
	
	@RequestMapping(value = "he-thong/xoa-profile", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView DeleteProfile(HttpSession httpSession, @ModelAttribute("profileInput2") ProfileInput2 profileInput2, 
			BindingResult bindingResult, ProfileInput2Validator profileInput2Validator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		profileInput2Validator.validate(profileInput2, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/delete-profile");
			modelAndView.addObject("profileInput2", profileInput2);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(profileServiceImpl.DeleteProfile(profileInput2.getProfile_name()))
			return new ModelAndView("redirect:/he-thong/xoa-profile/delete-success");
		
		return new ModelAndView("redirect:/he-thong/xoa-profile/delete-failed");
	}
}
