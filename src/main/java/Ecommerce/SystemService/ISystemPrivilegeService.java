package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.SystemPrivilege;

@Service
public interface ISystemPrivilegeService {
	@Autowired
	
	List<SystemPrivilege> GetSystemPrivileges_ByGrantee(String grantee);
}
