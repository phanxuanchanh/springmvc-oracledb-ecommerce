package Ecommerce.SystemDAO;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.Datafile;
import Ecommerce.SystemEntity.DatafileMapper;

@SuppressWarnings("restriction")
@Repository
public class DatafileDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Datafile> GetDatafiles() {
		String query = "Select file_name, file_id, tablespace_name from dba_data_files";
		return jdbcTemplate.query(query, new DatafileMapper(false));
	}
	
	public List<Datafile> GetDatafiles_ByTablespace(String tablespaceName) {
		String query = "Select file_name, file_id, tablespace_name from dba_data_files where tablespace_name = upper(?)";
		return jdbcTemplate.query(query, new Object[] { tablespaceName }, new DatafileMapper(false));
	}
	
	public Datafile GetDatafile(BigDecimal fileId) {
		String query = "Select * from dba_data_files where file_id = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { fileId }, new DatafileMapper(true));
	}
	
	public boolean IsExistDatafileByFileId(BigDecimal fileId) {
		String query = "Select count(*) from dba_data_files where file_id = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { fileId }, Integer.class);
		return (count > 0);
	}
}
