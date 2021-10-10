package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemService.ProfileServiceImpl;

@Controller
public class ProfileController {
	@Autowired
	private ProfileServiceImpl profileServiceImpl;
	
	@RequestMapping(value = "he-thong/profiles", method = RequestMethod.GET)
	public ModelAndView ProcessList(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/profile-list");
		modelAndView.addObject("profiles", profileServiceImpl.GetProfiles());
		return modelAndView;
	}
}
