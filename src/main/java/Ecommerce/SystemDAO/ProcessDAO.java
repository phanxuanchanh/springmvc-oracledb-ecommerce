package Ecommerce.SystemDAO;

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
		String query = "Select addr, pid, sosid, spid, stid, execution_type, pname, username from v$process";
		return jdbcTemplate.query(query, new ProcessMapper(false));
	}
	
	public Process GetProcess(String addr) {
		String query = "Select * from v$process where addr = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { addr }, new ProcessMapper(true));
	}
	
	public boolean IsExistProcessByAddr(String addr) {
		String query = "Select count(*) from v$process where addr = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { addr }, Integer.class);
		return (count > 0);
	}
}
