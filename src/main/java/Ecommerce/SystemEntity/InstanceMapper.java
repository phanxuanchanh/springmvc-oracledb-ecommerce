package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InstanceMapper implements RowMapper<Instance> {
	private boolean fullColumn;

	public InstanceMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public Instance mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new Instance(rs.getBigDecimal("instance_number"), rs.getString("instance_name"),
					rs.getString("host_name"), rs.getString("version"), rs.getString("version_legacy"),
					rs.getString("version_full"), rs.getTimestamp("startup_time"), rs.getString("status"),
					rs.getString("parallel"), rs.getBigDecimal("thread#"), rs.getString("archiver"),
					rs.getString("log_switch_wait"), rs.getString("logins"), rs.getString("shutdown_pending"),
					rs.getString("database_status"), rs.getString("instance_role"), rs.getString("active_state"),
					rs.getString("blocked"), rs.getBigDecimal("con_id"), rs.getString("instance_mode"),
					rs.getString("edition"), rs.getString("family"), rs.getString("database_type"));

		return new Instance(rs.getBigDecimal("instance_number"), rs.getString("instance_name"),
				rs.getString("host_name"), rs.getString("version"), rs.getTimestamp("startup_time"),
				rs.getString("status"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
