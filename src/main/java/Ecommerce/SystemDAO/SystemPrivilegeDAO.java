package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.SystemPrivilege;
import Ecommerce.SystemEntity.SystemPrivilegeMapper;

@SuppressWarnings("restriction")
@Repository
public class SystemPrivilegeDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<SystemPrivilege> GetSystemPrivileges_ByGrantee(String grantee){
		String query = "Select * from dba_sys_privs where grantee = upper(?)";
		return jdbcTemplate.query(query, new Object[] { grantee }, new SystemPrivilegeMapper(true));
	}
}
