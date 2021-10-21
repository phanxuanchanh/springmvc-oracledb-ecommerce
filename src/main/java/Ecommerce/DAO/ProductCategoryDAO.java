package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.ProductCategory;
import Ecommerce.Entity.ProductCategoryMapper;

@SuppressWarnings("restriction")
@Repository
public class ProductCategoryDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<ProductCategory> GetProductCategories(){
		List<ProductCategory> productCategories = new ArrayList<ProductCategory>();
		String query = "Select * from  ThuongMaiDienTu_Web.ProductCategories";
		productCategories = jdbcTemplate.query(query, new ProductCategoryMapper());
		return productCategories;
	}
	
	public ProductCategory GetProductCategory(BigDecimal id) {
		ProductCategory productCategory = null;
		String query = "Select * from  ThuongMaiDienTu_Web.ProductCategories where ID = ?";
		productCategory = jdbcTemplate.queryForObject(query, new Object[] { id }, new ProductCategoryMapper());
		return productCategory;
	}
	
	public boolean CreateProductCategory(ProductCategory productCategory) {
		String query = "Insert into  ThuongMaiDienTu_Web.ProductCategories(\"name\", \"description\", createAt, updateAt) values(?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { productCategory.getName(), productCategory.getDescription() });
		return (affected > 0);
	}

	public boolean UpdateProductCategory(ProductCategory productCategory) {
		String query = "Update  ThuongMaiDienTu_Web.ProductCategories set \"name\" = ?, \"description\" = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { productCategory.getName(), productCategory.getDescription(), productCategory.getID() });
		return (affected > 0);
	}
	
	public boolean DeleteProductCategory(BigDecimal id) {
		String query = "Delete from  ThuongMaiDienTu_Web.ProductCategories where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public int CountProductCategory() {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.ProductCategories";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
	
	public boolean IsExistProductCategoryById(BigDecimal id) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.ProductCategories where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistProductCategoryByName(String name) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.ProductCategories where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
}
