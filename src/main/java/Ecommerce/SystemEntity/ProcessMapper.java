package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProcessMapper implements RowMapper<Process> {
	private boolean fullColumn;

	public ProcessMapper(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}

	public Process mapRow(ResultSet rs, int rowNum) throws SQLException {
		if (fullColumn)
			return new Process(rs.getString("addr"), rs.getBigDecimal("pid"), rs.getString("sosid"),
					rs.getString("spid"), rs.getString("stid"), rs.getString("execution_type"), rs.getString("pname"),
					rs.getString("username"), rs.getBigDecimal("serial#"), rs.getString("terminal"),
					rs.getString("program"), rs.getString("traceid"), rs.getString("tracefile"),
					rs.getString("background"), rs.getString("latchwait"), rs.getString("latchspin"),
					rs.getBigDecimal("pga_used_mem"), rs.getBigDecimal("pga_alloc_mem"),
					rs.getBigDecimal("pga_freeable_mem"), rs.getBigDecimal("pga_max_mem"),
					rs.getBigDecimal("numa_default"), rs.getBigDecimal("numa_curr"), rs.getBigDecimal("cpu_used"),
					rs.getBigDecimal("con_id"));

		return new Process(rs.getString("addr"), rs.getBigDecimal("pid"), rs.getString("sosid"), rs.getString("spid"),
				rs.getString("stid"), rs.getString("execution_type"), rs.getString("pname"), rs.getString("username"));
	}

	public void setFullColumn(boolean fullColumn) {
		this.fullColumn = fullColumn;
	}
}
