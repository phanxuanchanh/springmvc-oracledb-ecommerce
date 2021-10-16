package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemService.AuditPolicyServiceImpl;

@Controller
public class AuditPolicyController {
	@Autowired
	private AuditPolicyServiceImpl auditPolicyServiceImpl;
	
	@RequestMapping(value = "he-thong/dba_audit_policies", method = RequestMethod.GET)
	public ModelAndView AuditPolicyList(HttpSession httpSession) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/audit-policy-list");
		modelAndView.addObject("auditPolicies", auditPolicyServiceImpl.GetAuditPolicies());
		return modelAndView;
	}
}
