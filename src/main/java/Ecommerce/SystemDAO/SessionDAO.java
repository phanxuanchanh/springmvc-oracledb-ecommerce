package Ecommerce.SystemDAO;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemDTO.ProcessVsSession;
import Ecommerce.SystemDTO.ProcessVsSessionMapper;
import Ecommerce.SystemEntity.Session;
import Ecommerce.SystemEntity.SessionMapper;

@SuppressWarnings("restriction")
@Repository
public class SessionDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Session> GetSessions(){
		String query = "Select process, paddr, program, saddr, serial#, sid, type, username from v$session where type != 'BACKGROUND'";
		return jdbcTemplate.query(query, new SessionMapper(false));
	}
	
	public Session GetSession(String saddr) {
		String query = "Select * from v$session where saddr = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { saddr }, new SessionMapper(true));
	}
	
	public List<ProcessVsSession> GetProcessVsSessions(){
		String query = "select s.saddr, s.sid, s.serial#, s.username, s.program, p.addr, p.pid, p.sosid, p.spid, p.pname from v$process p, v$session s where p.addr = s.paddr and type != 'BACKGROUND'";
		return jdbcTemplate.query(query, new ProcessVsSessionMapper());
	}
	
	public void DeleteSession(BigDecimal sid, BigDecimal serial) {
		String query = String.format("Alter system kill session '%s, %s' immediate", sid, serial);
		jdbcTemplate.execute(query);
	}
	
	public boolean IsExistSessionBySaddr(String saddr) {
		String query = "Select count(*) from v$session where saddr = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { saddr }, Integer.class);
		return (count > 0);
	}
	
	public boolean IsExistSessionBySidAndSerial(BigDecimal sid, BigDecimal serial) {
		String query = "Select count(*) from v$session where sid = ? and serial# = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { sid, serial }, Integer.class);
		return (count > 0);
	}
}
