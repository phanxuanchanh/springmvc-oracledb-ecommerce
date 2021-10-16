package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemDTO.TableOutput;
import Ecommerce.SystemDTO.TableOutputMapper;
import Ecommerce.SystemEntity.Table;
import Ecommerce.SystemEntity.TableMapper;

@SuppressWarnings("restriction")
@Repository
public class TableDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Table> GetTables(){
		String query = "Select * from dba_tables";
		return jdbcTemplate.query(query, new TableMapper());
	}
	
	public List<TableOutput> GetTables_ByOwner(String owner){
		String query = "Select * from dba_tables where owner = upper(?)";
		return jdbcTemplate.query(query, new Object[] { owner }, new TableOutputMapper());
	}
	
	public Table GetTable(String tableName) {
		String query = "Select * from dba_tables where table_name = upper(?)";
		return jdbcTemplate.queryForObject(query, new Object[] { tableName }, new TableMapper());
	}
	
	public boolean IsExistTableByName(String tableName) {
		String query = "Select count(*) from dba_tables where table_name = upper(?)";
		int count = jdbcTemplate.queryForObject(query, new Object[] { tableName }, Integer.class);
		return (count > 0);
	}
}
