package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Datafile2Mapper implements RowMapper<Datafile2> {
	private boolean fullColumn;
	
	public Datafile2Mapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
	
	public Datafile2 mapRow(ResultSet rs, int rowNum) throws SQLException {
		if(fullColumn)
			return new Datafile2();
		
		return new Datafile2();
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

}
