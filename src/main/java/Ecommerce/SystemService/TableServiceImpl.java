package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.TableDAO;
import Ecommerce.SystemDTO.TableOutput;
import Ecommerce.SystemEntity.Table;

@Service
public class TableServiceImpl implements ITableService {
	@Autowired
	private TableDAO tableDAO;

	public List<Table> GetTables() {
		return tableDAO.GetTables();
	}

	public Table GetTable(String tableName) {
		if(tableDAO.IsExistTableByName(tableName))
			return tableDAO.GetTable(tableName);
		return null;
	}

	public List<TableOutput> GetTables_ByOwner(String owner) {
		return tableDAO.GetTables_ByOwner(owner);
	}
}
