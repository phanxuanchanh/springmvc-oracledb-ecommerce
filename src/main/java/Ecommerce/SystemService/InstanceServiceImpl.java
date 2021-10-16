package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.InstanceDAO;
import Ecommerce.SystemEntity.Instance;

@Service
public class InstanceServiceImpl implements IInstanceService {
	@Autowired
	private InstanceDAO instanceDAO;
	
	public List<Instance> GetInstances() {
		return instanceDAO.GetInstances();
	}

	public Instance GetInstance(BigDecimal instanceNumber) {
		if(instanceDAO.IsExistInstanceByInstanceNumber(instanceNumber))
			return instanceDAO.GetInstance(instanceNumber);
		return null;
	}
}
