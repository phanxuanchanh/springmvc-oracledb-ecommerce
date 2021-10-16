package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SessionMapper implements RowMapper<Session> {

	private boolean fullColumn;

	public SessionMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public Session mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new Session(rs.getString("action"), rs.getBigDecimal("action_hash"), rs.getBigDecimal("audsid"),
					rs.getBigDecimal("blocking_instance"), rs.getBigDecimal("blocking_session"),
					rs.getString("blocking_session_status"), rs.getString("client_identifier"),
					rs.getString("client_info"), rs.getBigDecimal("command"), rs.getBigDecimal("con_id"),
					rs.getString("creator_addr"), rs.getBigDecimal("creator_serial#"),
					rs.getBigDecimal("current_queue_duration"), rs.getString("ecid"), rs.getString("event"),
					rs.getBigDecimal("event#"), rs.getString("external_name"), rs.getString("failed_over"),
					rs.getString("failover_method"), rs.getString("failover_type"),
					rs.getBigDecimal("final_blocking_instance"), rs.getBigDecimal("final_blocking_session"),
					rs.getString("final_blocking_session_status"), rs.getBigDecimal("fixed_table_sequence"),
					rs.getBigDecimal("last_call_et"), rs.getString("lockwait"), rs.getTimestamp("logon_time"),
					rs.getString("machine"), rs.getString("module"), rs.getBigDecimal("module_hash"),
					rs.getString("osuser"), rs.getBigDecimal("ownerid"), rs.getString("paddr"),
					rs.getString("pddl_status"), rs.getString("pdml_enabled"), rs.getString("pdml_status"),
					rs.getBigDecimal("pga_tunable_mem"), rs.getString("plsql_debugger_connected"),
					rs.getBigDecimal("plsql_entry_object_id"), rs.getBigDecimal("plsql_entry_subprogram_id"),
					rs.getBigDecimal("plsql_object_id"), rs.getBigDecimal("plsql_subprogram_id"),
					rs.getBigDecimal("port"), rs.getString("pq_status"), rs.getBigDecimal("prev_child_number"),
					rs.getBigDecimal("prev_exec_id"), rs.getTimestamp("prev_exec_start"),
					rs.getBigDecimal("prev_hash_value"), rs.getString("prev_sql_addr"), rs.getString("prev_sql_id"),
					rs.getString("process"), rs.getString("program"), rs.getBigDecimal("p1"), rs.getString("p1raw"),
					rs.getString("p1text"), rs.getBigDecimal("p2"), rs.getString("p2raw"), rs.getString("p2text"),
					rs.getBigDecimal("p3"), rs.getString("p3raw"), rs.getString("p3text"),
					rs.getString("resource_consumer_group"), rs.getBigDecimal("row_wait_block#"),
					rs.getBigDecimal("row_wait_file#"), rs.getBigDecimal("row_wait_obj#"),
					rs.getBigDecimal("row_wait_row#"), rs.getString("saddr"), rs.getBigDecimal("schema#"),
					rs.getString("schemaname"), rs.getBigDecimal("seconds_in_wait"), rs.getBigDecimal("seq#"),
					rs.getBigDecimal("serial#"), rs.getString("server"), rs.getString("service_name"),
					rs.getBigDecimal("session_edition_id"), rs.getString("shard_ddl_status"), rs.getBigDecimal("sid"),
					rs.getString("sql_address"), rs.getBigDecimal("sql_child_number"), rs.getBigDecimal("sql_exec_id"),
					rs.getTimestamp("sql_exec_start"), rs.getBigDecimal("sql_hash_value"), rs.getString("sql_id"),
					rs.getString("sql_trace"), rs.getString("sql_trace_binds"), rs.getString("sql_trace_plan_stats"),
					rs.getString("sql_trace_waits"), rs.getBigDecimal("sql_translation_profile_id"),
					rs.getString("state"), rs.getString("status"), rs.getString("taddr"), rs.getString("terminal"),
					rs.getBigDecimal("time_remaining_micro"), rs.getBigDecimal("time_since_last_wait_micro"),
					rs.getBigDecimal("top_level_call#"), rs.getString("type"), rs.getBigDecimal("user#"),
					rs.getString("username"), rs.getString("wait_class"), rs.getBigDecimal("wait_class#"),
					rs.getBigDecimal("wait_class_id"), rs.getBigDecimal("wait_time"),
					rs.getBigDecimal("wait_time_micro"));

		return new Session(rs.getString("process"), rs.getString("paddr"), rs.getString("program"), rs.getString("saddr"),
				rs.getBigDecimal("serial#"), rs.getBigDecimal("sid"), rs.getString("type"), rs.getString("username"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
