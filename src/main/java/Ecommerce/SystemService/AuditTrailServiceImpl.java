package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.AuditTrailDAO;
import Ecommerce.SystemEntity.AuditTrail;

@Service
public class AuditTrailServiceImpl implements IAuditTrailService {
	@Autowired
	private AuditTrailDAO auditTrailDAO;
	
	public List<AuditTrail> GetAuditTrails() {
		return auditTrailDAO.GetAuditPolicies();
	}

	public List<AuditTrail> GetAuditTrails_BySchema(String schemaName) {
		return auditTrailDAO.GetAuditPolicies_BySchema(schemaName);
	}
}
