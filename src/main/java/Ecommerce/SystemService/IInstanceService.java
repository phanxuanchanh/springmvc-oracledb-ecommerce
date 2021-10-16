package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.Instance;

@Service
public interface IInstanceService {
	@Autowired
	
	List<Instance> GetInstances();
	
	Instance GetInstance(BigDecimal instanceNumber);
}
