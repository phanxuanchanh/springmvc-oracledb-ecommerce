package Ecommerce.SystemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProcessVsSessionMapper implements RowMapper<ProcessVsSession> {

	public ProcessVsSession mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new ProcessVsSession(rs.getString("saddr"), rs.getBigDecimal("sid"), rs.getBigDecimal("serial#"),
				rs.getString("username"), rs.getString("program"), rs.getString("addr"), rs.getBigDecimal("pid"),
				rs.getString("sosid"), rs.getString("spid"), rs.getString("pname"));
	}

}
