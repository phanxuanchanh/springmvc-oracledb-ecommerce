package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.TableOutput;
import Ecommerce.SystemEntity.Table;

@Service
public interface ITableService {
	@Autowired

	List<Table> GetTables();
	
	List<TableOutput> GetTables_ByOwner(String owner);
	
	Table GetTable(String tableName);
}
