package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AuditTrailMapper implements RowMapper<AuditTrail> {
	private boolean fullColumn;

	public AuditTrailMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public AuditTrail mapRow(ResultSet rs, int rowNum) throws SQLException {
		if(fullColumn)
			return new AuditTrail(rs.getBigDecimal("session_id"), rs.getTimestamp("timestamp"), rs.getString("db_user"), rs.getString("os_user"), rs.getString("userhost"),
					rs.getString("client_id"), rs.getString("econtext_id"), rs.getString("ext_name"), rs.getString("object_schema"), rs.getString("object_name"),
					rs.getString("policy_name"), rs.getBigDecimal("scn"), rs.getString("sql_text"), rs.getString("sql_bind"), rs.getString("comment$text"),
					rs.getString("statement_type"), rs.getTimestamp("extended_timestamp"), rs.getBigDecimal("proxy_sessionid"), rs.getString("global_uid"),
					rs.getBigDecimal("instance_number"), rs.getString("os_process"), rs.getString("transactionid"), rs.getBigDecimal("statementid"),
					rs.getBigDecimal("entryid"), rs.getString("obj_edition_name"), rs.getBigDecimal("dbid"), rs.getClob("rls_info"), rs.getString("current_user"));
		
		return new AuditTrail(rs.getBigDecimal("session_id"), rs.getTimestamp("timestamp"), rs.getString("db_user"), rs.getString("os_user"), rs.getString("userhost"),
				rs.getString("object_schema"), rs.getString("object_name"), rs.getString("policy_name"), rs.getString("sql_text"), rs.getString("statement_type"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
