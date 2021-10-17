package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.UserInput;
import Ecommerce.SystemEntity.User;

public class UserInputValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(User.class);
	}

	public void validate(Object target, Errors errors) {
		UserInput userInput = (UserInput)target;
		if(userInput.getUsername().trim().length() == 0)
			errors.rejectValue("username", "", "username không được rỗng");
		
		if(userInput.getPassword().trim().length() == 0)
			errors.rejectValue("password", "", "password không được rỗng");
		
		if(userInput.getTablespace().trim().length() == 0)
			errors.rejectValue("tablespace", "", "tablespace không được rỗng");
		
		if(userInput.getQuota().trim().length() == 0)
			errors.rejectValue("quota", "", "qouta không được rỗng");
		
		if(userInput.getProfile().trim().length() == 0)
			errors.rejectValue("profile", "", "profile không được rỗng");
	}
}
