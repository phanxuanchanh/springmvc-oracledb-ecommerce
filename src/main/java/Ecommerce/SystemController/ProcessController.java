package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemService.ProcessServiceImpl;

@Controller
public class ProcessController {
	@Autowired
	private ProcessServiceImpl processServiceImpl;
	
	@RequestMapping(value = "he-thong/v$process", method = RequestMethod.GET)
	public ModelAndView ProcessList(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/process-list");
		modelAndView.addObject("v$process", processServiceImpl.GetProcesses());
		return modelAndView;
	}
}
