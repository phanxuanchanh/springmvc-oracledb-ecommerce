package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.TablespaceInput;
import Ecommerce.SystemEntity.Tablespace;

@Service
public interface ITablespaceService {
	@Autowired
	
	List<Tablespace> GetTablespaces();
	
	Tablespace GetTablespace(String tablespaceName);
	
	boolean CreateTablespace(TablespaceInput tableSpaceInput);
	
	boolean AddTablespace(TablespaceInput tablespaceInput);
	
	boolean DeleteTablespace(String tablespaceName, boolean deleteDatafile);
}
