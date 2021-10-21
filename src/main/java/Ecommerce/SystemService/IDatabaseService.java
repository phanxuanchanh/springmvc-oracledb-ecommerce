package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.Database;

@Service
public interface IDatabaseService {
	@Autowired
	
	List<Database> GetDatabases();
	
	Database GetDatabase(BigDecimal dbid);
}
