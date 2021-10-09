package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SGAMapper implements RowMapper<SGA> {

	public SGA mapRow(ResultSet rs, int rowNum) throws SQLException {
		SGA sga = new SGA(rs.getString("name"), rs.getBigDecimal("value"), rs.getBigDecimal("con_id"));
		return sga;
	}
}
