package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdminMapper implements RowMapper<Admin> {

	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin admin = new Admin(rs.getBigDecimal("ID"), rs.getString("username"), rs.getString("fullname"), 
				rs.getString("gender"), rs.getString("description"), rs.getString("email"), rs.getTimestamp("birthday"), 
				rs.getString("avatar"), rs.getString("phone"), rs.getString("password"), rs.getBigDecimal("roleId"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return admin;
	}

}
