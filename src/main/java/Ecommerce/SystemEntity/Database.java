package Ecommerce.SystemEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Database {
	private BigDecimal dbid;
	private String name;
	private Timestamp created;
	private BigDecimal resetlogs_change;
	private Timestamp resetlogs_time;
	private BigDecimal prior_resetlogs_change;
	private Timestamp prior_resetlogs_time;
	private String log_mode;
	private BigDecimal checkpoint_change;
	private BigDecimal archive_change;
	private String controlfile_type;
	private Timestamp controlfile_created;
	private BigDecimal controlfile_sequence;
	private BigDecimal controlfile_change;
	private Timestamp controlfile_time;
	private String open_resetlogs;
	private Timestamp version_time;
	private String open_mode;
	private String protection_mode;
	private String protection_level;
	private String remote_archive;
	private BigDecimal activation;
	private BigDecimal switchover;
	private String database_role;
	private BigDecimal archivelog_change;
	private String archivelog_compression;
	private String switchover_status;
	private String dataguard_broker;
	private String guard_status;
	private String supplemental_log_data_min;
	private String supplemental_log_data_pk;
	private String supplemental_log_data_ui;
	private String force_logging;
	private BigDecimal platform_id;
	private String platform_name;
	private BigDecimal recovery_target_incarnation;
	private BigDecimal last_open_incarnation;
	private BigDecimal current_scn;
	private String flashback_on;
	private String supplemental_log_data_fk;
	private String supplemental_log_data_all;
	private String db_unique_name;
	private BigDecimal standby_became_primary_scn;
	private String fs_failover_mode;
	private String fs_failover_status;
	private String fs_failover_current_target;
	private BigDecimal fs_failover_observer_present;
	private String fs_failover_observer_host;
	private String controlfile_converted;
	private String primary_db_unique_name;
	private String supplemental_log_data_pl;
	private BigDecimal min_required_capture_change;
	private String cdb;
	private BigDecimal con_id;
	private String pending_role_change_tasks;
	private BigDecimal con_dbid;
	private String force_full_db_caching;
	private String supplemental_log_data_sr;

	public BigDecimal getDbid() {
		return dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public BigDecimal getResetlogs_change() {
		return resetlogs_change;
	}

	public void setResetlogs_change(BigDecimal resetlogs_change) {
		this.resetlogs_change = resetlogs_change;
	}

	public Timestamp getResetlogs_time() {
		return resetlogs_time;
	}

	public void setResetlogs_time(Timestamp resetlogs_time) {
		this.resetlogs_time = resetlogs_time;
	}

	public BigDecimal getPrior_resetlogs_change() {
		return prior_resetlogs_change;
	}

	public void setPrior_resetlogs_change(BigDecimal prior_resetlogs_change) {
		this.prior_resetlogs_change = prior_resetlogs_change;
	}

	public Timestamp getPrior_resetlogs_time() {
		return prior_resetlogs_time;
	}

	public void setPrior_resetlogs_time(Timestamp prior_resetlogs_time) {
		this.prior_resetlogs_time = prior_resetlogs_time;
	}

	public String getLog_mode() {
		return log_mode;
	}

	public void setLog_mode(String log_mode) {
		this.log_mode = log_mode;
	}

	public BigDecimal getCheckpoint_change() {
		return checkpoint_change;
	}

	public void setCheckpoint_change(BigDecimal checkpoint_change) {
		this.checkpoint_change = checkpoint_change;
	}

	public BigDecimal getArchive_change() {
		return archive_change;
	}

	public void setArchive_change(BigDecimal archive_change) {
		this.archive_change = archive_change;
	}

	public String getControlfile_type() {
		return controlfile_type;
	}

	public void setControlfile_type(String controlfile_type) {
		this.controlfile_type = controlfile_type;
	}

	public Timestamp getControlfile_created() {
		return controlfile_created;
	}

	public void setControlfile_created(Timestamp controlfile_created) {
		this.controlfile_created = controlfile_created;
	}

	public BigDecimal getControlfile_sequence() {
		return controlfile_sequence;
	}

	public void setControlfile_sequence(BigDecimal controlfile_sequence) {
		this.controlfile_sequence = controlfile_sequence;
	}

	public BigDecimal getControlfile_change() {
		return controlfile_change;
	}

	public void setControlfile_change(BigDecimal controlfile_change) {
		this.controlfile_change = controlfile_change;
	}

	public Timestamp getControlfile_time() {
		return controlfile_time;
	}

	public void setControlfile_time(Timestamp controlfile_time) {
		this.controlfile_time = controlfile_time;
	}

	public String getOpen_resetlogs() {
		return open_resetlogs;
	}

	public void setOpen_resetlogs(String open_resetlogs) {
		this.open_resetlogs = open_resetlogs;
	}

	public Timestamp getVersion_time() {
		return version_time;
	}

	public void setVersion_time(Timestamp version_time) {
		this.version_time = version_time;
	}

	public String getOpen_mode() {
		return open_mode;
	}

	public void setOpen_mode(String open_mode) {
		this.open_mode = open_mode;
	}

	public String getProtection_mode() {
		return protection_mode;
	}

	public void setProtection_mode(String protection_mode) {
		this.protection_mode = protection_mode;
	}

	public String getProtection_level() {
		return protection_level;
	}

	public void setProtection_level(String protection_level) {
		this.protection_level = protection_level;
	}

	public String getRemote_archive() {
		return remote_archive;
	}

	public void setRemote_archive(String remote_archive) {
		this.remote_archive = remote_archive;
	}

	public BigDecimal getActivation() {
		return activation;
	}

	public void setActivation(BigDecimal activation) {
		this.activation = activation;
	}

	public BigDecimal getSwitchover() {
		return switchover;
	}

	public void setSwitchover(BigDecimal switchover) {
		this.switchover = switchover;
	}

	public String getDatabase_role() {
		return database_role;
	}

	public void setDatabase_role(String database_role) {
		this.database_role = database_role;
	}

	public BigDecimal getArchivelog_change() {
		return archivelog_change;
	}

	public void setArchivelog_change(BigDecimal archivelog_change) {
		this.archivelog_change = archivelog_change;
	}

	public String getArchivelog_compression() {
		return archivelog_compression;
	}

	public void setArchivelog_compression(String archivelog_compression) {
		this.archivelog_compression = archivelog_compression;
	}

	public String getSwitchover_status() {
		return switchover_status;
	}

	public void setSwitchover_status(String switchover_status) {
		this.switchover_status = switchover_status;
	}

	public String getDataguard_broker() {
		return dataguard_broker;
	}

	public void setDataguard_broker(String dataguard_broker) {
		this.dataguard_broker = dataguard_broker;
	}

	public String getGuard_status() {
		return guard_status;
	}

	public void setGuard_status(String guard_status) {
		this.guard_status = guard_status;
	}

	public String getSupplemental_log_data_min() {
		return supplemental_log_data_min;
	}

	public void setSupplemental_log_data_min(String supplemental_log_data_min) {
		this.supplemental_log_data_min = supplemental_log_data_min;
	}

	public String getSupplemental_log_data_pk() {
		return supplemental_log_data_pk;
	}

	public void setSupplemental_log_data_pk(String supplemental_log_data_pk) {
		this.supplemental_log_data_pk = supplemental_log_data_pk;
	}

	public String getSupplemental_log_data_ui() {
		return supplemental_log_data_ui;
	}

	public void setSupplemental_log_data_ui(String supplemental_log_data_ui) {
		this.supplemental_log_data_ui = supplemental_log_data_ui;
	}

	public String getForce_logging() {
		return force_logging;
	}

	public void setForce_logging(String force_logging) {
		this.force_logging = force_logging;
	}

	public BigDecimal getPlatform_id() {
		return platform_id;
	}

	public void setPlatform_id(BigDecimal platform_id) {
		this.platform_id = platform_id;
	}

	public String getPlatform_name() {
		return platform_name;
	}

	public void setPlatform_name(String platform_name) {
		this.platform_name = platform_name;
	}

	public BigDecimal getRecovery_target_incarnation() {
		return recovery_target_incarnation;
	}

	public void setRecovery_target_incarnation(BigDecimal recovery_target_incarnation) {
		this.recovery_target_incarnation = recovery_target_incarnation;
	}

	public BigDecimal getLast_open_incarnation() {
		return last_open_incarnation;
	}

	public void setLast_open_incarnation(BigDecimal last_open_incarnation) {
		this.last_open_incarnation = last_open_incarnation;
	}

	public BigDecimal getCurrent_scn() {
		return current_scn;
	}

	public void setCurrent_scn(BigDecimal current_scn) {
		this.current_scn = current_scn;
	}

	public String getFlashback_on() {
		return flashback_on;
	}

	public void setFlashback_on(String flashback_on) {
		this.flashback_on = flashback_on;
	}

	public String getSupplemental_log_data_fk() {
		return supplemental_log_data_fk;
	}

	public void setSupplemental_log_data_fk(String supplemental_log_data_fk) {
		this.supplemental_log_data_fk = supplemental_log_data_fk;
	}

	public String getSupplemental_log_data_all() {
		return supplemental_log_data_all;
	}

	public void setSupplemental_log_data_all(String supplemental_log_data_all) {
		this.supplemental_log_data_all = supplemental_log_data_all;
	}

	public String getDb_unique_name() {
		return db_unique_name;
	}

	public void setDb_unique_name(String db_unique_name) {
		this.db_unique_name = db_unique_name;
	}

	public BigDecimal getStandby_became_primary_scn() {
		return standby_became_primary_scn;
	}

	public void setStandby_became_primary_scn(BigDecimal standby_became_primary_scn) {
		this.standby_became_primary_scn = standby_became_primary_scn;
	}

	public String getFs_failover_mode() {
		return fs_failover_mode;
	}

	public void setFs_failover_mode(String fs_failover_mode) {
		this.fs_failover_mode = fs_failover_mode;
	}

	public String getFs_failover_status() {
		return fs_failover_status;
	}

	public void setFs_failover_status(String fs_failover_status) {
		this.fs_failover_status = fs_failover_status;
	}

	public String getFs_failover_current_target() {
		return fs_failover_current_target;
	}

	public void setFs_failover_current_target(String fs_failover_current_target) {
		this.fs_failover_current_target = fs_failover_current_target;
	}

	public BigDecimal getFs_failover_observer_present() {
		return fs_failover_observer_present;
	}

	public void setFs_failover_observer_present(BigDecimal fs_failover_observer_present) {
		this.fs_failover_observer_present = fs_failover_observer_present;
	}

	public String getFs_failover_observer_host() {
		return fs_failover_observer_host;
	}

	public void setFs_failover_observer_host(String fs_failover_observer_host) {
		this.fs_failover_observer_host = fs_failover_observer_host;
	}

	public String getControlfile_converted() {
		return controlfile_converted;
	}

	public void setControlfile_converted(String controlfile_converted) {
		this.controlfile_converted = controlfile_converted;
	}

	public String getPrimary_db_unique_name() {
		return primary_db_unique_name;
	}

	public void setPrimary_db_unique_name(String primary_db_unique_name) {
		this.primary_db_unique_name = primary_db_unique_name;
	}

	public String getSupplemental_log_data_pl() {
		return supplemental_log_data_pl;
	}

	public void setSupplemental_log_data_pl(String supplemental_log_data_pl) {
		this.supplemental_log_data_pl = supplemental_log_data_pl;
	}

	public BigDecimal getMin_required_capture_change() {
		return min_required_capture_change;
	}

	public void setMin_required_capture_change(BigDecimal min_required_capture_change) {
		this.min_required_capture_change = min_required_capture_change;
	}

	public String getCdb() {
		return cdb;
	}

	public void setCdb(String cdb) {
		this.cdb = cdb;
	}

	public BigDecimal getCon_id() {
		return con_id;
	}

	public void setCon_id(BigDecimal con_id) {
		this.con_id = con_id;
	}

	public String getPending_role_change_tasks() {
		return pending_role_change_tasks;
	}

	public void setPending_role_change_tasks(String pending_role_change_tasks) {
		this.pending_role_change_tasks = pending_role_change_tasks;
	}

	public BigDecimal getCon_dbid() {
		return con_dbid;
	}

	public void setCon_dbid(BigDecimal con_dbid) {
		this.con_dbid = con_dbid;
	}

	public String getForce_full_db_caching() {
		return force_full_db_caching;
	}

	public void setForce_full_db_caching(String force_full_db_caching) {
		this.force_full_db_caching = force_full_db_caching;
	}

	public String getSupplemental_log_data_sr() {
		return supplemental_log_data_sr;
	}

	public void setSupplemental_log_data_sr(String supplemental_log_data_sr) {
		this.supplemental_log_data_sr = supplemental_log_data_sr;
	}

	public Database(BigDecimal dbid, String name, Timestamp created, BigDecimal resetlogs_change,
			Timestamp resetlogs_time, BigDecimal prior_resetlogs_change, Timestamp prior_resetlogs_time,
			String log_mode, BigDecimal checkpoint_change, BigDecimal archive_change, String controlfile_type,
			Timestamp controlfile_created, BigDecimal controlfile_sequence, BigDecimal controlfile_change,
			Timestamp controlfile_time, String open_resetlogs, Timestamp version_time, String open_mode,
			String protection_mode, String protection_level, String remote_archive, BigDecimal activation,
			BigDecimal switchover, String database_role, BigDecimal archivelog_change, String archivelog_compression,
			String switchover_status, String dataguard_broker, String guard_status, String supplemental_log_data_min,
			String supplemental_log_data_pk, String supplemental_log_data_ui, String force_logging,
			BigDecimal platform_id, String platform_name, BigDecimal recovery_target_incarnation,
			BigDecimal last_open_incarnation, BigDecimal current_scn, String flashback_on,
			String supplemental_log_data_fk, String supplemental_log_data_all, String db_unique_name,
			BigDecimal standby_became_primary_scn, String fs_failover_mode, String fs_failover_status,
			String fs_failover_current_target, BigDecimal fs_failover_observer_present,
			String fs_failover_observer_host, String controlfile_converted, String primary_db_unique_name,
			String supplemental_log_data_pl, BigDecimal min_required_capture_change, String cdb, BigDecimal con_id,
			String pending_role_change_tasks, BigDecimal con_dbid, String force_full_db_caching,
			String supplemental_log_data_sr) {
		super();
		this.dbid = dbid;
		this.name = name;
		this.created = created;
		this.resetlogs_change = resetlogs_change;
		this.resetlogs_time = resetlogs_time;
		this.prior_resetlogs_change = prior_resetlogs_change;
		this.prior_resetlogs_time = prior_resetlogs_time;
		this.log_mode = log_mode;
		this.checkpoint_change = checkpoint_change;
		this.archive_change = archive_change;
		this.controlfile_type = controlfile_type;
		this.controlfile_created = controlfile_created;
		this.controlfile_sequence = controlfile_sequence;
		this.controlfile_change = controlfile_change;
		this.controlfile_time = controlfile_time;
		this.open_resetlogs = open_resetlogs;
		this.version_time = version_time;
		this.open_mode = open_mode;
		this.protection_mode = protection_mode;
		this.protection_level = protection_level;
		this.remote_archive = remote_archive;
		this.activation = activation;
		this.switchover = switchover;
		this.database_role = database_role;
		this.archivelog_change = archivelog_change;
		this.archivelog_compression = archivelog_compression;
		this.switchover_status = switchover_status;
		this.dataguard_broker = dataguard_broker;
		this.guard_status = guard_status;
		this.supplemental_log_data_min = supplemental_log_data_min;
		this.supplemental_log_data_pk = supplemental_log_data_pk;
		this.supplemental_log_data_ui = supplemental_log_data_ui;
		this.force_logging = force_logging;
		this.platform_id = platform_id;
		this.platform_name = platform_name;
		this.recovery_target_incarnation = recovery_target_incarnation;
		this.last_open_incarnation = last_open_incarnation;
		this.current_scn = current_scn;
		this.flashback_on = flashback_on;
		this.supplemental_log_data_fk = supplemental_log_data_fk;
		this.supplemental_log_data_all = supplemental_log_data_all;
		this.db_unique_name = db_unique_name;
		this.standby_became_primary_scn = standby_became_primary_scn;
		this.fs_failover_mode = fs_failover_mode;
		this.fs_failover_status = fs_failover_status;
		this.fs_failover_current_target = fs_failover_current_target;
		this.fs_failover_observer_present = fs_failover_observer_present;
		this.fs_failover_observer_host = fs_failover_observer_host;
		this.controlfile_converted = controlfile_converted;
		this.primary_db_unique_name = primary_db_unique_name;
		this.supplemental_log_data_pl = supplemental_log_data_pl;
		this.min_required_capture_change = min_required_capture_change;
		this.cdb = cdb;
		this.con_id = con_id;
		this.pending_role_change_tasks = pending_role_change_tasks;
		this.con_dbid = con_dbid;
		this.force_full_db_caching = force_full_db_caching;
		this.supplemental_log_data_sr = supplemental_log_data_sr;
	}

	public Database() {
		super();
	}

	public Database(BigDecimal dbid, String name, Timestamp created, String open_mode) {
		super();
		this.dbid = dbid;
		this.name = name;
		this.created = created;
		this.open_mode = open_mode;
	}
}
