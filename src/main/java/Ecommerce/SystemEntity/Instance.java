package Ecommerce.SystemEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Instance {
	private BigDecimal instance_number;
	private String instance_name;
	private String host_name;
	private String version;
	private String version_legacy;
	private String version_full;
	private Timestamp startup_time;
	private String status;
	private String parallel;
	private BigDecimal thread;
	private String archiver;
	private String log_switch_wait;
	private String logins;
	private String shutdown_pending;
	private String database_status;
	private String instance_role;
	private String active_state;
	private String blocked;
	private BigDecimal con_id;
	private String instance_mode;
	private String edition;
	private String family;
	private String database_type;

	public BigDecimal getInstance_number() {
		return instance_number;
	}

	public void setInstance_number(BigDecimal instance_number) {
		this.instance_number = instance_number;
	}

	public String getInstance_name() {
		return instance_name;
	}

	public void setInstance_name(String instance_name) {
		this.instance_name = instance_name;
	}

	public String getHost_name() {
		return host_name;
	}

	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion_legacy() {
		return version_legacy;
	}

	public void setVersion_legacy(String version_legacy) {
		this.version_legacy = version_legacy;
	}

	public String getVersion_full() {
		return version_full;
	}

	public void setVersion_full(String version_full) {
		this.version_full = version_full;
	}

	public Timestamp getStartup_time() {
		return startup_time;
	}

	public void setStartup_time(Timestamp startup_time) {
		this.startup_time = startup_time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getParallel() {
		return parallel;
	}

	public void setParallel(String parallel) {
		this.parallel = parallel;
	}

	public BigDecimal getThread() {
		return thread;
	}

	public void setThread(BigDecimal thread) {
		this.thread = thread;
	}

	public String getArchiver() {
		return archiver;
	}

	public void setArchiver(String archiver) {
		this.archiver = archiver;
	}

	public String getLog_switch_wait() {
		return log_switch_wait;
	}

	public void setLog_switch_wait(String log_switch_wait) {
		this.log_switch_wait = log_switch_wait;
	}

	public String getLogins() {
		return logins;
	}

	public void setLogins(String logins) {
		this.logins = logins;
	}

	public String getShutdown_pending() {
		return shutdown_pending;
	}

	public void setShutdown_pending(String shutdown_pending) {
		this.shutdown_pending = shutdown_pending;
	}

	public String getDatabase_status() {
		return database_status;
	}

	public void setDatabase_status(String database_status) {
		this.database_status = database_status;
	}

	public String getInstance_role() {
		return instance_role;
	}

	public void setInstance_role(String instance_role) {
		this.instance_role = instance_role;
	}

	public String getActive_state() {
		return active_state;
	}

	public void setActive_state(String active_state) {
		this.active_state = active_state;
	}

	public String getBlocked() {
		return blocked;
	}

	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}

	public BigDecimal getCon_id() {
		return con_id;
	}

	public void setCon_id(BigDecimal con_id) {
		this.con_id = con_id;
	}

	public String getInstance_mode() {
		return instance_mode;
	}

	public void setInstance_mode(String instance_mode) {
		this.instance_mode = instance_mode;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getDatabase_type() {
		return database_type;
	}

	public void setDatabase_type(String database_type) {
		this.database_type = database_type;
	}

	public Instance(BigDecimal instance_number, String instance_name, String host_name, String version,
			String version_legacy, String version_full, Timestamp startup_time, String status, String parallel,
			BigDecimal thread, String archiver, String log_switch_wait, String logins, String shutdown_pending,
			String database_status, String instance_role, String active_state, String blocked, BigDecimal con_id,
			String instance_mode, String edition, String family, String database_type) {
		super();
		this.instance_number = instance_number;
		this.instance_name = instance_name;
		this.host_name = host_name;
		this.version = version;
		this.version_legacy = version_legacy;
		this.version_full = version_full;
		this.startup_time = startup_time;
		this.status = status;
		this.parallel = parallel;
		this.thread = thread;
		this.archiver = archiver;
		this.log_switch_wait = log_switch_wait;
		this.logins = logins;
		this.shutdown_pending = shutdown_pending;
		this.database_status = database_status;
		this.instance_role = instance_role;
		this.active_state = active_state;
		this.blocked = blocked;
		this.con_id = con_id;
		this.instance_mode = instance_mode;
		this.edition = edition;
		this.family = family;
		this.database_type = database_type;
	}

	public Instance() {
		super();
	}

	public Instance(BigDecimal instance_number, String instance_name, String host_name, String version,
			Timestamp startup_time, String status) {
		super();
		this.instance_number = instance_number;
		this.instance_name = instance_name;
		this.host_name = host_name;
		this.version = version;
		this.startup_time = startup_time;
		this.status = status;
	}
}
