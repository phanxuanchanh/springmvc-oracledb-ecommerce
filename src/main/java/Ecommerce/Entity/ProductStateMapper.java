package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductStateMapper implements RowMapper<ProductState> {

	public ProductState mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductState productState = new ProductState(rs.getBigDecimal("ID"), rs.getString("name"), rs.getString("description"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return productState;
	}
}
