package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.AuditPolicyDAO;
import Ecommerce.SystemDAO.TableDAO;
import Ecommerce.SystemDAO.UserDAO;
import Ecommerce.SystemDTO.AuditPolicyInput;
import Ecommerce.SystemEntity.AuditPolicy;

@Service
public class AuditPolicyServiceImpl implements IAuditPolicyService {
	@Autowired
	private AuditPolicyDAO auditPolicyDAO;

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private TableDAO tableDAO;

	public List<AuditPolicy> GetAuditPolicies() {
		return auditPolicyDAO.GetAuditPolicies();
	}

	public boolean CreateAuditPolicy(AuditPolicyInput auditPolicyInput) {
		if (userDAO.IsExistUserByUsername(auditPolicyInput.getObject_schema())
				&& tableDAO.IsExistTableByName(auditPolicyInput.getObject_name())) {
			auditPolicyDAO.CreateAuditPolicy(auditPolicyInput);
			return true;
		}
		return false;
	}
}
