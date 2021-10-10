package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.ProfileInput;

public class ProfileInputValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(ProfileInput.class);
	}

	public void validate(Object target, Errors errors) {
		ProfileInput profileInput = (ProfileInput)target;
		if(profileInput.getProfile_name().trim().length() == 0)
			errors.rejectValue("profile_name", "", "Tên profile không được rỗng");
		
		if(profileInput.getConnect_time().trim().length() == 0)
			errors.rejectValue("connect_time", "", "connect_time không được rỗng");
		
		if(!profileInput.getConnect_time().matches("^[0-9]{1,}$"))
			errors.rejectValue("connect_time", "", "Không hợp lệ, giá trị phải là số");
		
		if(profileInput.getSessions_per_user().trim().length() == 0)
			errors.rejectValue("sessions_per_user", "", "sessions_per_user không được rỗng");
		
		if(!profileInput.getSessions_per_user().matches("^([0-9]{1,}$)|^(UNLIMITED)$|^(unlimited)$"))
			errors.rejectValue("sessions_per_user", "", "Không hợp lệ, phải là số hoặc là có giá trị UNLIMITED");
		
		if(profileInput.getFailed_login_attempts().trim().length() == 0)
			errors.rejectValue("failed_login_attempts", "", "failed_login_attempts không được rỗng");
		
		if(!profileInput.getFailed_login_attempts().matches("^[0-9]{1,}$"))
			errors.rejectValue("failed_login_attempts", "", "Không hợp lệ, giá trị phải là số");
		
		if(profileInput.getPassword_lock_time().trim().length() == 0)
			errors.rejectValue("password_lock_time", "", "password_lock_time không được rỗng");
		
		if(!profileInput.getPassword_lock_time().matches("^[0-9]{1,}$"))
			errors.rejectValue("password_lock_time", "", "Không hợp lệ, giá trị phải là số");
	}
}
