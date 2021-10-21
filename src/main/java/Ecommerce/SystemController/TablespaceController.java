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

import Ecommerce.SystemDTO.TablespaceInput;
import Ecommerce.SystemEntity.Tablespace;
import Ecommerce.SystemService.TablespaceServiceImpl;
import Ecommerce.SystemValidator.TablespaceInputValidator;

@Controller
public class TablespaceController {
	@Autowired
	private TablespaceServiceImpl tablespaceServiceImpl;
	
	@RequestMapping(value = { "he-thong/dba_tablespaces", "he-thong/dba_tablespaces/{message}" }, method = RequestMethod.GET)
	public ModelAndView TablespaceList(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/tablespace-list");
		modelAndView.addObject("tablespaces", tablespaceServiceImpl.GetTablespaces());
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
	
	@RequestMapping(value = "he-thong/chi-tiet-tablespace/{tablespaceName}", method = RequestMethod.GET)
	public ModelAndView TablespaceDetail(HttpSession httpSession, @PathVariable String tablespaceName) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if (tablespaceName == null)
			return new ModelAndView("redirect:/he-thong/dba_tablespaces");

		Tablespace tablespace = tablespaceServiceImpl.GetTablespace(tablespaceName);
		if (tablespace == null)
			return new ModelAndView("redirect:/he-thong/dba_tablespaces");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/tablespace-detail");
		modelAndView.addObject("tablespace", tablespace);
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
	
	@RequestMapping(value = {"he-thong/tao-moi-tablespace", "he-thong/tao-moi-tablespace/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateTablespace(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/create-tablespace");
		modelAndView.addObject("tablespaceInput", new TablespaceInput());
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

	@RequestMapping(value = "he-thong/tao-moi-tablespace", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateTablespace(HttpSession httpSession, @ModelAttribute("tablespaceInput") TablespaceInput tablespaceInput, 
			BindingResult bindingResult, TablespaceInputValidator tablespaceInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		tablespaceInputValidator.validate(tablespaceInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/create-tablespace");
			modelAndView.addObject("tablespaceInput", tablespaceInput);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(tablespaceServiceImpl.CreateTablespace(tablespaceInput))
			return new ModelAndView("redirect:/he-thong/tao-moi-tablespace/add-success");
		
		return new ModelAndView("redirect:/he-thong/tao-moi-tablespace/add-failed");
	}
	
	@RequestMapping(value = {"he-thong/them-datafile-vao-tablespace/{tablespaceName}", "he-thong/them-datafile-vao-tablespace/{tablespaceName}/{message}"}, method = RequestMethod.GET)
	public ModelAndView AddDatafile(HttpSession httpSession, @PathVariable(required = true) String tablespaceName, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/add-datafile");
		TablespaceInput tablespaceInput = new TablespaceInput();
		tablespaceInput.setTablespace_name(tablespaceName);
		modelAndView.addObject("tablespaceInput", tablespaceInput);
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
	
	@RequestMapping(value = "he-thong/them-datafile-vao-tablespace/{tablespaceName}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView AddDatafile(HttpSession httpSession, @ModelAttribute("tablespaceInput") TablespaceInput tablespaceInput, 
			BindingResult bindingResult, TablespaceInputValidator tablespaceInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		tablespaceInputValidator.validate(tablespaceInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/add-datafile");
			modelAndView.addObject("tablespaceInput", tablespaceInput);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(tablespaceServiceImpl.AddTablespace(tablespaceInput))
			return new ModelAndView("redirect:/he-thong/them-datafile-vao-tablespace/{tablespaceName}/add-success");
		
		return new ModelAndView("redirect:/he-thong/them-datafile-vao-tablespace/{tablespaceName}/add-failed");
	}
	
	@RequestMapping(value = "he-thong/xoa-tablespace/{tablespaceName}", method = RequestMethod.GET)
	public ModelAndView DeleteTablespace(HttpSession httpSession, @PathVariable(required = true) String tablespaceName,
			@RequestParam(value = "option", required = false) String option) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		if(option == null) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/delete-tablespace");
			modelAndView.addObject("tablespaceName", tablespaceName);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}
		
		if(!option.equals("not-delete-datafile") && !option.equals("delete-datafile"))
			return new ModelAndView("redirect:/he-thong/dba_tablespaces/delete-failed");
		
		if(option.equals("delete-datafile"))
			tablespaceServiceImpl.DeleteTablespace(tablespaceName, true);
		else
			tablespaceServiceImpl.DeleteTablespace(tablespaceName, false);
		
		return new ModelAndView("redirect:/he-thong/dba_tablespaces/delete-success");
	}
}
