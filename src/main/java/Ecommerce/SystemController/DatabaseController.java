package Ecommerce.SystemController;

import java.math.BigDecimal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemEntity.Database;
import Ecommerce.SystemService.DatabaseServiceImpl;

@Controller
public class DatabaseController {
	@Autowired
	private DatabaseServiceImpl databaseServiceImpl;
	
	@RequestMapping(value = "he-thong/v$database", method = RequestMethod.GET)
	public ModelAndView DatabaseList(HttpSession httpSession) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/database-list");
		modelAndView.addObject("databases", databaseServiceImpl.GetDatabases());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/chi-tiet-database/{databaseNumber}", method = RequestMethod.GET)
	public ModelAndView DatabaseDetail(HttpSession httpSession, @PathVariable BigDecimal databaseNumber) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (databaseNumber.intValue() <= 0)
			return new ModelAndView("redirect:/he-thong/v$database");

		Database database = databaseServiceImpl.GetDatabase(databaseNumber);
		if (database == null)
			return new ModelAndView("redirect:/he-thong/v$database");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/database-detail");
		modelAndView.addObject("database", database);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
}
