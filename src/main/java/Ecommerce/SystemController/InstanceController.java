package Ecommerce.SystemController;

import java.math.BigDecimal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemEntity.Instance;
import Ecommerce.SystemService.InstanceServiceImpl;

@Controller
public class InstanceController {
	@Autowired
	private InstanceServiceImpl instanceServiceImpl;
	
	@RequestMapping(value = "he-thong/v$instance", method = RequestMethod.GET)
	public ModelAndView InstanceList(HttpSession httpSession) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/instance-list");
		modelAndView.addObject("instances", instanceServiceImpl.GetInstances());
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/chi-tiet-instance/{instanceNumber}", method = RequestMethod.GET)
	public ModelAndView InstanceDetail(HttpSession httpSession, @PathVariable BigDecimal instanceNumber) {
		if (instanceNumber.intValue() <= 0)
			return new ModelAndView("redirect:/he-thong/v$instance");

		Instance instance = instanceServiceImpl.GetInstance(instanceNumber);
		if (instance == null)
			return new ModelAndView("redirect:/he-thong/v$instance");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/instance-detail");
		modelAndView.addObject("instance", instance);
		return modelAndView;
	}
}
