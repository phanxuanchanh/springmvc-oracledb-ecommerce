package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.Dba_User;

@Service
public interface IDba_UserService {
	@Autowired
	
	List<Dba_User> GetDba_Users();
}
