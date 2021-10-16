package Ecommerce.SystemEntity;

public class AuditPolicy {
	private String object_schema;
	private String object_name;
	private String policy_owner;
	private String policy_name;
	private String policy_text;
	private String policy_column;
	private String pf_schema;
	private String pf_package;
	private String pf_function;
	private String enabled;
	private String sel;
	private String ins;
	private String upd;
	private String del;
	private String audit_trail;
	private String policy_column_options;
	private String common;
	private String inherited;

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

	public String getPolicy_owner() {
		return policy_owner;
	}

	public void setPolicy_owner(String policy_owner) {
		this.policy_owner = policy_owner;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public String getPolicy_text() {
		return policy_text;
	}

	public void setPolicy_text(String policy_text) {
		this.policy_text = policy_text;
	}

	public String getPolicy_column() {
		return policy_column;
	}

	public void setPolicy_column(String policy_column) {
		this.policy_column = policy_column;
	}

	public String getPf_schema() {
		return pf_schema;
	}

	public void setPf_schema(String pf_schema) {
		this.pf_schema = pf_schema;
	}

	public String getPf_package() {
		return pf_package;
	}

	public void setPf_package(String pf_package) {
		this.pf_package = pf_package;
	}

	public String getPf_function() {
		return pf_function;
	}

	public void setPf_function(String pf_function) {
		this.pf_function = pf_function;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getSel() {
		return sel;
	}

	public void setSel(String sel) {
		this.sel = sel;
	}

	public String getIns() {
		return ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public String getUpd() {
		return upd;
	}

	public void setUpd(String upd) {
		this.upd = upd;
	}

	public String getDel() {
		return del;
	}

	public void setDel(String del) {
		this.del = del;
	}

	public String getAudit_trail() {
		return audit_trail;
	}

	public void setAudit_trail(String audit_trail) {
		this.audit_trail = audit_trail;
	}

	public String getPolicy_column_options() {
		return policy_column_options;
	}

	public void setPolicy_column_options(String policy_column_options) {
		this.policy_column_options = policy_column_options;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getInherited() {
		return inherited;
	}

	public void setInherited(String inherited) {
		this.inherited = inherited;
	}

	public AuditPolicy(String object_schema, String object_name, String policy_owner, String policy_name,
			String policy_text, String policy_column, String pf_schema, String pf_package, String pf_function,
			String enabled, String sel, String ins, String upd, String del, String audit_trail,
			String policy_column_options, String common, String inherited) {
		super();
		this.object_schema = object_schema;
		this.object_name = object_name;
		this.policy_owner = policy_owner;
		this.policy_name = policy_name;
		this.policy_text = policy_text;
		this.policy_column = policy_column;
		this.pf_schema = pf_schema;
		this.pf_package = pf_package;
		this.pf_function = pf_function;
		this.enabled = enabled;
		this.sel = sel;
		this.ins = ins;
		this.upd = upd;
		this.del = del;
		this.audit_trail = audit_trail;
		this.policy_column_options = policy_column_options;
		this.common = common;
		this.inherited = inherited;
	}

	public AuditPolicy(String object_schema, String object_name, String policy_owner, String policy_name) {
		super();
		this.object_schema = object_schema;
		this.object_name = object_name;
		this.policy_owner = policy_owner;
		this.policy_name = policy_name;
	}
}
