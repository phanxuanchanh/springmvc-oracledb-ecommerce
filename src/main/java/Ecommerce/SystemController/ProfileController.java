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
import Ecommerce.SystemService.ProfileServiceImpl;
import Ecommerce.SystemValidator.ProfileInputValidator;

@Controller
public class ProfileController {
	@Autowired
	private ProfileServiceImpl profileServiceImpl;
	
	@RequestMapping(value = "he-thong/dba_profiles", method = RequestMethod.GET)
	public ModelAndView ProfileList(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/profile-list");
		modelAndView.addObject("profiles", profileServiceImpl.GetProfiles());
		return modelAndView;
	}
	
	@RequestMapping(value = {"he-thong/tao-moi-profile", "he-thong/tao-moi-profile/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateProfile(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/create-profile");
		modelAndView.addObject("profileInput", new ProfileInput());
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
		profileInputValidator.validate(profileInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/create-profile");
			modelAndView.addObject("profileInput", profileInput);
			return modelAndView;
		}

		if(profileServiceImpl.CreateProfile(profileInput))
			return new ModelAndView("redirect:/he-thong/tao-moi-profile/add-success");
		
		return new ModelAndView("redirect:/he-thong/tao-moi-profile/add-failed");
	}
}
