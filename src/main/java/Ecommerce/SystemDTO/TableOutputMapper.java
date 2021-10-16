package Ecommerce.SystemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TableOutputMapper implements RowMapper<TableOutput>{

	public TableOutput mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new TableOutput(rs.getString("owner"), rs.getString("table_name"), rs.getString("tablespace_name"));
	}
}
