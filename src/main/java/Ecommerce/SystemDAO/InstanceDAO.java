package Ecommerce.SystemDAO;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.Instance;
import Ecommerce.SystemEntity.InstanceMapper;

@SuppressWarnings("restriction")
@Repository
public class InstanceDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Instance> GetInstances(){
		String query = "Select instance_number, instance_name, host_name, version, startup_time, status from v$instance";
		return jdbcTemplate.query(query, new InstanceMapper(false));
	}
	
	public Instance GetInstance(BigDecimal instanceNumber) {
		String query = "Select * from v$instance where instance_number = ?";
		return jdbcTemplate.queryForObject(query, new Object[] { instanceNumber }, new InstanceMapper(true));
	}
	
	public boolean IsExistInstanceByInstanceNumber(BigDecimal instanceNumber) {
		String query = "Select count(*) from v$instance where instance_number = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { instanceNumber }, Integer.class);
		return (count > 0);
	}
}
