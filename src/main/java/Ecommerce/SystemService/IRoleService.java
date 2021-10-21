package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.RoleInput;
import Ecommerce.SystemDTO.RolePermissionForm;
import Ecommerce.SystemEntity.Role;

@Service
public interface IRoleService {
	@Autowired
	
	List<Role> GetRoles();
	
	List<Role> GetRoles_ByRoleNameKeyword(String roleNameKeyword);
	
	Role GetRole(BigDecimal roleId);
	
	Role GetRole_ByRoleName(String roleName);
	
	boolean CreateRole(RoleInput roleInput);
	
	boolean UpdateRole(RoleInput roleInput);
	
	boolean GrantPermissions(RolePermissionForm rolePermissionForm);
	
	boolean RevokePermissions(RolePermissionForm rolePermissionForm);
	
	boolean DeleteRole(String roleName);
}
