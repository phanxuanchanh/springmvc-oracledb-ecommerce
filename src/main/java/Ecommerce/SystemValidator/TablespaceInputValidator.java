package Ecommerce.SystemValidator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import Ecommerce.SystemDTO.TablespaceInput;


public class TablespaceInputValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.equals(TablespaceInput.class);
	}

	public void validate(Object target, Errors errors) {
		TablespaceInput tablespaceInput = (TablespaceInput)target;
		if(tablespaceInput.getTablespace_name().trim().length() == 0)
			errors.rejectValue("tablespace_name", "", "Tên tablespace không được rỗng");
		
		if(tablespaceInput.getDatafiles().trim().length() == 0)
			errors.rejectValue("datafiles", "", "Datafile không được rỗng");
		
		if(tablespaceInput.getSizes().trim().length() == 0)
			errors.rejectValue("sizes", "", "Size không được rỗng");
	}
}
