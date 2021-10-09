package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.ProcessDAO;
import Ecommerce.SystemEntity.Process;

@Service
public class ProcessServiceImpl implements IProcessService {
	@Autowired
	private ProcessDAO processDAO;
	
	public List<Process> GetProcesses() {
		return processDAO.GetProcesses();
	}
}
