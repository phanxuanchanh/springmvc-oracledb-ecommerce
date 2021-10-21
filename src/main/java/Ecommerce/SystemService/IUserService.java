package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.UserInput;
import Ecommerce.SystemDTO.UserPermissionForm;
import Ecommerce.SystemEntity.User;

@Service
public interface IUserService {
	@Autowired

	List<User> GetUsers();
	
	List<User> GetUsers_ByUsernameKeyword(String usernameKeyword);

	User GetUser(String username);
	
	boolean CreateUser(UserInput userInput);
	
	boolean UpdateUser(UserInput userInput);
	
	boolean GrantPermissions(UserPermissionForm userPermissionForm);
	
	boolean RevokePermissions(UserPermissionForm userPermissionForm);
	
	boolean DeleteUser(String username);
}
