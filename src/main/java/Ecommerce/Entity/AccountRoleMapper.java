package Ecommerce.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AccountRoleMapper implements RowMapper<AccountRole> {

	public AccountRole mapRow(ResultSet rs, int rowNum) throws SQLException {
		AccountRole accountRole = new AccountRole(rs.getBigDecimal("ID"), rs.getString("name"), rs.getString("description"), 
				rs.getTimestamp("createAt"), rs.getTimestamp("updateAt"));
		return accountRole;
	}
}
