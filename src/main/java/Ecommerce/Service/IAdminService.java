package Ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DTO.AdminInfo;
import Ecommerce.DTO.AdminLogin;
import Ecommerce.Entity.Admin;

@Service
public interface IAdminService {
	@Autowired
	
	AdminInfo GetAdminInfo(String username);
	
	boolean Login(AdminLogin adminLogin);
	
	boolean CreateAdmin(Admin admin);
	
}
