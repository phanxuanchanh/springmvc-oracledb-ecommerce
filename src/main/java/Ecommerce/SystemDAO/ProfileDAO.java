package Ecommerce.SystemDAO;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemEntity.Profile;
import Ecommerce.SystemEntity.ProfileMapper;

@SuppressWarnings("restriction")
@Repository
public class ProfileDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Profile> GetProfiles(){
		List<Profile> profiles = new ArrayList<Profile>();
		String query = "Select * from dba_profiles";
		profiles = jdbcTemplate.query(query, new ProfileMapper());
		return profiles;
	}
}
