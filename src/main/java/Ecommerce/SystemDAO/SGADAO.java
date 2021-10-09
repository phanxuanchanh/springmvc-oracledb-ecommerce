package Ecommerce.SystemDAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.SGA;
import Ecommerce.SystemEntity.SGAMapper;

@SuppressWarnings("restriction")
@Repository
public class SGADAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<SGA> GetSGAs() {
		List<SGA> sgas = new ArrayList<SGA>();
		String query = "Select * from v$sga";
		sgas = jdbcTemplate.query(query, new SGAMapper());
		return sgas;
	}
}
