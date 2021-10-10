package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemEntity.Dba_User;
import Ecommerce.SystemService.Dba_UserServiceImpl;

@Controller
public class Dba_UserController {
	@Autowired
	private Dba_UserServiceImpl dba_UserServiceImpl;
	
	@RequestMapping(value = {"he-thong/dba_users", "he-thong/dba_users/{message}"}, method = RequestMethod.GET)
	public ModelAndView Dba_UserList(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/dba-user-list");
		modelAndView.addObject("dba_users", dba_UserServiceImpl.GetDba_Users());
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
	public ModelAndView Dba_UserDetail(HttpSession httpSession, @PathVariable String username) {
		if (username == null)
			return new ModelAndView("redirect:/he-thong/dba_users");

		Dba_User dba_User = dba_UserServiceImpl.GetDba_User(username);
		if (dba_User == null)
			return new ModelAndView("redirect:/he-thong/dba_users");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/dba-user-detail");
		modelAndView.addObject("dba_user", dba_User);
		return modelAndView;
	}
}
