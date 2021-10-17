package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.AuditPolicyInput;

public class AuditPolicyInputValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(AuditPolicyInput.class);
	}

	public void validate(Object target, Errors errors) {
		AuditPolicyInput auditPolicyInput = (AuditPolicyInput)target;
		if(auditPolicyInput.getObject_schema().trim().length() == 0)
			errors.rejectValue("object_schema", "", "object_schema không được rỗng");
		
		if(auditPolicyInput.getObject_name().trim().length() == 0)
			errors.rejectValue("object_name", "", "object_name không được rỗng");
		
		if(auditPolicyInput.getPolicy_name().trim().length() == 0)
			errors.rejectValue("policy_name", "", "policy_name không được rỗng");
		
		if(auditPolicyInput.getStatement_types().trim().length() == 0)
			errors.rejectValue("statement_types", "", "statement_types không được rỗng");
	}
}
