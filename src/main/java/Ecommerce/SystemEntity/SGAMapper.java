package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SgaMapper implements RowMapper<Sga> {

	public Sga mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sga sga = new Sga(rs.getString("name"), rs.getBigDecimal("value"), rs.getBigDecimal("con_id"));
		return sga;
	}
}
