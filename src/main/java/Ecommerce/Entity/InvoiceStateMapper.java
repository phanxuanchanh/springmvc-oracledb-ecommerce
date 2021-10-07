package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InvoiceStateMapper implements RowMapper<InvoiceState> {

	public InvoiceState mapRow(ResultSet rs, int rowNum) throws SQLException {
		InvoiceState invoiceState = new InvoiceState(rs.getBigDecimal("ID"), rs.getString("name"), rs.getString("description"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return invoiceState;
	}
}
