package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.ObjectPrivilegeDAO;
import Ecommerce.SystemEntity.ObjectPrivilege;

@Service
public class ObjectPrivilegeServiceImpl implements IObjectPrivilegeService {
	@Autowired
	private ObjectPrivilegeDAO objectPrivilegeDAO;
	
	public List<ObjectPrivilege> GetObjectPrivileges_ByGrantee(String grantee) {
		return objectPrivilegeDAO.GetObjectPrivileges_ByGrantee(grantee);
	}
}
