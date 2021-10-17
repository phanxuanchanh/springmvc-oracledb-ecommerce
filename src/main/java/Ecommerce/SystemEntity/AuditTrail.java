package Ecommerce.SystemEntity;

import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Timestamp;

public class AuditTrail {
	private BigDecimal session_id;
	private Timestamp timestamp;
	private String db_user;
	private String os_user;
	private String userhost;
	private String client_id;
	private String econtext_id;
	private String ext_name;
	private String object_schema;
	private String object_name;
	private String policy_name;
	private BigDecimal scn;
	private String sql_text;
	private String sql_bind;
	private String comment$text;
	private String statement_type;
	private Timestamp extended_timestamp;
	private BigDecimal proxy_sessionid;
	private String global_uid;
	private BigDecimal instance_number;
	private String os_process;
	private String transactionid;
	private BigDecimal statementid;
	private BigDecimal entryid;
	private String obj_edition_name;
	private BigDecimal dbid;
	private Clob rls_info;
	private String current_user;

	public BigDecimal getSession_id() {
		return session_id;
	}

	public void setSession_id(BigDecimal session_id) {
		this.session_id = session_id;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public String getDb_user() {
		return db_user;
	}

	public void setDb_user(String db_user) {
		this.db_user = db_user;
	}

	public String getOs_user() {
		return os_user;
	}

	public void setOs_user(String os_user) {
		this.os_user = os_user;
	}

	public String getUserhost() {
		return userhost;
	}

	public void setUserhost(String userhost) {
		this.userhost = userhost;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getEcontext_id() {
		return econtext_id;
	}

	public void setEcontext_id(String econtext_id) {
		this.econtext_id = econtext_id;
	}

	public String getExt_name() {
		return ext_name;
	}

	public void setExt_name(String ext_name) {
		this.ext_name = ext_name;
	}

	public String getObject_schema() {
		return object_schema;
	}

	public void setObject_schema(String object_schema) {
		this.object_schema = object_schema;
	}

	public String getObject_name() {
		return object_name;
	}

	public void setObject_name(String object_name) {
		this.object_name = object_name;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public BigDecimal getScn() {
		return scn;
	}

	public void setScn(BigDecimal scn) {
		this.scn = scn;
	}

	public String getSql_text() {
		return sql_text;
	}

	public void setSql_text(String sql_text) {
		this.sql_text = sql_text;
	}

	public String getSql_bind() {
		return sql_bind;
	}

	public void setSql_bind(String sql_bind) {
		this.sql_bind = sql_bind;
	}

	public String getComment$text() {
		return comment$text;
	}

	public void setComment$text(String comment$text) {
		this.comment$text = comment$text;
	}

	public String getStatement_type() {
		return statement_type;
	}

	public void setStatement_type(String statement_type) {
		this.statement_type = statement_type;
	}

	public Timestamp getExtended_timestamp() {
		return extended_timestamp;
	}

	public void setExtended_timestamp(Timestamp extended_timestamp) {
		this.extended_timestamp = extended_timestamp;
	}

	public BigDecimal getProxy_sessionid() {
		return proxy_sessionid;
	}

	public void setProxy_sessionid(BigDecimal proxy_sessionid) {
		this.proxy_sessionid = proxy_sessionid;
	}

	public String getGlobal_uid() {
		return global_uid;
	}

	public void setGlobal_uid(String global_uid) {
		this.global_uid = global_uid;
	}

	public BigDecimal getInstance_number() {
		return instance_number;
	}

	public void setInstance_number(BigDecimal instance_number) {
		this.instance_number = instance_number;
	}

	public String getOs_process() {
		return os_process;
	}

	public void setOs_process(String os_process) {
		this.os_process = os_process;
	}

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public BigDecimal getStatementid() {
		return statementid;
	}

	public void setStatementid(BigDecimal statementid) {
		this.statementid = statementid;
	}

	public BigDecimal getEntryid() {
		return entryid;
	}

	public void setEntryid(BigDecimal entryid) {
		this.entryid = entryid;
	}

	public String getObj_edition_name() {
		return obj_edition_name;
	}

	public void setObj_edition_name(String obj_edition_name) {
		this.obj_edition_name = obj_edition_name;
	}

	public BigDecimal getDbid() {
		return dbid;
	}

	public void setDbid(BigDecimal dbid) {
		this.dbid = dbid;
	}

	public Clob getRls_info() {
		return rls_info;
	}

	public void setRls_info(Clob rls_info) {
		this.rls_info = rls_info;
	}

	public String getCurrent_user() {
		return current_user;
	}

	public void setCurrent_user(String current_user) {
		this.current_user = current_user;
	}

	public AuditTrail(BigDecimal session_id, Timestamp timestamp, String db_user, String os_user, String userhost,
			String client_id, String econtext_id, String ext_name, String object_schema, String object_name,
			String policy_name, BigDecimal scn, String sql_text, String sql_bind, String comment$text,
			String statement_type, Timestamp extended_timestamp, BigDecimal proxy_sessionid, String global_uid,
			BigDecimal instance_number, String os_process, String transactionid, BigDecimal statementid,
			BigDecimal entryid, String obj_edition_name, BigDecimal dbid, Clob rls_info, String current_user) {
		super();
		this.session_id = session_id;
		this.timestamp = timestamp;
		this.db_user = db_user;
		this.os_user = os_user;
		this.userhost = userhost;
		this.client_id = client_id;
		this.econtext_id = econtext_id;
		this.ext_name = ext_name;
		this.object_schema = object_schema;
		this.object_name = object_name;
		this.policy_name = policy_name;
		this.scn = scn;
		this.sql_text = sql_text;
		this.sql_bind = sql_bind;
		this.comment$text = comment$text;
		this.statement_type = statement_type;
		this.extended_timestamp = extended_timestamp;
		this.proxy_sessionid = proxy_sessionid;
		this.global_uid = global_uid;
		this.instance_number = instance_number;
		this.os_process = os_process;
		this.transactionid = transactionid;
		this.statementid = statementid;
		this.entryid = entryid;
		this.obj_edition_name = obj_edition_name;
		this.dbid = dbid;
		this.rls_info = rls_info;
		this.current_user = current_user;
	}

	public AuditTrail() {
		super();
	}

	public AuditTrail(BigDecimal session_id, Timestamp timestamp, String db_user, String os_user, String userhost,
			String object_schema, String object_name, String policy_name, String sql_text, String statement_type) {
		super();
		this.session_id = session_id;
		this.timestamp = timestamp;
		this.db_user = db_user;
		this.os_user = os_user;
		this.userhost = userhost;
		this.object_schema = object_schema;
		this.object_name = object_name;
		this.policy_name = policy_name;
		this.sql_text = sql_text;
		this.statement_type = statement_type;
	}
}
