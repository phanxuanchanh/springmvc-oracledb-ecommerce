package Ecommerce.DAO;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@SuppressWarnings("restriction")
@Repository
public class ProductDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public int CountProduct() {
		String query = "Select count(*) from ThuongMaiDienTu.Products";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
}
