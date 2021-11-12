package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.Product;
import Ecommerce.Entity.ProductMapper;

@SuppressWarnings("restriction")
@Repository
public class ProductDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<Product> GetProducts(){
		String query = "Select * from ThuongMaiDienTu_Web.Products";
		return jdbcTemplate.query(query, new ProductMapper());
	}
	
	public Product GetProduct(BigDecimal id) {
		String query = "Select * from ThuongMaiDienTu_Web.Products where ID = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { id }, new ProductMapper());
	}
	
	public boolean CreateProduct(Product product) {
		String query = "Insert into ThuongMaiDienTu_Web.Products(\"name\", \"description\", price, discount, quanty, productCategoryId, productStateId, supplierId, createAt, updateAt) "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { product.getName(), product.getDescription(), product.getPrice(), product.getDiscount(), 
				product.getQuanty(), product.getProductCategoryId(), product.getProductStateId(), product.getSupplierId() });
		return (affected > 0);
	}

	public boolean UpdateProduct(Product product) {
		String query = "Update ThuongMaiDienTu_Web.Products set \"name\" = ?, \"description\" = ?, price = ?, discount = ?, quanty = ?, productCategoryId = ?, productStateId = ?, supplierId = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { product.getName(), product.getDescription(), product.getPrice(), product.getDiscount(), 
						product.getQuanty(), product.getProductCategoryId(), product.getProductStateId(), product.getSupplierId(), product.getID() });
		return (affected > 0);
	}
	
	public boolean DeleteProduct(BigDecimal id) {
		String query = "Delete from ThuongMaiDienTu_Web.Products where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public boolean IsExistProductById(BigDecimal id) {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Products where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistProductByName(String name) {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Products where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
	
	public int CountProduct() {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Products";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
}
