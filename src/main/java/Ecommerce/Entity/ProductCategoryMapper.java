package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductCategoryMapper implements RowMapper<ProductCategory> {

	public ProductCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductCategory productCategory = new ProductCategory(rs.getBigDecimal("ID"), rs.getString("name"), rs.getString("description"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return productCategory;
	}
}
