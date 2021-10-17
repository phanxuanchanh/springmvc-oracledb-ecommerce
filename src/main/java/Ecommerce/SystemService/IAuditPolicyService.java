package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.AuditPolicyInput;
import Ecommerce.SystemEntity.AuditPolicy;

@Service
public interface IAuditPolicyService {
	@Autowired
	
	List<AuditPolicy> GetAuditPolicies();
	
	boolean CreateAuditPolicy(AuditPolicyInput auditPolicyInput);
}
