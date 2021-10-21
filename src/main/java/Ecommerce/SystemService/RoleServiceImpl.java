package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.RoleDAO;
import Ecommerce.SystemDTO.RoleInput;
import Ecommerce.SystemDTO.RolePermissionForm;
import Ecommerce.SystemEntity.Role;

@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private RoleDAO roleDAO;
	
	public List<Role> GetRoles() {
		return roleDAO.GetRoles();
	}
	
	public List<Role> GetRoles_ByRoleNameKeyword(String roleNameKeyword){
		return roleDAO.GetRoles_ByRoleNameKeyword(roleNameKeyword);
	}

	public Role GetRole(BigDecimal roleId) {
		if(roleDAO.IsExistRoleByRoleId(roleId))
			return roleDAO.GetRole(roleId);
		return null;
	}
	
	public Role GetRole_ByRoleName(String roleName) {
		if(roleDAO.IsExistRoleByRoleName(roleName))
			return roleDAO.GetRole_ByRoleName(roleName);
		return null;
	}

	public boolean CreateRole(RoleInput roleInput) {
		if(roleDAO.IsExistRoleByRoleName(roleInput.getRole_name()))
			return false;
		roleDAO.CreateRole(roleInput);
		return true;
	}

	public boolean UpdateRole(RoleInput roleInput) {
		if(roleDAO.IsExistRoleByRoleName(roleInput.getRole_name())) {
			roleDAO.UpdateRole(roleInput);
			return true;
		}
		return false;
	}

	public boolean GrantPermissions(RolePermissionForm rolePermissionForm) {
		if(roleDAO.IsExistRoleByRoleName(rolePermissionForm.getRole_name())) {
			roleDAO.GrantPermissions(rolePermissionForm);
			return true;
		}
		return false;
	}

	public boolean RevokePermissions(RolePermissionForm rolePermissionForm) {
		if(roleDAO.IsExistRoleByRoleName(rolePermissionForm.getRole_name())) {
			roleDAO.RevokePermissions(rolePermissionForm);
			return true;
		}
		return false;
	}

	public boolean DeleteRole(String roleName) {
		if(roleDAO.IsExistRoleByRoleName(roleName)) {
			roleDAO.DeleteRole(roleName);
			return true;
		}
		return false;
	}
}
