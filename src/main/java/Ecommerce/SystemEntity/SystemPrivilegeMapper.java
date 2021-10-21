package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SystemPrivilegeMapper implements RowMapper<SystemPrivilege> {
	private boolean fullColumn;

	public SystemPrivilegeMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public SystemPrivilege mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new SystemPrivilege(rs.getString("grantee"), rs.getString("privilege"), rs.getString("admin_option"),
					rs.getString("common"), rs.getString("inherited"));

		return new SystemPrivilege(rs.getString("grantee"), rs.getString("privilege"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
