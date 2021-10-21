package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SupplierMapper implements RowMapper<Supplier> {

	public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
		Supplier supplier = new Supplier(rs.getBigDecimal("ID"), rs.getString("name"), rs.getString("description"),
				rs.getString("phone"), rs.getString("email"), rs.getString("fax"), rs.getTimestamp("createAt"),
				rs.getTimestamp("updateAt"));
		return supplier;
	}
}
