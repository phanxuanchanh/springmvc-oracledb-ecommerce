package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.DatafileDAO;
import Ecommerce.SystemEntity.Datafile;

@Service
public class DatafileServiceImpl implements IDatafileService {
	@Autowired
	private DatafileDAO datafileDAO;
	
	public List<Datafile> GetDatafiles() {
		return datafileDAO.GetDatafiles();
	}
	
	public List<Datafile> GetDatafiles_ByTablespace(String tablespaceName) {
		return datafileDAO.GetDatafiles_ByTablespace(tablespaceName);
	}

	public Datafile GetDatafile(BigDecimal fileId) {
		if(datafileDAO.IsExistDatafileByFileId(fileId))
			return datafileDAO.GetDatafile(fileId);
		return null;
	}
}
