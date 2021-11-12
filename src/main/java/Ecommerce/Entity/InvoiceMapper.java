package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class InvoiceMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invoice invoice = new Invoice(rs.getBigDecimal("iD"), rs.getBigDecimal("customerId"),
				rs.getTimestamp("orderDate"), rs.getTimestamp("shipedDate"), rs.getString("address1"),
				rs.getString("address2"), rs.getString("city"), rs.getString("state"), rs.getString("postalCode"),
				rs.getString("country"), rs.getBigDecimal("fee"), rs.getBigDecimal("paymentTypeId"),
				rs.getTimestamp("paidDate"), rs.getBigDecimal("invoiceStateId"), rs.getBigDecimal("totalMoney"));
		return invoice;
	}
}
