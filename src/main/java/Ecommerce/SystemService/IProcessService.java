package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.Process;

@Service
public interface IProcessService {
	@Autowired
	
	List<Process> GetProcesses();
	
	Process GetProcess(String addr);
}
