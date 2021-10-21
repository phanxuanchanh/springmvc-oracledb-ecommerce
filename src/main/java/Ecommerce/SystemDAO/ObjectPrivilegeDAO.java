package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.ObjectPrivilege;
import Ecommerce.SystemEntity.ObjectPrivilegeMapper;

@SuppressWarnings("restriction")
@Repository
public class ObjectPrivilegeDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<ObjectPrivilege> GetObjectPrivileges_ByGrantee(String grantee){
		String query = "Select * from dba_tab_privs where grantee = upper(?)";
		return jdbcTemplate.query(query, new Object[] { grantee }, new ObjectPrivilegeMapper(true));
	}
}
