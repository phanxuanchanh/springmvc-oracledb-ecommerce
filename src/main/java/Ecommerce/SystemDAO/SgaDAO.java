package Ecommerce.SystemDAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.Sga;
import Ecommerce.SystemEntity.SgaMapper;

@SuppressWarnings("restriction")
@Repository
public class SgaDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Sga> GetSgas() {
		List<Sga> sgas = new ArrayList<Sga>();
		String query = "Select * from v$sga";
		sgas = jdbcTemplate.query(query, new SgaMapper());
		return sgas;
	}
}
