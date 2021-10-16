package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.TablespaceDAO;
import Ecommerce.SystemDTO.TablespaceInput;
import Ecommerce.SystemEntity.Tablespace;

@Service
public class TablespaceServiceImpl implements ITablespaceService {
	@Autowired
	private TablespaceDAO tablespaceDAO;

	public List<Tablespace> GetTablespaces() {
		return tablespaceDAO.GetTablespaces();
	}

	public Tablespace GetTablespace(String tablespaceName) {
		if(tablespaceDAO.IsExistTablespaceByTablespaceName(tablespaceName))
			return tablespaceDAO.GetTablespace(tablespaceName);
		return null;
	}

	public boolean CreateTablespace(TablespaceInput tableSpaceInput) {
		if(tablespaceDAO.IsExistTablespaceByTablespaceName(tableSpaceInput.getTablespace_name()))
			return false;
		tablespaceDAO.CreateTablespace(tableSpaceInput);
		return true;
	}

	public boolean AddTablespace(TablespaceInput tablespaceInput) {
		if(tablespaceDAO.IsExistTablespaceByTablespaceName(tablespaceInput.getTablespace_name())) {
			tablespaceDAO.AddDatafile(tablespaceInput);
			return true;
		}
		return false;
	}

	public boolean DeleteTablespace(String tablespaceName, boolean deleteDatafile) {
		if(tablespaceDAO.IsExistTablespaceByTablespaceName(tablespaceName)) {
			tablespaceDAO.DeleteTablespace(tablespaceName, deleteDatafile);
			return true;
		}
		return false;
	}
}
