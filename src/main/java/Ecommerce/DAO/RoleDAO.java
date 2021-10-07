package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.Role;
import Ecommerce.Entity.RoleMapper;

@SuppressWarnings("restriction")
@Repository
public class RoleDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<Role> GetRoles(){
		List<Role> roles = new ArrayList<Role>();
		String query = "Select * from ThuongMaiDienTu.Roles";
		roles = jdbcTemplate.query(query, new RoleMapper());
		return roles;
	}
	
	public Role GetRole(BigDecimal id) {
		Role role = null;
		String query = "Select * from ThuongMaiDienTu.Roles where ID = ?";
		role = jdbcTemplate.queryForObject(query, new Object[] { id }, new RoleMapper());
		return role;
	}
	
	public boolean CreateRole(Role role) {
		String query = "Insert into ThuongMaiDienTu.Roles(\"name\", \"description\", createAt, updateAt) values(?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { role.getName(), role.getDescription() });
		return (affected > 0);
	}

	public boolean UpdateRole(Role role) {
		String query = "Update ThuongMaiDienTu.Roles set \"name\" = ?, \"description\" = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { role.getName(), role.getDescription(), role.getID() });
		return (affected > 0);
	}
	
	public boolean DeleteRole(BigDecimal id) {
		String query = "Delete from ThuongMaiDienTu.Roles where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public int CountRole() {
		String query = "Select count(*) from ThuongMaiDienTu.Roles";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
	
	public boolean IsExistRoleById(BigDecimal id) {
		String query = "Select count(*) from ThuongMaiDienTu.Roles where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistRoleByName(String name) {
		String query = "Select count(*) from ThuongMaiDienTu.Roles where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
}
