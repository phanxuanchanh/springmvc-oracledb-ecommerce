package Ecommerce.SystemController;

import java.math.BigDecimal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.SystemEntity.Session;
import Ecommerce.SystemService.SessionServiceImpl;

@Controller
public class SessionController {
	@Autowired
	private SessionServiceImpl sessionServiceImpl;
	
	@RequestMapping(value = { "he-thong/v$session", "he-thong/v$session/{message}" }, method = RequestMethod.GET)
	public ModelAndView SessionList(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/session-list");
		modelAndView.addObject("sessions", sessionServiceImpl.GetSessions());
		if(message != null) {
			if(message.equals("delete-success"))
				modelAndView.addObject("state", "Hủy thành công");
			else if(message.equals("delete-failed"))
				modelAndView.addObject("state", "Hủy thất bại");
			else 
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/chi-tiet-session/{saddr}", method = RequestMethod.GET)
	public ModelAndView SessionDetail(HttpSession httpSession, @PathVariable String saddr) {
		if (saddr == null)
			return new ModelAndView("redirect:/he-thong/v$session");

		Session session = sessionServiceImpl.GetSession(saddr);
		if (session == null)
			return new ModelAndView("redirect:/he-thong/v$session");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/session-detail");
		modelAndView.addObject("session", session);
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/cac-process-ung-voi-session-dang-dang-nhap", method = RequestMethod.GET)
	public ModelAndView ProcessVsSessionList(HttpSession httpSession) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("system/process-vs-session-list");
		modelAndView.addObject("processVsSessions", sessionServiceImpl.GetProcessVsSessions());
		return modelAndView;
	}
	
	@RequestMapping(value = "he-thong/huy-session", method = RequestMethod.POST)
	public ModelAndView DeleteSession(HttpSession httpSession, @RequestParam(value = "sid", required = true) BigDecimal sid, 
			@RequestParam(value = "serial", required = true) BigDecimal serial) {		
		if(sid.intValue() <= 0 || serial.intValue() <= 0)
			return new ModelAndView("redirect:/he-thong/v$session");
		
		if(sessionServiceImpl.DeleteSession(sid, serial))
			return new ModelAndView("redirect:/he-thong/v$session/delete-success");
		
		return new ModelAndView("redirect:/he-thong/v$session/delete-failed");
	}
}
