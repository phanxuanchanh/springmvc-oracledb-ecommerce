package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemDTO.AuditPolicyInput;
import Ecommerce.SystemEntity.AuditPolicy;
import Ecommerce.SystemEntity.AuditPolicyMapper;

@SuppressWarnings("restriction")
@Repository
public class AuditPolicyDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;

	public List<AuditPolicy> GetAuditPolicies() {
		String query = "Select * from dba_audit_policies";
		return jdbcTemplate.query(query, new AuditPolicyMapper(true));
	}

	public void CreateAuditPolicy(AuditPolicyInput auditPolicyInput) {
		String query = String.format(
				"begin dbms_fga.add_policy(object_schema => '%s', object_name => '%s', policy_name => '%s', statement_types => '%s'); end;",
				auditPolicyInput.getObject_schema(), auditPolicyInput.getObject_name(),
				auditPolicyInput.getPolicy_name(), auditPolicyInput.getStatement_types());
		jdbcTemplate.execute(query);
	}

	/*
	 * public Datafile GetDatafile(BigDecimal fileId) { String query =
	 * "Select * from dba_data_files where file_id = ?"; return
	 * jdbcTemplate.queryForObject(query, new Object[] { fileId }, new
	 * DatafileMapper(true)); }
	 * 
	 * public boolean IsExistAuditPolicyByPolicyName(BigDecimal fileId) { String
	 * query = "Select count(*) from dba_data_files where file_id = ?"; int count =
	 * jdbcTemplate.queryForObject(query, new Object[] { fileId }, Integer.class);
	 * return (count > 0); }
	 */
}
