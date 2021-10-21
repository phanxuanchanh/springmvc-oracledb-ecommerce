package Ecommerce.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.DTO.AdminLogin;

public class AdminLoginValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(AdminLogin.class);
	}

	public void validate(Object target, Errors errors) {
		AdminLogin adminLogin = (AdminLogin) target;
		if (adminLogin.getUsername().trim().length() == 0)
			errors.rejectValue("username", "", "Tên người dùng không được rỗng");

		if (adminLogin.getUsername().length() < 3 || adminLogin.getUsername().length() > 50)
			errors.rejectValue("username", "", "Tên người dùng phải có độ dài lớn hơn 3 và nhỏ hơn 50 ký tự");

		if (adminLogin.getPassword().trim().length() == 0)
			errors.rejectValue("password", "", "Mật khẩu không được rỗng");

		if (adminLogin.getPassword().length() < 8 || adminLogin.getUsername().length() > 100)
			errors.rejectValue("password", "", "Mật khẩu phải có độ dài lớn hơn 8 và nhỏ hơn 100 ký tự");
	}
}