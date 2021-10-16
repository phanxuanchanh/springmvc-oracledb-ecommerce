package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemDTO.TablespaceInput;
import Ecommerce.SystemEntity.Tablespace;
import Ecommerce.SystemEntity.TablespaceMapper;

@SuppressWarnings("restriction")
@Repository
public class TablespaceDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;

	public List<Tablespace> GetTablespaces() {
		String query = "Select tablespace_name, block_size, initial_extent, next_extent, status, contents from dba_tablespaces";
		return jdbcTemplate.query(query, new TablespaceMapper(false));
	}

	public Tablespace GetTablespace(String tablespaceName) {
		String query = "Select * from dba_tablespaces where tablespace_name = upper(?)";
		return jdbcTemplate.queryForObject(query, new Object[] { tablespaceName }, new TablespaceMapper(true));
	}

	public void CreateTablespace(TablespaceInput tablespaceInput) {
		String[] datafiles = tablespaceInput.getDatafiles().split(";");
		String[] sizes = tablespaceInput.getSizes().split(";");

		StringBuilder stringBuilder = new StringBuilder(
				String.format("Create tablespace %s datafile ", tablespaceInput.getTablespace_name()));
		for(int i = 0; i < datafiles.length; i++){
			if(i == datafiles.length - 1)
				stringBuilder.append(String.format("'%s' size %s", datafiles[i], sizes[i]));
			else
				stringBuilder.append(String.format("'%s' size %s, ", datafiles[i], sizes[i]));
		}
		jdbcTemplate.execute(stringBuilder.toString());
	}
	
	public void AddDatafile(TablespaceInput tablespaceInput) {
		String query = String.format("Alter tablespace %s add datafile '%s' size %s", 
				tablespaceInput.getTablespace_name(), tablespaceInput.getDatafiles(), tablespaceInput.getSizes());
		jdbcTemplate.execute(query);
	}
	
	public void DeleteTablespace(String tablespaceName, boolean deleteDatafile) {
		String query;
		if(deleteDatafile)
			query = String.format("Drop tablespace %s including contents and datafiles", tablespaceName);
		else 
			query = String.format("Drop tablespace %s", tablespaceName);
		
		jdbcTemplate.execute(query);
	}

	public boolean IsExistTablespaceByTablespaceName(String tablespaceName) {
		String query = "Select count(*) from dba_tablespaces where tablespace_name = upper(?)";
		int count = jdbcTemplate.queryForObject(query, new Object[] { tablespaceName }, Integer.class);
		return (count > 0);
	}
}
