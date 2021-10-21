package Ecommerce.DAO;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.Admin;
import Ecommerce.Entity.AdminMapper;

@SuppressWarnings("restriction")
@Repository
public class AdminDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public Admin GetAdminByUsername(String username) {
		String query = "Select * from ThuongMaiDienTu_Web.Admins where username = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { username }, new AdminMapper());
	}
	
	public boolean CreateAdmin(Admin admin) {
		String query = "Insert into ThuongMaiDienTu_Web.Admins(username, fullname, gender, \"description\", email, birthday, avatar, phone, \"password\", roleId, createAt, updateAt) "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, current_timestamp, current_timestamp)";
		int affected = jdbcTemplate.update(query,
				new Object[] { admin.getUsername(), admin.getFullname(), admin.getGender(), admin.getDescription(), admin.getEmail(), admin.getBirthday(),
						admin.getAvatar(), admin.getPhone(), admin.getPassword(), admin.getRoleId() });
		return (affected > 0);
	}
	
	public boolean IsExistAdminByUsername(String username) {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Admins where username = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { username }, Integer.class);
		return (count > 0);
	}
}
