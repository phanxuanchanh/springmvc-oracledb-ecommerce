package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemService.AuditTrailServiceImpl;

@Controller
public class AuditTrailController {
	@Autowired
	private AuditTrailServiceImpl auditTrailServiceImpl;
	
	@RequestMapping(value = "he-thong/dba_fga_audit_trail", method = RequestMethod.GET)
	public ModelAndView AuditTrailList(HttpSession httpSession, @RequestParam(value = "object_schema", required = false) String objectSchema) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/audit-trail-list");
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		if(objectSchema == null)
			modelAndView.addObject("auditTrails", auditTrailServiceImpl.GetAuditTrails());
		else 
			modelAndView.addObject("auditTrails", auditTrailServiceImpl.GetAuditTrails_BySchema(objectSchema));
		
		return modelAndView;
	}
}
