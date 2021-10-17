package Ecommerce.SystemDAO;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.SystemDTO.ProfileInput;
import Ecommerce.SystemEntity.Profile;
import Ecommerce.SystemEntity.ProfileMapper;
import Ecommerce.SystemEntity.ProfileMapper2;

@SuppressWarnings("restriction")
@Repository
public class ProfileDAO {
	@Autowired
	@Resource(name = "jdbcTemplate2")
	private JdbcTemplate jdbcTemplate;
	
	public List<Profile> GetProfiles(){
		String query = "Select * from dba_profiles";
		return jdbcTemplate.query(query, new ProfileMapper());
	}
	
	public List<Profile> GetProfiles_Distinct(){
		String query = "Select distinct profile from dba_profiles";
		return jdbcTemplate.query(query, new ProfileMapper2());
	}
	
	public void CreateProfile(ProfileInput profileInput) {
		String query = String.format(
				"Create profile %s limit connect_time %s sessions_per_user %s failed_login_attempts %s password_lock_time %s",
				profileInput.getProfile_name(), profileInput.getConnect_time(), profileInput.getSessions_per_user(), 
				profileInput.getFailed_login_attempts(), profileInput.getPassword_lock_time());
		jdbcTemplate.execute(query);
	}
	
	public void UpdateProfile(ProfileInput profileInput) {
		String query = String.format(
				"Alter profile %s limit connect_time %s sessions_per_user %s failed_login_attempts %s password_lock_time %s",
				profileInput.getProfile_name(), profileInput.getConnect_time(), profileInput.getSessions_per_user(), 
				profileInput.getFailed_login_attempts(), profileInput.getPassword_lock_time());
		jdbcTemplate.execute(query);
	}
	
	public void DeleteProfile(String profileName) {
		String query = String.format("Drop profile %s cascade", profileName);
		jdbcTemplate.execute(query);		
	}
	
	public boolean IsExistProfileByName(String profileName) {
		String query = "Select count(*) from dba_profiles where profile = upper(?)";
		int count = jdbcTemplate.queryForObject(query, new Object[] { profileName }, Integer.class);
		return (count > 0);
	}
}
