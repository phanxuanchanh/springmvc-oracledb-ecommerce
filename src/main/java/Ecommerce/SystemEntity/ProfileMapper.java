package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProfileMapper implements RowMapper<Profile> {

	public Profile mapRow(ResultSet rs, int rowNum) throws SQLException {
		Profile profile = new Profile(rs.getString("profile"), rs.getString("resource_name"), rs.getString("resource_type"), 
				rs.getString("limit"), rs.getString("common"), rs.getString("inherited"), rs.getString("implicit"));
		return profile;
	}
}
