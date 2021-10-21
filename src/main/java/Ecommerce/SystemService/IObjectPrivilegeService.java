package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.ObjectPrivilege;

@Service
public interface IObjectPrivilegeService {
	@Autowired
	
	List<ObjectPrivilege> GetObjectPrivileges_ByGrantee(String grantee);
}
