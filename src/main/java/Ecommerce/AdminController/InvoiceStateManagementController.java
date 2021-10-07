package Ecommerce.AdminController;

import java.math.BigDecimal;

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

import Ecommerce.Entity.InvoiceState;
import Ecommerce.Service.InvoiceStateServiceImpl;
import Ecommerce.Validator.InvoiceStateValidator;

@Controller
public class InvoiceStateManagementController {
	@Autowired
	private InvoiceStateServiceImpl invoiceStateServiceImpl;
	
	@RequestMapping(value = { "quan-tri/danh-sach-trang-thai-hoa-don", "quan-tri/danh-sach-trang-thai-hoa-don/{message}" }, method = RequestMethod.GET)
	public ModelAndView InvoiceStateList(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/invoice-state-list");
		modelAndView.addObject("invoiceStates", invoiceStateServiceImpl.GetInvoiceStates());
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

	@RequestMapping(value = "quan-tri/chi-tiet-trang-thai-hoa-don/{id}", method = RequestMethod.GET)
	public ModelAndView InvoiceStateDetail(HttpSession httpSession, @PathVariable BigDecimal id) {
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-hoa-don");

		InvoiceState invoiceState = invoiceStateServiceImpl.GetInvoiceState(id);
		if (invoiceState == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-hoa-don");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/invoice-state-detail");
		modelAndView.addObject("invoiceState", invoiceState);
		return modelAndView;
	}

	@RequestMapping(value = {"quan-tri/tao-moi-trang-thai-hoa-don", "quan-tri/tao-moi-trang-thai-hoa-don/{message}"}, method = RequestMethod.GET)
	public ModelAndView CreateInvoiceState(HttpSession httpSession, @PathVariable(required = false) String message) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/create-invoice-state");
		modelAndView.addObject("invoiceState", new InvoiceState());
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

	@RequestMapping(value = "quan-tri/tao-moi-trang-thai-hoa-don", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView CreateInvoiceState(HttpSession httpSession, @ModelAttribute("invoiceState") InvoiceState invoiceState, 
			BindingResult bindingResult, InvoiceStateValidator invoiceStateValidator) {
		invoiceStateValidator.validate(invoiceState, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/create-invoice-state");
			modelAndView.addObject("invoiceState", invoiceState);
			return modelAndView;
		}

		if(invoiceStateServiceImpl.CreateInvoiceState(invoiceState))
			return new ModelAndView("redirect:/quan-tri/tao-moi-trang-thai-hoa-don/add-success");
		
		return new ModelAndView("redirect:/quan-tri/tao-moi-trang-thai-hoa-don/add-failed");
	}

	@RequestMapping(value = {"quan-tri/chinh-sua-trang-thai-hoa-don/{id}", "quan-tri/chinh-sua-trang-thai-hoa-don/{id}/{message}"}, method = RequestMethod.GET)
	public ModelAndView UpdateCategory(HttpSession httpSession, @PathVariable BigDecimal id, @PathVariable(required = false) String message) {
		if (id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-hoa-don");

		InvoiceState invoiceState = invoiceStateServiceImpl.GetInvoiceState(id);
		if (invoiceState == null)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-hoa-don");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/update-invoice-state");
		modelAndView.addObject("invoiceState", invoiceState);
		if(message != null) {
			if(message.equals("edit-success"))
				modelAndView.addObject("state", "Chỉnh sửa thành công");
			else if(message.equals("edit-failed"))
				modelAndView.addObject("state", "Chỉnh sửa thất bại");
			else 
				modelAndView.addObject("state", "Không xác định được nội dung thông báo");
		}
		return modelAndView;
	}
	
	@RequestMapping(value = "quan-tri/chinh-sua-trang-thai-hoa-don/{id}", method = RequestMethod.POST, produces = "application/x-www-form-urlencoded;charset=UTF-8")
	public ModelAndView UpdateCategory(HttpSession httpSession, @ModelAttribute("category") InvoiceState invoiceState, 
			BindingResult bindingResult, InvoiceStateValidator invoiceStateValidator) {	
		invoiceStateValidator.validate(invoiceState, bindingResult);
		if (bindingResult.hasErrors()) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("admin/update-invoice-state");
			modelAndView.addObject("invoiceState", invoiceState);
			return modelAndView;
		}

		if(invoiceStateServiceImpl.UpdateInvoiceState(invoiceState))
			return new ModelAndView("redirect:/quan-tri/chinh-sua-trang-thai-hoa-don/{id}/edit-success");
		
		return new ModelAndView("redirect:/quan-tri/chinh-sua-trang-thai-hoa-don/{id}/edit-failed");
	}

	@RequestMapping(value = "quan-tri/xoa-trang-thai-hoa-don", method = RequestMethod.POST)
	public ModelAndView DeleteCategory(HttpSession httpSession, @RequestParam(value = "id", required = true) BigDecimal id) {		
		if(id.intValue() <= 0)
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-hoa-don");
		
		if(invoiceStateServiceImpl.DeleteInvoiceState(id))
			return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-hoa-don/delete-success");
		
		return new ModelAndView("redirect:/quan-tri/danh-sach-trang-thai-hoa-don/delete-failed");
	}
}
