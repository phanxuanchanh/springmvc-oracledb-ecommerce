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

import Ecommerce.SystemDTO.AuditPolicyInput;
import Ecommerce.SystemService.AuditPolicyServiceImpl;
import Ecommerce.SystemValidator.AuditPolicyInputValidator;

@Controller
public class AuditPolicyController {
	@Autowired
	private AuditPolicyServiceImpl auditPolicyServiceImpl;
	
	@RequestMapping(value = "he-thong/dba_audit_policies", method = RequestMethod.GET)
	public ModelAndView AuditPolicyList(HttpSession httpSession) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/audit-policy-list");
		modelAndView.addObject("auditPolicies", auditPolicyServiceImpl.GetAuditPolicies());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
		return modelAndView;
	}
	
	@RequestMapping(value = {"he-thong/tao-moi-audit-policy", "he-thong/tao-moi-audit-policy/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateTablespace(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/create-audit-policy");
		modelAndView.addObject("auditPolicyInput", new AuditPolicyInput());
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

	@RequestMapping(value = "he-thong/tao-moi-audit-policy", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateTablespace(HttpSession httpSession, @ModelAttribute("auditPolicyInput") AuditPolicyInput auditPolicyInput, 
			BindingResult bindingResult, AuditPolicyInputValidator auditPolicyInputValidator) {
		Object obj = httpSession.getAttribute("loginState");
		if(obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		String loginState = obj.toString();
		if(!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");
		
		auditPolicyInputValidator.validate(auditPolicyInput, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("system/create-audit-policy");
			modelAndView.addObject("auditPolicyInput", auditPolicyInput);
			String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
			modelAndView.addObject("adminUsername", adminUsername + "-> SYS [Oracle]");
			return modelAndView;
		}

		if(auditPolicyServiceImpl.CreateAuditPolicy(auditPolicyInput))
			return new ModelAndView("redirect:/he-thong/tao-moi-audit-policy/add-success");
		
		return new ModelAndView("redirect:/he-thong/tao-moi-audit-policy/add-failed");
	}
}
