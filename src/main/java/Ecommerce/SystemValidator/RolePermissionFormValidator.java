package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.RolePermissionForm;

public class RolePermissionFormValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(RolePermissionForm.class);
	}

	public void validate(Object target, Errors errors) {
		RolePermissionForm rolePermissionForm = (RolePermissionForm)target;		
		if (rolePermissionForm.getRole_name().trim().length() == 0)
			errors.rejectValue("role_name", "", "role_name không được rỗng");

		if (rolePermissionForm.getPermissions().trim().length() == 0)
			errors.rejectValue("permissions", "", "permissions không được rỗng");
		
		String option = rolePermissionForm.getOption();
		if (option.trim().length() == 0)
			errors.rejectValue("option", "", "option phải được chọn");
		
		if (!option.toLowerCase().equals("grant") && !option.toLowerCase().equals("revoke"))
			errors.rejectValue("option", "", "option phải giá trị là grant hoặc revoke");
	}
}
