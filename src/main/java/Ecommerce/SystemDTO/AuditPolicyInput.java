package Ecommerce.SystemDTO;

public class AuditPolicyInput {
	private String object_schema;
	private String object_name;
	private String policy_name;
	private String statement_types;

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

	public String getStatement_types() {
		return statement_types;
	}

	public void setStatement_types(String statement_types) {
		this.statement_types = statement_types;
	}

	public AuditPolicyInput(String object_schema, String object_name, String policy_name, String statement_types) {
		super();
		this.object_schema = object_schema;
		this.object_name = object_name;
		this.policy_name = policy_name;
		this.statement_types = statement_types;
	}

	public AuditPolicyInput() {
		super();
	}
}
