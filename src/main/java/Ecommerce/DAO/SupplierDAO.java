package Ecommerce.DAO;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@SuppressWarnings("restriction")
@Repository
public class SupplierDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public int CountSupplier() {
		String query = "Select count(*) from ThuongMaiDienTu.Suppliers";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
}