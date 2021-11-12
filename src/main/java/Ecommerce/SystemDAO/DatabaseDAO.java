package Ecommerce.SystemDAO;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.Database;
import Ecommerce.SystemEntity.DatabaseMapper;

@SuppressWarnings("restriction")
@Repository
public class DatabaseDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Database> GetDatabases(){
		String query = "Select dbid, name, created, open_mode from v$database";
		return jdbcTemplate.query(query, new DatabaseMapper(false));
	}
	
	public Database GetDatabase(BigDecimal dbid) {
		String query = "Select * from v$database where dbid = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { dbid }, new DatabaseMapper(true));
	}
	
	public boolean IsExistDatabaseByDbid(BigDecimal dbid) {
		String query = "Select count(*) from v$database where dbid = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { dbid }, Integer.class);
		return (count > 0);
	}
}
