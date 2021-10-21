package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemDTO.TableOutput;
import Ecommerce.SystemEntity.Table;
import Ecommerce.SystemService.TableServiceImpl;

@Controller
public class TableController {
	@Autowired
	private TableServiceImpl tableServiceImpl;
	
	@RequestMapping(value = "he-thong/dba_tables", method = RequestMethod.GET)
	public ModelAndView TableList(HttpSession httpSession) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/table-list");
		modelAndView.addObject("tables", tableServiceImpl.GetTables());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/danh-sach-table-theo-user", method = RequestMethod.GET)
	public ModelAndView TableListByOwner(HttpSession httpSession, @RequestParam(value = "owner", required = false) String owner) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/table-list-by-owner");
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		if(owner == null)
			modelAndView.addObject("tables_byOwner", new ArrayList<TableOutput>());
		else 
			modelAndView.addObject("tables_byOwner", tableServiceImpl.GetTables_ByOwner(owner));
		
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/chi-tiet-table/{tablename}", method = RequestMethod.GET)
	public ModelAndView TableDetail(HttpSession httpSession, @PathVariable String tablename) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (tablename == null)
			return new ModelAndView("redirect:/he-thong/dba_tables");

		Table table = tableServiceImpl.GetTable(tablename);
		if (table == null)
			return new ModelAndView("redirect:/he-thong/dba_tables");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/table-detail");
		modelAndView.addObject("table", table);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
}
