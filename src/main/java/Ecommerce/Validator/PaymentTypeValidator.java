package Ecommerce.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.Entity.PaymentType;

public class PaymentTypeValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(PaymentType.class);
	}

	public void validate(Object target, Errors errors) {
		PaymentType paymentType = (PaymentType)target;
		if(paymentType.getName().trim().length() == 0)
			errors.rejectValue("name", "", "Tên phương thức thanh toán không được rỗng");
		
		if(paymentType.getName().length() < 3 || paymentType.getName().length() > 100)
			errors.rejectValue("name", "", "Tên phương thức thanh toán phải có độ dài lớn hơn 3 và nhỏ hơn 100 ký tự");
	}
}
