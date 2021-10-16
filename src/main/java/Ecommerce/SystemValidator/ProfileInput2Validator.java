package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.ProfileInput2;

public class ProfileInput2Validator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(ProfileInput2.class);
	}

	public void validate(Object target, Errors errors) {
		ProfileInput2 profileInput2 = (ProfileInput2)target;
		if(profileInput2.getProfile_name().trim().length() == 0)
			errors.rejectValue("profile_name", "", "Tên profile không được rỗng");
	}
}
