package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.RoleInput;

public class RoleInputValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(RoleInput.class);
	}

	public void validate(Object target, Errors errors) {
		RoleInput roleInput = (RoleInput)target;
		if(roleInput.getRole_name().trim().length() == 0)
			errors.rejectValue("role_name", "", "role_name không được rỗng");
		
		if(roleInput.getPassword().trim().length() == 0)
			errors.rejectValue("password", "", "password không được rỗng");
	}
}
