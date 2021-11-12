package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DatabaseMapper implements RowMapper<Database> {
	private boolean fullColumn;

	public DatabaseMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public Database mapRow(ResultSet rs, int rowNum) throws SQLException {
		if(fullColumn)
			return new Database(rs.getBigDecimal("dbid"), rs.getString("name"), rs.getTimestamp("created"), rs.getBigDecimal("resetlogs_change#"),
					rs.getTimestamp("resetlogs_time"), rs.getBigDecimal("prior_resetlogs_change#"), rs.getTimestamp("prior_resetlogs_time"),
					rs.getString("log_mode"), rs.getBigDecimal("checkpoint_change#"), rs.getBigDecimal("archive_change#"), rs.getString("controlfile_type"),
					rs.getTimestamp("controlfile_created"), rs.getBigDecimal("controlfile_sequence#"), rs.getBigDecimal("controlfile_change#"),
					rs.getTimestamp("controlfile_time"), rs.getString("open_resetlogs"), rs.getTimestamp("version_time"), rs.getString("open_mode"),
					rs.getString("protection_mode"), rs.getString("protection_level"), rs.getString("remote_archive"), rs.getBigDecimal("activation#"),
					rs.getBigDecimal("switchover#"), rs.getString("database_role"), rs.getBigDecimal("archivelog_change#"), rs.getString("archivelog_compression"),
					rs.getString("switchover_status"), rs.getString("dataguard_broker"), rs.getString("guard_status"), rs.getString("supplemental_log_data_min"),
					rs.getString("supplemental_log_data_pk"), rs.getString("supplemental_log_data_ui"), rs.getString("force_logging"),
					rs.getBigDecimal("platform_id"), rs.getString("platform_name"), rs.getBigDecimal("recovery_target_incarnation#"),
					rs.getBigDecimal("last_open_incarnation#"), rs.getBigDecimal("current_scn"), rs.getString("flashback_on"),
					rs.getString("supplemental_log_data_fk"), rs.getString("supplemental_log_data_all"), rs.getString("db_unique_name"),
					rs.getBigDecimal("standby_became_primary_scn"), rs.getString("fs_failover_mode"), rs.getString("fs_failover_status"),
					rs.getString("fs_failover_current_target"), rs.getBigDecimal("fs_failover_observer_present"),
					rs.getString("fs_failover_observer_host"), rs.getString("controlfile_converted"), rs.getString("primary_db_unique_name"),
					rs.getString("supplemental_log_data_pl"), rs.getBigDecimal("min_required_capture_change#"), rs.getString("cdb"), rs.getBigDecimal("con_id"),
					rs.getString("pending_role_change_tasks"), rs.getBigDecimal("con_dbid"), rs.getString("force_full_db_caching"),
					rs.getString("supplemental_log_data_sr"));
		
		return new Database(rs.getBigDecimal("dbid"), rs.getString("name"), rs.getTimestamp("created"), rs.getString("open_mode"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
