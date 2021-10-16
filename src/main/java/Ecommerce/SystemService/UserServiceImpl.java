package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.UserDAO;
import Ecommerce.SystemEntity.User;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserDAO dba_UserDAO;
	
	public List<User> GetDba_Users() {
		return dba_UserDAO.GetDba_Users();
	}

	public User GetDba_User(String username) {
		if(dba_UserDAO.IsExistDba_UserByUsername(username))
			return dba_UserDAO.GetDba_User(username);
		return null;
	}
}
