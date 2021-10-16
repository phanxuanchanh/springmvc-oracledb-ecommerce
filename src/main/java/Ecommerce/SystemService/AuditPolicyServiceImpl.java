package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.AuditPolicyDAO;
import Ecommerce.SystemEntity.AuditPolicy;

@Service
public class AuditPolicyServiceImpl implements IAuditPolicyService {
	@Autowired
	private AuditPolicyDAO auditPolicyDAO;
	
	public List<AuditPolicy> GetAuditPolicies() {
		return auditPolicyDAO.GetAuditPolicies();
	}
}
