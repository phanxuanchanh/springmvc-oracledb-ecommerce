package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PaymentTypeMapper implements RowMapper<PaymentType> {

	public PaymentType mapRow(ResultSet rs, int rowNum) throws SQLException {
		PaymentType paymentType = new PaymentType(rs.getBigDecimal("ID"), rs.getString("name"), rs.getString("description"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return paymentType;
	}
}
