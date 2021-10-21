package Ecommerce.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.Entity.Product;

public class ProductValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(Product.class);
	}

	public void validate(Object target, Errors errors) {
		Product product = (Product)target;
		
		if (product.getName().trim().length() == 0)
			errors.rejectValue("name", "", "Tên nhà cung cấp không được rỗng");

		if (product.getName().length() < 3 || product.getName().length() > 100)
			errors.rejectValue("name", "", "Tên nhà cung cấp phải có độ dài lớn hơn 3 và nhỏ hơn 100 ký tự");
		
		
		
	}

}
