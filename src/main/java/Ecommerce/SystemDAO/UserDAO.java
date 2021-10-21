package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemDTO.UserInput;
import Ecommerce.SystemDTO.UserPermissionForm;
import Ecommerce.SystemEntity.User;
import Ecommerce.SystemEntity.UserMapper;

@SuppressWarnings("restriction")
@Repository
public class UserDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;

	public List<User> GetUsers() {
		String query = "Select * from dba_users where default_tablespace != 'SYSTEM' and default_tablespace != 'SYSAUX'";
		return jdbcTemplate.query(query, new UserMapper());
	}
	
	public List<User> GetUsers_ByUsernameKeyword(String usernameKeyword) {
		String query = "Select * from dba_users where username like upper(?)";
		return jdbcTemplate.query(query, new Object[] { "%" + usernameKeyword + "%" }, new UserMapper());
	}

	public User GetUser(String username) {
		String query = "Select * from dba_users where username = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { username }, new UserMapper());
	}

	public void CreateUser(UserInput userInput) {
		String query = String.format("Create user %s identified by %s default tablespace %s quota %s on %s profile %s",
				userInput.getUsername(), userInput.getPassword(), userInput.getTablespace(), userInput.getQuota(),
				userInput.getTablespace(), userInput.getProfile());
		jdbcTemplate.execute(query);
	}
	
	public void UpdateUser(UserInput userInput) {
		String query = String.format("Alter user %s identified by %s default tablespace %s quota %s on %s profile %s",
				userInput.getUsername(), userInput.getPassword(), userInput.getTablespace(), userInput.getQuota(),
				userInput.getTablespace(), userInput.getProfile());
		jdbcTemplate.execute(query);
	}
	
	public void GrantPermissions(UserPermissionForm userPermissionForm) {
		String query = String.format("Grant %s to %s", userPermissionForm.getPermissions(), userPermissionForm.getUsername());
		jdbcTemplate.execute(query);
	}
	
	public void RevokePermissions(UserPermissionForm userPermissionForm) {
		String query = String.format("Revoke %s from %s", userPermissionForm.getPermissions(), userPermissionForm.getUsername());
		jdbcTemplate.execute(query);
	}
	
	public void DeleteUser(String username) {
		String query = String.format("Drop user %s cascade", username);
		jdbcTemplate.execute(query);
	}

	public boolean IsExistUserByUsername(String username) {
		String query = "Select count(*) from dba_users where username = upper(?)";
		int count = jdbcTemplate.queryForObject(query, new Object[] { username }, Integer.class);
		return (count > 0);
	}
}
