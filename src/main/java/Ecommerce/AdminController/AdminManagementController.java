package Ecommerce.AdminController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.DTO.AdminInfo;
import Ecommerce.DTO.AdminLogin;
import Ecommerce.Service.AdminServiceImpl;
import Ecommerce.Validator.AdminLoginValidator;

@Controller
public class AdminManagementController {
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	
	@RequestMapping(value = "tai-khoan-quan-tri/dang-nhap", method = RequestMethod.GET)
	public ModelAndView Login(HttpSession httpSession) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj != null)
			return new ModelAndView("redirect:/");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/login");
		modelAndView.addObject("adminLogin", new AdminLogin());
		return modelAndView;
	}

	@RequestMapping(value = "tai-khoan-quan-tri/dang-nhap", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView Login(HttpSession httpSession, @ModelAttribute("adminLogin") AdminLogin adminLogin, BindingResult bindingResult,
			AdminLoginValidator adminLoginValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj != null)
			return new ModelAndView("redirect:/");
		
		adminLoginValidator.validate(adminLogin, bindingResult);
		if (bindingResult.hasErrors())
			return new ModelAndView("admin/login", "adminLogin", adminLogin);

		if (adminServiceImpl.Login(adminLogin)) {
			AdminInfo adminInfo = adminServiceImpl.GetAdminInfo(adminLogin.getUsername());
			httpSession.setAttribute("loginState", "logged:true;username:" + adminLogin.getUsername() + ";role:" + adminInfo.getAccountRole().getName());
			if(adminInfo.getAccountRole().getName().equals("Admin"))
				return new ModelAndView("redirect:/quan-tri/tong-quan");
			return new ModelAndView("redirect:/");
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/login");
		modelAndView.addObject("adminLogin", new AdminLogin());
		modelAndView.addObject("state", "Đăng nhập không thành công, có thể dữ liệu không hợp lệ hoặc chưa tồn tại tài khoản này");
		return modelAndView;
	}
}
