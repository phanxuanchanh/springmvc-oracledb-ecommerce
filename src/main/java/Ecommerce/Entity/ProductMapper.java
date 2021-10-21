package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product(rs.getBigDecimal("iD"), rs.getString("name"), rs.getString("description"),
				rs.getBigDecimal("price"), rs.getBigDecimal("discount"), rs.getBigDecimal("quanty"),
				rs.getBigDecimal("productCategoryId"), rs.getBigDecimal("productStateId"),
				rs.getBigDecimal("supplierId"), rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return product;
	}
}
