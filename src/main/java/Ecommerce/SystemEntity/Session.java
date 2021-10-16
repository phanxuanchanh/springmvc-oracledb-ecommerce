package Ecommerce.SystemEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Session {
	private String action;
	private BigDecimal action_hash;
	private BigDecimal audsid;
	private BigDecimal blocking_instance;
	private BigDecimal blocking_session;
	private String blocking_session_status;;
	private String client_identifier;
	private String client_info;
	private BigDecimal command;
	private BigDecimal con_id;
	private String creator_addr;
	private BigDecimal creator_serial;
	private BigDecimal current_queue_duration;
	private String ecid;
	private String event;
	private BigDecimal event2; // event#
	private String external_name;
	private String failed_over;
	private String failover_method;
	private String failover_type;
	private BigDecimal final_blocking_instance;
	private BigDecimal final_blocking_session;
	private String final_blocking_session_status;
	private BigDecimal fixed_table_sequence;
	private BigDecimal last_call_et;
	private String lockwait;
	private Timestamp logon_time;
	private String machine;
	private String module;
	private BigDecimal module_hash;
	private String osuser;
	private BigDecimal ownerid;
	private String paddr;
	private String pddl_status;
	private String pdml_enabled;
	private String pdml_status;
	private BigDecimal pga_tunable_mem;
	private String plsql_debugger_connected;
	private BigDecimal plsql_entry_object_id;
	private BigDecimal plsql_entry_subprogram_id;
	private BigDecimal plsql_object_id;
	private BigDecimal plsql_subprogram_id;
	private BigDecimal port;
	private String pq_status;
	private BigDecimal prev_child_number;
	private BigDecimal prev_exec_id;
	private Timestamp prev_exec_start;
	private BigDecimal prev_hash_value;
	private String prev_sql_addr;
	private String prev_sql_id;
	private String process;
	private String program;
	private BigDecimal p1;
	private String p1raw;
	private String p1text;
	private BigDecimal p2;
	private String p2raw;
	private String p2text;
	private BigDecimal p3;
	private String p3raw;
	private String p3text;
	private String resource_consumer_group;
	private BigDecimal row_wait_block;
	private BigDecimal row_wait_file;
	private BigDecimal row_wait_obj;
	private BigDecimal row_wait_row;
	private String saddr;
	private BigDecimal schema;
	private String schemaname;
	private BigDecimal seconds_in_wait;
	private BigDecimal seq;
	private BigDecimal serial;
	private String server;
	private String service_name;
	private BigDecimal session_edition_id;
	private String shard_ddl_status;
	private BigDecimal sid;
	private String sql_address;
	private BigDecimal sql_child_number;
	private BigDecimal sql_exec_id;
	private Timestamp sql_exec_start;
	private BigDecimal sql_hash_value;
	private String sql_id;
	private String sql_trace;
	private String sql_trace_binds;
	private String sql_trace_plan_stats;
	private String sql_trace_waits;
	private BigDecimal sql_translation_profile_id;
	private String state;
	private String status;
	private String taddr;
	private String terminal;
	private BigDecimal time_remaining_micro;
	private BigDecimal time_since_last_wait_micro;
	private BigDecimal top_level_call;
	private String type;
	private BigDecimal user;
	private String username;
	private String wait_class;
	private BigDecimal wait_class2; // wait_class#
	private BigDecimal wait_class_id;
	private BigDecimal wait_time;
	private BigDecimal wait_time_micro;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public BigDecimal getAction_hash() {
		return action_hash;
	}

	public void setAction_hash(BigDecimal action_hash) {
		this.action_hash = action_hash;
	}

	public BigDecimal getAudsid() {
		return audsid;
	}

	public void setAudsid(BigDecimal audsid) {
		this.audsid = audsid;
	}

	public BigDecimal getBlocking_instance() {
		return blocking_instance;
	}

	public void setBlocking_instance(BigDecimal blocking_instance) {
		this.blocking_instance = blocking_instance;
	}

	public BigDecimal getBlocking_session() {
		return blocking_session;
	}

	public void setBlocking_session(BigDecimal blocking_session) {
		this.blocking_session = blocking_session;
	}

	public String getBlocking_session_status() {
		return blocking_session_status;
	}

	public void setBlocking_session_status(String blocking_session_status) {
		this.blocking_session_status = blocking_session_status;
	}

	public String getClient_identifier() {
		return client_identifier;
	}

	public void setClient_identifier(String client_identifier) {
		this.client_identifier = client_identifier;
	}

	public String getClient_info() {
		return client_info;
	}

	public void setClient_info(String client_info) {
		this.client_info = client_info;
	}

	public BigDecimal getCommand() {
		return command;
	}

	public void setCommand(BigDecimal command) {
		this.command = command;
	}

	public BigDecimal getCon_id() {
		return con_id;
	}

	public void setCon_id(BigDecimal con_id) {
		this.con_id = con_id;
	}

	public String getCreator_addr() {
		return creator_addr;
	}

	public void setCreator_addr(String creator_addr) {
		this.creator_addr = creator_addr;
	}

	public BigDecimal getCreator_serial() {
		return creator_serial;
	}

	public void setCreator_serial(BigDecimal creator_serial) {
		this.creator_serial = creator_serial;
	}

	public BigDecimal getCurrent_queue_duration() {
		return current_queue_duration;
	}

	public void setCurrent_queue_duration(BigDecimal current_queue_duration) {
		this.current_queue_duration = current_queue_duration;
	}

	public String getEcid() {
		return ecid;
	}

	public void setEcid(String ecid) {
		this.ecid = ecid;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public BigDecimal getEvent2() {
		return event2;
	}

	public void setEvent2(BigDecimal event2) {
		this.event2 = event2;
	}

	public String getExternal_name() {
		return external_name;
	}

	public void setExternal_name(String external_name) {
		this.external_name = external_name;
	}

	public String getFailed_over() {
		return failed_over;
	}

	public void setFailed_over(String failed_over) {
		this.failed_over = failed_over;
	}

	public String getFailover_method() {
		return failover_method;
	}

	public void setFailover_method(String failover_method) {
		this.failover_method = failover_method;
	}

	public String getFailover_type() {
		return failover_type;
	}

	public void setFailover_type(String failover_type) {
		this.failover_type = failover_type;
	}

	public BigDecimal getFinal_blocking_instance() {
		return final_blocking_instance;
	}

	public void setFinal_blocking_instance(BigDecimal final_blocking_instance) {
		this.final_blocking_instance = final_blocking_instance;
	}

	public BigDecimal getFinal_blocking_session() {
		return final_blocking_session;
	}

	public void setFinal_blocking_session(BigDecimal final_blocking_session) {
		this.final_blocking_session = final_blocking_session;
	}

	public String getFinal_blocking_session_status() {
		return final_blocking_session_status;
	}

	public void setFinal_blocking_session_status(String final_blocking_session_status) {
		this.final_blocking_session_status = final_blocking_session_status;
	}

	public BigDecimal getFixed_table_sequence() {
		return fixed_table_sequence;
	}

	public void setFixed_table_sequence(BigDecimal fixed_table_sequence) {
		this.fixed_table_sequence = fixed_table_sequence;
	}

	public BigDecimal getLast_call_et() {
		return last_call_et;
	}

	public void setLast_call_et(BigDecimal last_call_et) {
		this.last_call_et = last_call_et;
	}

	public String getLockwait() {
		return lockwait;
	}

	public void setLockwait(String lockwait) {
		this.lockwait = lockwait;
	}

	public Timestamp getLogon_time() {
		return logon_time;
	}

	public void setLogon_time(Timestamp logon_time) {
		this.logon_time = logon_time;
	}

	public String getMachine() {
		return machine;
	}

	public void setMachine(String machine) {
		this.machine = machine;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public BigDecimal getModule_hash() {
		return module_hash;
	}

	public void setModule_hash(BigDecimal module_hash) {
		this.module_hash = module_hash;
	}

	public String getOsuser() {
		return osuser;
	}

	public void setOsuser(String osuser) {
		this.osuser = osuser;
	}

	public BigDecimal getOwnerid() {
		return ownerid;
	}

	public void setOwnerid(BigDecimal ownerid) {
		this.ownerid = ownerid;
	}

	public String getPaddr() {
		return paddr;
	}

	public void setPaddr(String paddr) {
		this.paddr = paddr;
	}

	public String getPddl_status() {
		return pddl_status;
	}

	public void setPddl_status(String pddl_status) {
		this.pddl_status = pddl_status;
	}

	public String getPdml_enabled() {
		return pdml_enabled;
	}

	public void setPdml_enabled(String pdml_enabled) {
		this.pdml_enabled = pdml_enabled;
	}

	public String getPdml_status() {
		return pdml_status;
	}

	public void setPdml_status(String pdml_status) {
		this.pdml_status = pdml_status;
	}

	public BigDecimal getPga_tunable_mem() {
		return pga_tunable_mem;
	}

	public void setPga_tunable_mem(BigDecimal pga_tunable_mem) {
		this.pga_tunable_mem = pga_tunable_mem;
	}

	public String getPlsql_debugger_connected() {
		return plsql_debugger_connected;
	}

	public void setPlsql_debugger_connected(String plsql_debugger_connected) {
		this.plsql_debugger_connected = plsql_debugger_connected;
	}

	public BigDecimal getPlsql_entry_object_id() {
		return plsql_entry_object_id;
	}

	public void setPlsql_entry_object_id(BigDecimal plsql_entry_object_id) {
		this.plsql_entry_object_id = plsql_entry_object_id;
	}

	public BigDecimal getPlsql_entry_subprogram_id() {
		return plsql_entry_subprogram_id;
	}

	public void setPlsql_entry_subprogram_id(BigDecimal plsql_entry_subprogram_id) {
		this.plsql_entry_subprogram_id = plsql_entry_subprogram_id;
	}

	public BigDecimal getPlsql_object_id() {
		return plsql_object_id;
	}

	public void setPlsql_object_id(BigDecimal plsql_object_id) {
		this.plsql_object_id = plsql_object_id;
	}

	public BigDecimal getPlsql_subprogram_id() {
		return plsql_subprogram_id;
	}

	public void setPlsql_subprogram_id(BigDecimal plsql_subprogram_id) {
		this.plsql_subprogram_id = plsql_subprogram_id;
	}

	public BigDecimal getPort() {
		return port;
	}

	public void setPort(BigDecimal port) {
		this.port = port;
	}

	public String getPq_status() {
		return pq_status;
	}

	public void setPq_status(String pq_status) {
		this.pq_status = pq_status;
	}

	public BigDecimal getPrev_child_number() {
		return prev_child_number;
	}

	public void setPrev_child_number(BigDecimal prev_child_number) {
		this.prev_child_number = prev_child_number;
	}

	public BigDecimal getPrev_exec_id() {
		return prev_exec_id;
	}

	public void setPrev_exec_id(BigDecimal prev_exec_id) {
		this.prev_exec_id = prev_exec_id;
	}

	public Timestamp getPrev_exec_start() {
		return prev_exec_start;
	}

	public void setPrev_exec_start(Timestamp prev_exec_start) {
		this.prev_exec_start = prev_exec_start;
	}

	public BigDecimal getPrev_hash_value() {
		return prev_hash_value;
	}

	public void setPrev_hash_value(BigDecimal prev_hash_value) {
		this.prev_hash_value = prev_hash_value;
	}

	public String getPrev_sql_addr() {
		return prev_sql_addr;
	}

	public void setPrev_sql_addr(String prev_sql_addr) {
		this.prev_sql_addr = prev_sql_addr;
	}

	public String getPrev_sql_id() {
		return prev_sql_id;
	}

	public void setPrev_sql_id(String prev_sql_id) {
		this.prev_sql_id = prev_sql_id;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public BigDecimal getP1() {
		return p1;
	}

	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}

	public String getP1raw() {
		return p1raw;
	}

	public void setP1raw(String p1raw) {
		this.p1raw = p1raw;
	}

	public String getP1text() {
		return p1text;
	}

	public void setP1text(String p1text) {
		this.p1text = p1text;
	}

	public BigDecimal getP2() {
		return p2;
	}

	public void setP2(BigDecimal p2) {
		this.p2 = p2;
	}

	public String getP2raw() {
		return p2raw;
	}

	public void setP2raw(String p2raw) {
		this.p2raw = p2raw;
	}

	public String getP2text() {
		return p2text;
	}

	public void setP2text(String p2text) {
		this.p2text = p2text;
	}

	public BigDecimal getP3() {
		return p3;
	}

	public void setP3(BigDecimal p3) {
		this.p3 = p3;
	}

	public String getP3raw() {
		return p3raw;
	}

	public void setP3raw(String p3raw) {
		this.p3raw = p3raw;
	}

	public String getP3text() {
		return p3text;
	}

	public void setP3text(String p3text) {
		this.p3text = p3text;
	}

	public String getResource_consumer_group() {
		return resource_consumer_group;
	}

	public void setResource_consumer_group(String resource_consumer_group) {
		this.resource_consumer_group = resource_consumer_group;
	}

	public BigDecimal getRow_wait_block() {
		return row_wait_block;
	}

	public void setRow_wait_block(BigDecimal row_wait_block) {
		this.row_wait_block = row_wait_block;
	}

	public BigDecimal getRow_wait_file() {
		return row_wait_file;
	}

	public void setRow_wait_file(BigDecimal row_wait_file) {
		this.row_wait_file = row_wait_file;
	}

	public BigDecimal getRow_wait_obj() {
		return row_wait_obj;
	}

	public void setRow_wait_obj(BigDecimal row_wait_obj) {
		this.row_wait_obj = row_wait_obj;
	}

	public BigDecimal getRow_wait_row() {
		return row_wait_row;
	}

	public void setRow_wait_row(BigDecimal row_wait_row) {
		this.row_wait_row = row_wait_row;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public BigDecimal getSchema() {
		return schema;
	}

	public void setSchema(BigDecimal schema) {
		this.schema = schema;
	}

	public String getSchemaname() {
		return schemaname;
	}

	public void setSchemaname(String schemaname) {
		this.schemaname = schemaname;
	}

	public BigDecimal getSeconds_in_wait() {
		return seconds_in_wait;
	}

	public void setSeconds_in_wait(BigDecimal seconds_in_wait) {
		this.seconds_in_wait = seconds_in_wait;
	}

	public BigDecimal getSeq() {
		return seq;
	}

	public void setSeq(BigDecimal seq) {
		this.seq = seq;
	}

	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public BigDecimal getSession_edition_id() {
		return session_edition_id;
	}

	public void setSession_edition_id(BigDecimal session_edition_id) {
		this.session_edition_id = session_edition_id;
	}

	public String getShard_ddl_status() {
		return shard_ddl_status;
	}

	public void setShard_ddl_status(String shard_ddl_status) {
		this.shard_ddl_status = shard_ddl_status;
	}

	public BigDecimal getSid() {
		return sid;
	}

	public void setSid(BigDecimal sid) {
		this.sid = sid;
	}

	public String getSql_address() {
		return sql_address;
	}

	public void setSql_address(String sql_address) {
		this.sql_address = sql_address;
	}

	public BigDecimal getSql_child_number() {
		return sql_child_number;
	}

	public void setSql_child_number(BigDecimal sql_child_number) {
		this.sql_child_number = sql_child_number;
	}

	public BigDecimal getSql_exec_id() {
		return sql_exec_id;
	}

	public void setSql_exec_id(BigDecimal sql_exec_id) {
		this.sql_exec_id = sql_exec_id;
	}

	public Timestamp getSql_exec_start() {
		return sql_exec_start;
	}

	public void setSql_exec_start(Timestamp sql_exec_start) {
		this.sql_exec_start = sql_exec_start;
	}

	public BigDecimal getSql_hash_value() {
		return sql_hash_value;
	}

	public void setSql_hash_value(BigDecimal sql_hash_value) {
		this.sql_hash_value = sql_hash_value;
	}

	public String getSql_id() {
		return sql_id;
	}

	public void setSql_id(String sql_id) {
		this.sql_id = sql_id;
	}

	public String getSql_trace() {
		return sql_trace;
	}

	public void setSql_trace(String sql_trace) {
		this.sql_trace = sql_trace;
	}

	public String getSql_trace_binds() {
		return sql_trace_binds;
	}

	public void setSql_trace_binds(String sql_trace_binds) {
		this.sql_trace_binds = sql_trace_binds;
	}

	public String getSql_trace_plan_stats() {
		return sql_trace_plan_stats;
	}

	public void setSql_trace_plan_stats(String sql_trace_plan_stats) {
		this.sql_trace_plan_stats = sql_trace_plan_stats;
	}

	public String getSql_trace_waits() {
		return sql_trace_waits;
	}

	public void setSql_trace_waits(String sql_trace_waits) {
		this.sql_trace_waits = sql_trace_waits;
	}

	public BigDecimal getSql_translation_profile_id() {
		return sql_translation_profile_id;
	}

	public void setSql_translation_profile_id(BigDecimal sql_translation_profile_id) {
		this.sql_translation_profile_id = sql_translation_profile_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTaddr() {
		return taddr;
	}

	public void setTaddr(String taddr) {
		this.taddr = taddr;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public BigDecimal getTime_remaining_micro() {
		return time_remaining_micro;
	}

	public void setTime_remaining_micro(BigDecimal time_remaining_micro) {
		this.time_remaining_micro = time_remaining_micro;
	}

	public BigDecimal getTime_since_last_wait_micro() {
		return time_since_last_wait_micro;
	}

	public void setTime_since_last_wait_micro(BigDecimal time_since_last_wait_micro) {
		this.time_since_last_wait_micro = time_since_last_wait_micro;
	}

	public BigDecimal getTop_level_call() {
		return top_level_call;
	}

	public void setTop_level_call(BigDecimal top_level_call) {
		this.top_level_call = top_level_call;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getUser() {
		return user;
	}

	public void setUser(BigDecimal user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getWait_class() {
		return wait_class;
	}

	public void setWait_class(String wait_class) {
		this.wait_class = wait_class;
	}

	public BigDecimal getWait_class2() {
		return wait_class2;
	}

	public void setWait_class2(BigDecimal wait_class2) {
		this.wait_class2 = wait_class2;
	}

	public BigDecimal getWait_class_id() {
		return wait_class_id;
	}

	public void setWait_class_id(BigDecimal wait_class_id) {
		this.wait_class_id = wait_class_id;
	}

	public BigDecimal getWait_time() {
		return wait_time;
	}

	public void setWait_time(BigDecimal wait_time) {
		this.wait_time = wait_time;
	}

	public BigDecimal getWait_time_micro() {
		return wait_time_micro;
	}

	public void setWait_time_micro(BigDecimal wait_time_micro) {
		this.wait_time_micro = wait_time_micro;
	}

	public Session(String action, BigDecimal action_hash, BigDecimal audsid, BigDecimal blocking_instance,
			BigDecimal blocking_session, String blocking_session_status, String client_identifier, String client_info,
			BigDecimal command, BigDecimal con_id, String creator_addr, BigDecimal creator_serial,
			BigDecimal current_queue_duration, String ecid, String event, BigDecimal event2, String external_name,
			String failed_over, String failover_method, String failover_type, BigDecimal final_blocking_instance,
			BigDecimal final_blocking_session, String final_blocking_session_status, BigDecimal fixed_table_sequence,
			BigDecimal last_call_et, String lockwait, Timestamp logon_time, String machine, String module,
			BigDecimal module_hash, String osuser, BigDecimal ownerid, String paddr, String pddl_status,
			String pdml_enabled, String pdml_status, BigDecimal pga_tunable_mem, String plsql_debugger_connected,
			BigDecimal plsql_entry_object_id, BigDecimal plsql_entry_subprogram_id, BigDecimal plsql_object_id,
			BigDecimal plsql_subprogram_id, BigDecimal port, String pq_status, BigDecimal prev_child_number,
			BigDecimal prev_exec_id, Timestamp prev_exec_start, BigDecimal prev_hash_value, String prev_sql_addr,
			String prev_sql_id, String process, String program, BigDecimal p1, String p1raw, String p1text,
			BigDecimal p2, String p2raw, String p2text, BigDecimal p3, String p3raw, String p3text,
			String resource_consumer_group, BigDecimal row_wait_block, BigDecimal row_wait_file,
			BigDecimal row_wait_obj, BigDecimal row_wait_row, String saddr, BigDecimal schema, String schemaname,
			BigDecimal seconds_in_wait, BigDecimal seq, BigDecimal serial, String server, String service_name,
			BigDecimal session_edition_id, String shard_ddl_status, BigDecimal sid, String sql_address,
			BigDecimal sql_child_number, BigDecimal sql_exec_id, Timestamp sql_exec_start, BigDecimal sql_hash_value,
			String sql_id, String sql_trace, String sql_trace_binds, String sql_trace_plan_stats,
			String sql_trace_waits, BigDecimal sql_translation_profile_id, String state, String status, String taddr,
			String terminal, BigDecimal time_remaining_micro, BigDecimal time_since_last_wait_micro,
			BigDecimal top_level_call, String type, BigDecimal user, String username, String wait_class,
			BigDecimal wait_class2, BigDecimal wait_class_id, BigDecimal wait_time, BigDecimal wait_time_micro) {
		super();
		this.action = action;
		this.action_hash = action_hash;
		this.audsid = audsid;
		this.blocking_instance = blocking_instance;
		this.blocking_session = blocking_session;
		this.blocking_session_status = blocking_session_status;
		this.client_identifier = client_identifier;
		this.client_info = client_info;
		this.command = command;
		this.con_id = con_id;
		this.creator_addr = creator_addr;
		this.creator_serial = creator_serial;
		this.current_queue_duration = current_queue_duration;
		this.ecid = ecid;
		this.event = event;
		this.event2 = event2;
		this.external_name = external_name;
		this.failed_over = failed_over;
		this.failover_method = failover_method;
		this.failover_type = failover_type;
		this.final_blocking_instance = final_blocking_instance;
		this.final_blocking_session = final_blocking_session;
		this.final_blocking_session_status = final_blocking_session_status;
		this.fixed_table_sequence = fixed_table_sequence;
		this.last_call_et = last_call_et;
		this.lockwait = lockwait;
		this.logon_time = logon_time;
		this.machine = machine;
		this.module = module;
		this.module_hash = module_hash;
		this.osuser = osuser;
		this.ownerid = ownerid;
		this.paddr = paddr;
		this.pddl_status = pddl_status;
		this.pdml_enabled = pdml_enabled;
		this.pdml_status = pdml_status;
		this.pga_tunable_mem = pga_tunable_mem;
		this.plsql_debugger_connected = plsql_debugger_connected;
		this.plsql_entry_object_id = plsql_entry_object_id;
		this.plsql_entry_subprogram_id = plsql_entry_subprogram_id;
		this.plsql_object_id = plsql_object_id;
		this.plsql_subprogram_id = plsql_subprogram_id;
		this.port = port;
		this.pq_status = pq_status;
		this.prev_child_number = prev_child_number;
		this.prev_exec_id = prev_exec_id;
		this.prev_exec_start = prev_exec_start;
		this.prev_hash_value = prev_hash_value;
		this.prev_sql_addr = prev_sql_addr;
		this.prev_sql_id = prev_sql_id;
		this.process = process;
		this.program = program;
		this.p1 = p1;
		this.p1raw = p1raw;
		this.p1text = p1text;
		this.p2 = p2;
		this.p2raw = p2raw;
		this.p2text = p2text;
		this.p3 = p3;
		this.p3raw = p3raw;
		this.p3text = p3text;
		this.resource_consumer_group = resource_consumer_group;
		this.row_wait_block = row_wait_block;
		this.row_wait_file = row_wait_file;
		this.row_wait_obj = row_wait_obj;
		this.row_wait_row = row_wait_row;
		this.saddr = saddr;
		this.schema = schema;
		this.schemaname = schemaname;
		this.seconds_in_wait = seconds_in_wait;
		this.seq = seq;
		this.serial = serial;
		this.server = server;
		this.service_name = service_name;
		this.session_edition_id = session_edition_id;
		this.shard_ddl_status = shard_ddl_status;
		this.sid = sid;
		this.sql_address = sql_address;
		this.sql_child_number = sql_child_number;
		this.sql_exec_id = sql_exec_id;
		this.sql_exec_start = sql_exec_start;
		this.sql_hash_value = sql_hash_value;
		this.sql_id = sql_id;
		this.sql_trace = sql_trace;
		this.sql_trace_binds = sql_trace_binds;
		this.sql_trace_plan_stats = sql_trace_plan_stats;
		this.sql_trace_waits = sql_trace_waits;
		this.sql_translation_profile_id = sql_translation_profile_id;
		this.state = state;
		this.status = status;
		this.taddr = taddr;
		this.terminal = terminal;
		this.time_remaining_micro = time_remaining_micro;
		this.time_since_last_wait_micro = time_since_last_wait_micro;
		this.top_level_call = top_level_call;
		this.type = type;
		this.user = user;
		this.username = username;
		this.wait_class = wait_class;
		this.wait_class2 = wait_class2;
		this.wait_class_id = wait_class_id;
		this.wait_time = wait_time;
		this.wait_time_micro = wait_time_micro;
	}

	public Session() {
		super();
	}

	public Session(String process, String paddr, String program, String saddr, BigDecimal serial, BigDecimal sid, String type,
			String username) {
		super();
		this.process = process;
		this.paddr = paddr;
		this.program = program;
		this.saddr = saddr;
		this.serial = serial;
		this.sid = sid;
		this.type = type;
		this.username = username;
	}
}
