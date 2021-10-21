package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.ProductState;
import Ecommerce.Entity.ProductStateMapper;

@SuppressWarnings("restriction")
@Repository
public class ProductStateDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<ProductState> GetProductStates(){
		List<ProductState> productStates = new ArrayList<ProductState>();
		String query = "Select * from  ThuongMaiDienTu_Web.ProductStates";
		productStates = jdbcTemplate.query(query, new ProductStateMapper());
		return productStates;
	}
	
	public ProductState GetProductState(BigDecimal id) {
		ProductState productState = null;
		String query = "Select * from  ThuongMaiDienTu_Web.ProductStates where ID = ?";
		productState = jdbcTemplate.queryForObject(query, new Object[] { id }, new ProductStateMapper());
		return productState;
	}
	
	public boolean CreateProductState(ProductState productState) {
		String query = "Insert into  ThuongMaiDienTu_Web.ProductStates(\"name\", \"description\", createAt, updateAt) values(?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { productState.getName(), productState.getDescription() });
		return (affected > 0);
	}

	public boolean UpdateProductState(ProductState productState) {
		String query = "Update  ThuongMaiDienTu_Web.ProductStates set \"name\" = ?, \"description\" = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { productState.getName(), productState.getDescription(), productState.getID() });
		return (affected > 0);
	}
	
	public boolean DeleteProductState(BigDecimal id) {
		String query = "Delete from  ThuongMaiDienTu_Web.ProductStates where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public int CountProductState() {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.ProductStates";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
	
	public boolean IsExistProductStateById(BigDecimal id) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.ProductStates where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistProductStateByName(String name) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.ProductStates where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
}
