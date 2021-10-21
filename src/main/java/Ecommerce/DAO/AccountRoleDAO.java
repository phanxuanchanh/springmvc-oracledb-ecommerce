package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.AccountRole;
import Ecommerce.Entity.AccountRoleMapper;

@SuppressWarnings("restriction")
@Repository
public class AccountRoleDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<AccountRole> GetAccountRoles(){
		String query = "Select * from ThuongMaiDienTu_Web.\"Roles\"";
		return jdbcTemplate.query(query, new AccountRoleMapper());
	}
	
	public AccountRole GetAccountRole(BigDecimal id) {;
		String query = "Select * from ThuongMaiDienTu_Web.\"Roles\" where ID = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { id }, new AccountRoleMapper());
	}
	
	public boolean CreateAccountRole(AccountRole accountRole) {
		String query = "Insert into ThuongMaiDienTu_Web.\"Roles\"(\"name\", \"description\", createAt, updateAt) values(?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { accountRole.getName(), accountRole.getDescription() });
		return (affected > 0);
	}

	public boolean UpdateAccountRole(AccountRole accountRole) {
		String query = "Update ThuongMaiDienTu_Web.\"Roles\" set \"name\" = ?, \"description\" = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { accountRole.getName(), accountRole.getDescription(), accountRole.getID() });
		return (affected > 0);
	}
	
	public boolean DeleteAccountRole(BigDecimal id) {
		String query = "Delete from ThuongMaiDienTu_Web.\"Roles\" where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public int CountAccountRole() {
		String query = "Select count(*) from ThuongMaiDienTu_Web.\"Roles\"";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
	
	public boolean IsExistAccountRoleById(BigDecimal id) {
		String query = "Select count(*) from ThuongMaiDienTu_Web.\"Roles\" where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistAccountRoleByName(String name) {
		String query = "Select count(*) from ThuongMaiDienTu_Web.\"Roles\" where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
}
