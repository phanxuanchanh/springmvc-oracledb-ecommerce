package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer(rs.getBigDecimal("ID"), rs.getString("username"), rs.getString("fullname"), 
				rs.getString("gender"), rs.getString("description"), rs.getString("email"), rs.getTimestamp("birthday"), 
				rs.getString("avatar"), rs.getString("phone"), rs.getString("password"), rs.getString("isActivated"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return customer;
	}

}
