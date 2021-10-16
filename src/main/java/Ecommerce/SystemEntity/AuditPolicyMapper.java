package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AuditPolicyMapper implements RowMapper<AuditPolicy> {
	private boolean fullColumn;

	public AuditPolicyMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public AuditPolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new AuditPolicy(rs.getString("object_schema"), rs.getString("object_name"),
					rs.getString("policy_owner"), rs.getString("policy_name"), rs.getString("policy_text"),
					rs.getString("policy_column"), rs.getString("pf_schema"), rs.getString("pf_package"),
					rs.getString("pf_function"), rs.getString("enabled"), rs.getString("sel"), rs.getString("ins"),
					rs.getString("upd"), rs.getString("del"), rs.getString("audit_trail"),
					rs.getString("policy_column_options"), rs.getString("common"), rs.getString("inherited"));

		return new AuditPolicy(rs.getString("object_schema"), rs.getString("object_name"), rs.getString("policy_owner"),
				rs.getString("policy_name"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
