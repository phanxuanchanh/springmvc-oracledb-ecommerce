package Ecommerce.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.Entity.InvoiceState;

public class InvoiceStateValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(InvoiceState.class);
	}

	public void validate(Object target, Errors errors) {
		InvoiceState invoiceState = (InvoiceState)target;
		if(invoiceState.getName().trim().length() == 0)
			errors.rejectValue("name", "", "Tên trạng thái hóa đơn không được rỗng");
		
		if(invoiceState.getName().length() < 3 || invoiceState.getName().length() > 100)
			errors.rejectValue("name", "", "Tên trạng thái hóa đơn phải có độ dài lớn hơn 3 và nhỏ hơn 100 ký tự");
	}
}
