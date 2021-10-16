package Ecommerce.SystemDAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.User;
import Ecommerce.SystemEntity.UserMapper;

@SuppressWarnings("restriction")
@Repository
public class UserDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<User> GetDba_Users() {
		List<User> dba_users = new ArrayList<User>();
		String query = "Select * from dba_users";
		dba_users = jdbcTemplate.query(query, new UserMapper());
		return dba_users;
	}
	
	public User GetDba_User(String username) {
		User dba_User = null;
		String query = "Select * from dba_users where username = ?";
		dba_User = jdbcTemplate.queryForObject(query, new Object[] { username }, new UserMapper());
		return dba_User;
	}
	
	public boolean IsExistDba_UserByUsername(String username) {
		String query = "Select count(*) from dba_users where username = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { username }, Integer.class);
		return (count > 0);
	}
}
