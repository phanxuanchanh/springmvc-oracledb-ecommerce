package Ecommerce.SystemEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class User {
	private String username;
	private BigDecimal user_id;
	private String password;
	private String account_status;
	private Timestamp lock_date;
	private Timestamp expiry_date;
	private String default_tablespace;
	private String temporary_tablespace;
	private String local_temp_tablespace;
	private Timestamp created;
	private String profile;
	private String initial_rsrc_consumer_group;
	private String external_name;
	private String password_versions;
	private String editions_enabled;
	private String authentication_type;
	private String proxy_only_connect;
	private String common;
	private Timestamp last_login;
	private String oracle_maintained;
	private String inherited;
	private String default_collation;
	private String implicit;
	private String all_shard;
	private Timestamp password_change_date;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public BigDecimal getUser_id() {
		return user_id;
	}

	public void setUser_id(BigDecimal user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}

	public Timestamp getLock_date() {
		return lock_date;
	}

	public void setLock_date(Timestamp lock_date) {
		this.lock_date = lock_date;
	}

	public Timestamp getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(Timestamp expiry_date) {
		this.expiry_date = expiry_date;
	}

	public String getDefault_tablespace() {
		return default_tablespace;
	}

	public void setDefault_tablespace(String default_tablespace) {
		this.default_tablespace = default_tablespace;
	}

	public String getTemporary_tablespace() {
		return temporary_tablespace;
	}

	public void setTemporary_tablespace(String temporary_tablespace) {
		this.temporary_tablespace = temporary_tablespace;
	}

	public String getLocal_temp_tablespace() {
		return local_temp_tablespace;
	}

	public void setLocal_temp_tablespace(String local_temp_tablespace) {
		this.local_temp_tablespace = local_temp_tablespace;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getInitial_rsrc_consumer_group() {
		return initial_rsrc_consumer_group;
	}

	public void setInitial_rsrc_consumer_group(String initial_rsrc_consumer_group) {
		this.initial_rsrc_consumer_group = initial_rsrc_consumer_group;
	}

	public String getExternal_name() {
		return external_name;
	}

	public void setExternal_name(String external_name) {
		this.external_name = external_name;
	}

	public String getPassword_versions() {
		return password_versions;
	}

	public void setPassword_versions(String password_versions) {
		this.password_versions = password_versions;
	}

	public String getEditions_enabled() {
		return editions_enabled;
	}

	public void setEditions_enabled(String editions_enabled) {
		this.editions_enabled = editions_enabled;
	}

	public String getAuthentication_type() {
		return authentication_type;
	}

	public void setAuthentication_type(String authentication_type) {
		this.authentication_type = authentication_type;
	}

	public String getProxy_only_connect() {
		return proxy_only_connect;
	}

	public void setProxy_only_connect(String proxy_only_connect) {
		this.proxy_only_connect = proxy_only_connect;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public Timestamp getLast_login() {
		return last_login;
	}

	public void setLast_login(Timestamp last_login) {
		this.last_login = last_login;
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

	public String getDefault_collation() {
		return default_collation;
	}

	public void setDefault_collation(String default_collation) {
		this.default_collation = default_collation;
	}

	public String getImplicit() {
		return implicit;
	}

	public void setImplicit(String implicit) {
		this.implicit = implicit;
	}

	public String getAll_shard() {
		return all_shard;
	}

	public void setAll_shard(String all_shard) {
		this.all_shard = all_shard;
	}

	public Timestamp getPassword_change_date() {
		return password_change_date;
	}

	public void setPassword_change_date(Timestamp password_change_date) {
		this.password_change_date = password_change_date;
	}

	public User(String username, BigDecimal user_id, String password, String account_status, Timestamp lock_date,
			Timestamp expiry_date, String default_tablespace, String temporary_tablespace, String local_temp_tablespace,
			Timestamp created, String profile, String initial_rsrc_consumer_group, String external_name,
			String password_versions, String editions_enabled, String authentication_type, String proxy_only_connect,
			String common, Timestamp last_login, String oracle_maintained, String inherited, String default_collation,
			String implicit, String all_shard, Timestamp password_change_date) {
		super();
		this.username = username;
		this.user_id = user_id;
		this.password = password;
		this.account_status = account_status;
		this.lock_date = lock_date;
		this.expiry_date = expiry_date;
		this.default_tablespace = default_tablespace;
		this.temporary_tablespace = temporary_tablespace;
		this.local_temp_tablespace = local_temp_tablespace;
		this.created = created;
		this.profile = profile;
		this.initial_rsrc_consumer_group = initial_rsrc_consumer_group;
		this.external_name = external_name;
		this.password_versions = password_versions;
		this.editions_enabled = editions_enabled;
		this.authentication_type = authentication_type;
		this.proxy_only_connect = proxy_only_connect;
		this.common = common;
		this.last_login = last_login;
		this.oracle_maintained = oracle_maintained;
		this.inherited = inherited;
		this.default_collation = default_collation;
		this.implicit = implicit;
		this.all_shard = all_shard;
		this.password_change_date = password_change_date;
	}

	public User() {
		super();
	}
}
