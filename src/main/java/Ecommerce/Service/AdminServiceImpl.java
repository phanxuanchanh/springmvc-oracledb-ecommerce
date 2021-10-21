package Ecommerce.Service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.AccountRoleDAO;
import Ecommerce.DAO.AdminDAO;
import Ecommerce.DTO.AdminInfo;
import Ecommerce.DTO.AdminLogin;
import Ecommerce.Entity.AccountRole;
import Ecommerce.Entity.Admin;

@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	private AdminDAO adminDAO;
	
	@Autowired
	private AccountRoleDAO accountRoleDAO;
	
	public AdminInfo GetAdminInfo(String username) {
		if (adminDAO.IsExistAdminByUsername(username)) {
			Admin admin = adminDAO.GetAdminByUsername(username);

			AccountRole accountRole = accountRoleDAO.GetAccountRole(admin.getRoleId());
			return new  AdminInfo(admin.getID(), admin.getUsername(), admin.getFullname(), admin.getGender(), 
					admin.getDescription(), admin.getEmail(), admin.getBirthday(), admin.getAvatar(), admin.getPhone(),
					admin.getCreateAt(), admin.getUpdateAt(), accountRole);
		}
		return null;
	}
	
	public boolean Login(AdminLogin adminLogin) {
		if(adminDAO.IsExistAdminByUsername(adminLogin.getUsername())) {
			Admin admin = adminDAO.GetAdminByUsername(adminLogin.getUsername());
			if(BCrypt.checkpw(adminLogin.getPassword(), admin.getPassword()))
				return true;
			return false;
		}
		return false;
	}

	public boolean CreateAdmin(Admin admin) {
		if(adminDAO.IsExistAdminByUsername(admin.getUsername()))
			return false;
		return adminDAO.CreateAdmin(admin);
	}
}
