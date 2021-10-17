package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProfileMapper2 implements RowMapper<Profile> {

	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Profile profile = new Profile();
		profile.setProfile(rs.getString("profile"));
		return profile;
	}
}
