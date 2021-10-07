package Ecommerce.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.Entity.ProductCategory;

public class ProductCategoryValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(ProductCategory.class);
	}

	public void validate(Object target, Errors errors) {
		ProductCategory productCategory = (ProductCategory)target;
		if(productCategory.getName().trim().length() == 0)
			errors.rejectValue("name", "", "Tên thể loại không được rỗng");
		
		if(productCategory.getName().length() < 3 || productCategory.getName().length() > 100)
			errors.rejectValue("name", "", "Tên thể loại phải có độ dài lớn hơn 3 và nhỏ hơn 100 ký tự");
	}
}
