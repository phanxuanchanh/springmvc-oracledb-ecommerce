package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.UserDAO;
import Ecommerce.SystemDTO.UserInput;
import Ecommerce.SystemEntity.User;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDAO userDAO;
	
	public List<User> GetUsers() {
		return userDAO.GetUsers();
	}

	public User GetUser(String username) {
		if(userDAO.IsExistUserByUsername(username))
			return userDAO.GetUser(username);
		return null;
	}

	public boolean CreateUser(UserInput userInput) {
		if(userDAO.IsExistUserByUsername(userInput.getUsername()))
			return false;
		userDAO.CreateUser(userInput);
		return true;
	}

	public boolean UpdateUser(UserInput userInput) {
		if(userDAO.IsExistUserByUsername(userInput.getUsername())) {
			userDAO.UpdateUser(userInput);
			return true;
		}
		return false;
	}

	public boolean DeleteUser(String username) {
		if(userDAO.IsExistUserByUsername(username)) {
			userDAO.DeleteUser(username);
			return true;
		}
		return false;
	}

	public List<User> GetUsers_ByUsernameKeyword(String usernameKeyword) {
		return userDAO.GetUsers_ByUsernameKeyword(usernameKeyword);
	}
}
