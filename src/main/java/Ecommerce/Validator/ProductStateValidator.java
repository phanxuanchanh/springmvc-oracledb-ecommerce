package Ecommerce.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.Entity.ProductState;

public class ProductStateValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return clazz.equals(ProductState.class);
	}

	public void validate(Object target, Errors errors) {
		ProductState productState = (ProductState)target;
		if(productState.getName().trim().length() == 0)
			errors.rejectValue("name", "", "Tên trạng thái sản phẩm không được rỗng");
		
		if(productState.getName().length() < 3 || productState.getName().length() > 100)
			errors.rejectValue("name", "", "Tên trạng thái sản phẩm phải có độ dài lớn hơn 3 và nhỏ hơn 100 ký tự");
	}
}
