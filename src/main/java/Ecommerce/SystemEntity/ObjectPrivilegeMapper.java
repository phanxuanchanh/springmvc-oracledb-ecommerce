package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ObjectPrivilegeMapper implements RowMapper<ObjectPrivilege> {
	private boolean fullColumn;

	public ObjectPrivilegeMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public ObjectPrivilege mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new ObjectPrivilege(rs.getString("grantee"), rs.getString("owner"), rs.getString("table_name"),
					rs.getString("grantor"), rs.getString("privilege"), rs.getString("grantable"),
					rs.getString("hierarchy"), rs.getString("common"), rs.getString("type"), rs.getString("inherited"));

		return new ObjectPrivilege(rs.getString("grantee"), rs.getString("privilege"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
