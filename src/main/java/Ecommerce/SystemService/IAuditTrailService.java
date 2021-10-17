package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.AuditTrail;

@Service
public interface IAuditTrailService {
	@Autowired
	
	List<AuditTrail> GetAuditTrails();
	
	List<AuditTrail> GetAuditTrails_BySchema(String schemaName);
}
