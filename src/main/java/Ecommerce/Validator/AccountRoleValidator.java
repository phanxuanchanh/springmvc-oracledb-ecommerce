package Ecommerce.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.Entity.AccountRole;

public class AccountRoleValidator implements Validator {
	public boolean supports(Class<?> clazz) {
		return clazz.equals(AccountRole.class);
	}

	public void validate(Object target, Errors errors) {
		AccountRole accountRole = (AccountRole)target;
		if(accountRole.getName().trim().length() == 0)
			errors.rejectValue("name", "", "Tên quyền hạn không được rỗng");
		
		if(accountRole.getName().length() < 3 || accountRole.getName().length() > 100)
			errors.rejectValue("name", "", "Tên quyền hạn phải có độ dài lớn hơn 3 và nhỏ hơn 100 ký tự");
	}
}
