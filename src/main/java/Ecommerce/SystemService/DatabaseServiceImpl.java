package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.DatabaseDAO;
import Ecommerce.SystemEntity.Database;

@Service
public class DatabaseServiceImpl implements IDatabaseService {
	@Autowired
	private DatabaseDAO databaseDAO;
	
	public List<Database> GetDatabases() {
		return databaseDAO.GetDatabases();
	}

	public Database GetDatabase(BigDecimal dbid) {
		if(databaseDAO.IsExistDatabaseByDbid(dbid))
			return databaseDAO.GetDatabase(dbid);
		return null;
	}
}
