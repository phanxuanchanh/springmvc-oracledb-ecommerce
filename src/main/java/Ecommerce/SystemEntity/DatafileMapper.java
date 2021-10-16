package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DatafileMapper implements RowMapper<Datafile> {
	private boolean fullColumn;

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public DatafileMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public Datafile mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new Datafile(rs.getString("file_name"), rs.getBigDecimal("file_id"), rs.getString("tablespace_name"),
					rs.getBigDecimal("bytes"), rs.getBigDecimal("blocks"), rs.getString("status"),
					rs.getBigDecimal("relative_fno"), rs.getString("autoextensible"), rs.getBigDecimal("maxbytes"),
					rs.getBigDecimal("maxblocks"), rs.getBigDecimal("increment_by"), rs.getBigDecimal("user_bytes"),
					rs.getBigDecimal("user_blocks"), rs.getString("online_status"), rs.getString("lost_write_protect"));

		return new Datafile(rs.getString("file_name"), rs.getBigDecimal("file_id"), rs.getString("tablespace_name"));
	}
}
