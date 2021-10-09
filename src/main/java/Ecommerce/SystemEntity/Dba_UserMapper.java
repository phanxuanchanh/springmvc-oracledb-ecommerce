package Ecommerce.SystemEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Dba_UserMapper implements RowMapper<Dba_User> {

	public Dba_User mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dba_User dba_user = new Dba_User(rs.getString("username"), rs.getBigDecimal("user_id"), rs.getString("password"), 
				rs.getString("account_status"), rs.getTimestamp("lock_date"), rs.getTimestamp("expiry_date"), 
				rs.getString("default_tablespace"), rs.getString("temporary_tablespace"), rs.getString("local_temp_tablespace"), 
				rs.getTimestamp("created"), rs.getString("profile"), rs.getString("initial_rsrc_consumer_group"), 
				rs.getString("external_name"), rs.getString("password_versions"), rs.getString("editions_enabled"), 
				rs.getString("authentication_type"), rs.getString("proxy_only_connect"), rs.getString("common"), 
				rs.getTimestamp("last_login"), rs.getString("oracle_maintained"), rs.getString("inherited"), 
				rs.getString("default_collation"), rs.getString("implicit"), rs.getString("all_sharp"), rs.getTimestamp("password_change_date"));
		return dba_user;
	}
}
