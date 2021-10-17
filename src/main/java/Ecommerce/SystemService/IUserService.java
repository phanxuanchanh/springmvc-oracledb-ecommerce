package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.UserInput;
import Ecommerce.SystemEntity.User;

@Service
public interface IUserService {
	@Autowired

	List<User> GetUsers();
	
	List<User> GetUsers_ByUsernameKeyword(String usernameKeyword);

	User GetUser(String username);
	
	boolean CreateUser(UserInput userInput);
	
	boolean UpdateUser(UserInput userInput);
	
	boolean DeleteUser(String username);
}
