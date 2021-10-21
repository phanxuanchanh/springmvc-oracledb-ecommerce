package Ecommerce.SystemEntity;

import java.math.BigDecimal;

public class Role {
	private String role;
	private BigDecimal role_id;
	private String password_required;
	private String authentication_type;
	private String common;
	private String oracle_maintained;
	private String inherited;
	private String implicit;
	private String external_name;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public BigDecimal getRole_id() {
		return role_id;
	}

	public void setRole_id(BigDecimal role_id) {
		this.role_id = role_id;
	}

	public String getPassword_required() {
		return password_required;
	}

	public void setPassword_required(String password_required) {
		this.password_required = password_required;
	}

	public String getAuthentication_type() {
		return authentication_type;
	}

	public void setAuthentication_type(String authentication_type) {
		this.authentication_type = authentication_type;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getOracle_maintained() {
		return oracle_maintained;
	}

	public void setOracle_maintained(String oracle_maintained) {
		this.oracle_maintained = oracle_maintained;
	}

	public String getInherited() {
		return inherited;
	}

	public void setInherited(String inherited) {
		this.inherited = inherited;
	}

	public String getImplicit() {
		return implicit;
	}

	public void setImplicit(String implicit) {
		this.implicit = implicit;
	}

	public String getExternal_name() {
		return external_name;
	}

	public void setExternal_name(String external_name) {
		this.external_name = external_name;
	}

	public Role(String role, BigDecimal role_id, String password_required, String authentication_type, String common,
			String oracle_maintained, String inherited, String implicit, String external_name) {
		super();
		this.role = role;
		this.role_id = role_id;
		this.password_required = password_required;
		this.authentication_type = authentication_type;
		this.common = common;
		this.oracle_maintained = oracle_maintained;
		this.inherited = inherited;
		this.implicit = implicit;
		this.external_name = external_name;
	}

	public Role() {
		super();
	}

	public Role(String role, BigDecimal role_id, String password_required, String authentication_type) {
		super();
		this.role = role;
		this.role_id = role_id;
		this.password_required = password_required;
		this.authentication_type = authentication_type;
	}
}
