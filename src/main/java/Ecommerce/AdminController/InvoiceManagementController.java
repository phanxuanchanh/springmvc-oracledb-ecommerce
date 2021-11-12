package Ecommerce.AdminController;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.Service.InvoiceServiceImpl;

@Controller
public class InvoiceManagementController {
	@Autowired
	private InvoiceServiceImpl invoiceServiceImpl;

	@RequestMapping(value = "quan-tri/cac-chuc-nang-hoa-don-chung", method = RequestMethod.GET)
	public ModelAndView CommonInvoiceFunctions(HttpSession httpSession) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/common-invoice-function");
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		return modelAndView;
	}

	@RequestMapping(value = "quan-tri/cac-chuc-nang-hoa-don-chung", method = RequestMethod.POST)
	public ModelAndView CommonInvoiceFunctions(HttpSession httpSession,
			@RequestParam(value = "option", required = true) String option) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		if (option != null) {
			if (option.equals("updateAllUnitPriceAndIntoPrice"))
				invoiceServiceImpl.UpdateAllUnitPriceAndIntoMoney();
			else
				invoiceServiceImpl.UpdateAllTotalMoney();
		}

		return new ModelAndView("redirect:/quan-tri/cac-chuc-nang-hoa-don-chung");
	}

	@RequestMapping(value = { "quan-tri/danh-sach-hoa-don",
			"quan-tri/danh-sach-hoa-don/{message}" }, method = RequestMethod.GET)
	public ModelAndView InvoiceList(HttpSession httpSession, @PathVariable(required = false) String message) {
		Object obj = httpSession.getAttribute("loginState");
		if (obj == null)
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		String loginState = obj.toString();
		if (!loginState.matches("logged:true;username:([a-zA-Z0-9]{1,});role:Admin"))
			return new ModelAndView("redirect:/tai-khoan-quan-tri/dang-nhap");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/invoice-list");
		modelAndView.addObject("invoices", invoiceServiceImpl.GetInvoices());
		String adminUsername = loginState.replace("logged:true;username:", "").replace(";role:Admin", "");
		modelAndView.addObject("adminUsername", adminUsername);
		if (message != null) {
			if (message.equals("delete-success"))
				modelAndView.addObject("state", "Xóa thành công");
			else if (message.equals("delete-failed"))
				modelAndView.addObject("state", "Xóa thất bại");
			else
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}
}
