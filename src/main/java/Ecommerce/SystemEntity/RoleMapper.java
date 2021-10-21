package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RoleMapper implements RowMapper<Role> {
	private boolean fullColumn;
	
	public RoleMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
	
	public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
		if(fullColumn)
			return new Role(rs.getString("role"), rs.getBigDecimal("role_id"), rs.getString("password_required"), rs.getString("authentication_type"), rs.getString("common"),
					rs.getString("oracle_maintained"), rs.getString("inherited"), rs.getString("implicit"), rs.getString("external_name"));
		
		return new Role(rs.getString("role"), rs.getBigDecimal("role_id"), rs.getString("password_required"), rs.getString("authentication_type"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
