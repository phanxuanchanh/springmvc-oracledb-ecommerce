package Ecommerce.SystemDAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.Process;
import Ecommerce.SystemEntity.ProcessMapper;

@SuppressWarnings("restriction")
@Repository
public class ProcessDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Process> GetProcesses() {
		List<Process> processes = new ArrayList<Process>();
		String query = "Select * from v$process";
		processes = jdbcTemplate.query(query, new ProcessMapper());
		return processes;
	}
}
