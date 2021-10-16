package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemEntity.Process;
import Ecommerce.SystemService.ProcessServiceImpl;

@Controller
public class ProcessController {
	@Autowired
	private ProcessServiceImpl processServiceImpl;
	
	@RequestMapping(value = "he-thong/v$process", method = RequestMethod.GET)
	public ModelAndView ProcessList(HttpSession httpSession) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/process-list");
		modelAndView.addObject("processes", processServiceImpl.GetProcesses());
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/chi-tiet-process/{addr}", method = RequestMethod.GET)
	public ModelAndView ProcessDetail(HttpSession httpSession, @PathVariable String addr) {
		if (addr == null)
			return new ModelAndView("redirect:/he-thong/v$process");

		Process process = processServiceImpl.GetProcess(addr);
		if (process == null)
			return new ModelAndView("redirect:/he-thong/v$process");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/process-detail");
		modelAndView.addObject("process", process);
		return modelAndView;
	}
}
