package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.SystemPrivilegeDAO;
import Ecommerce.SystemEntity.SystemPrivilege;

@Service
public class SystemPrivilegeServiceImpl implements ISystemPrivilegeService {
	@Autowired
	private SystemPrivilegeDAO systemPrivilegeDAO;
	
	public List<SystemPrivilege> GetSystemPrivileges_ByGrantee(String grantee) {
		return systemPrivilegeDAO.GetSystemPrivileges_ByGrantee(grantee);
	}
}
