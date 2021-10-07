package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.RoleDAO;
import Ecommerce.Entity.Role;

@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private RoleDAO roleDAO;
	
	public List<Role> GetRoles() {
		return roleDAO.GetRoles();
	}
	
	public Role GetRole(BigDecimal id) {
		if(roleDAO.IsExistRoleById(id))
			return roleDAO.GetRole(id);
		return null;
	}

	public boolean CreateRole(Role role) {
		if(roleDAO.IsExistRoleByName(role.getName()))
			return false;
		return roleDAO.CreateRole(role);
	}

	public boolean UpdateRole(Role role) {
		if(roleDAO.IsExistRoleById(role.getID()))
			return roleDAO.UpdateRole(role);
		return false;
	}

	public boolean DeleteRole(BigDecimal id) {
		if(roleDAO.IsExistRoleById(id))
			return roleDAO.DeleteRole(id);
		return false;
	}
}
