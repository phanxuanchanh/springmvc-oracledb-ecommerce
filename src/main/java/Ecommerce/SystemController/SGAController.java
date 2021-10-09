package Ecommerce.SystemController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemService.SgaServiceImpl;

@Controller
public class SgaController {
	@Autowired
	private SgaServiceImpl sgaServiceImpl;
	
	@RequestMapping(value = "he-thong/v$sga", method = RequestMethod.GET)
	public ModelAndView SGAList(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/sga-list");
		modelAndView.addObject("v$sga", sgaServiceImpl.GetSgas());
		return modelAndView;
	}
}
