package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RoleMapper implements RowMapper<Role> {

	public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
		Role role = new Role(rs.getBigDecimal("ID"), rs.getString("name"), rs.getString("description"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return role;
	}
}
