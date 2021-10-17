package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.AuditTrail;
import Ecommerce.SystemEntity.AuditTrailMapper;

@SuppressWarnings("restriction")
@Repository
public class AuditTrailDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<AuditTrail> GetAuditPolicies() {
		String query = "Select * from dba_fga_audit_trail";
		return jdbcTemplate.query(query, new AuditTrailMapper(true));
	}
	
	public List<AuditTrail> GetAuditPolicies_BySchema(String schemaName) {
		String query = "Select * from dba_fga_audit_trail where object_schema = upper(?)";
		return jdbcTemplate.query(query, new Object[] { schemaName }, new AuditTrailMapper(true));
	}
}
