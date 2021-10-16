package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.Datafile;

@Service
public interface IDatafileService {
	@Autowired
	
	List<Datafile> GetDatafiles();
	
	List<Datafile> GetDatafiles_ByTablespace(String tablespaceName);
	
	Datafile GetDatafile(BigDecimal fileId);
}
