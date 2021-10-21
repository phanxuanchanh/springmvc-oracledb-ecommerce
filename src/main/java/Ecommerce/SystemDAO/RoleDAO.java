package Ecommerce.SystemDAO;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemDTO.RoleInput;
import Ecommerce.SystemDTO.RolePermissionForm;
import Ecommerce.SystemEntity.Role;
import Ecommerce.SystemEntity.RoleMapper;

@SuppressWarnings("restriction")
@Repository
public class RoleDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Role> GetRoles(){
		String query = "Select role, role_id, password_required, authentication_type from dba_roles";
		return jdbcTemplate.query(query, new RoleMapper(false));
	}
	
	public List<Role> GetRoles_ByRoleNameKeyword(String roleNameKeyword){
		String query = "Select role, role_id, password_required, authentication_type from dba_roles where role like upper(?)";
		return jdbcTemplate.query(query, new Object[] { "%" + roleNameKeyword + "%" }, new RoleMapper(false));
	}
	
	public Role GetRole(BigDecimal roleId) {
		String query = "Select * from dba_roles where role_id = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { roleId }, new RoleMapper(true));
	}
	
	public Role GetRole_ByRoleName(String roleName) {
		String query = "Select * from dba_roles where role = upper(?)";
		return jdbcTemplate.queryForObject(query, new Object[] { roleName }, new RoleMapper(true));
	}
	
	public void CreateRole(RoleInput roleInput) {
		String query = String.format("Create role %s identified by %s", roleInput.getRole_name(), roleInput.getPassword());
		jdbcTemplate.execute(query);
	}
	
	public void UpdateRole(RoleInput roleInput) {
		String query = String.format("Alter role %s identified by %s", roleInput.getRole_name(), roleInput.getPassword());
		jdbcTemplate.execute(query);
	}
	
	public void GrantPermissions(RolePermissionForm rolePermissionForm) {
		String query = String.format("Grant %s to %s", rolePermissionForm.getPermissions(), rolePermissionForm.getRole_name());
		jdbcTemplate.execute(query);
	}
	
	public void RevokePermissions(RolePermissionForm rolePermissionForm) {
		String query = String.format("Revoke %s from %s", rolePermissionForm.getPermissions(), rolePermissionForm.getRole_name());
		jdbcTemplate.execute(query);
	}
	
	public void DeleteRole(String roleName) {
		String query = String.format("Drop role %s", roleName);
		jdbcTemplate.execute(query);
	}
	
	public boolean IsExistRoleByRoleId(BigDecimal roleId) {
		String query = "Select count(*) from dba_roles where role_id = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { roleId }, Integer.class);
		return (count > 0);
	}
	
	public boolean IsExistRoleByRoleName(String roleName) {
		String query = "Select count(*) from dba_roles where role = upper(?)";
		int count = jdbcTemplate.queryForObject(query, new Object[] { roleName }, Integer.class);
		return (count > 0);
	}
}
