package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.User;

@Service
public interface IUserService {
	@Autowired

	List<User> GetDba_Users();

	User GetDba_User(String username);
}
