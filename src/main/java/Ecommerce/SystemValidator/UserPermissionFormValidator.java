package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.UserPermissionForm;

public class UserPermissionFormValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(UserPermissionForm.class);
	}

	public void validate(Object target, Errors errors) {
		UserPermissionForm userPermissionForm = (UserPermissionForm) target;
		if (userPermissionForm.getUsername().trim().length() == 0)
			errors.rejectValue("username", "", "username không được rỗng");

		if (userPermissionForm.getPermissions().trim().length() == 0)
			errors.rejectValue("permissions", "", "permissions không được rỗng");
		
		String option = userPermissionForm.getOption();
		if (option.trim().length() == 0)
			errors.rejectValue("option", "", "option phải được chọn");
		
		if (!option.toLowerCase().equals("grant") && !option.toLowerCase().equals("revoke"))
			errors.rejectValue("option", "", "option phải giá trị là grant hoặc revoke");
	}
}
