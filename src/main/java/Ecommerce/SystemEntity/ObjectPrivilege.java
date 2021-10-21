package Ecommerce.SystemEntity;

public class ObjectPrivilege {
	private String grantee;
	private String owner;
	private String table_name;
	private String grantor;
	private String privilege;
	private String grantable;
	private String hierarchy;
	private String common;
	private String type;
	private String inherited;

	public String getGrantee() {
		return grantee;
	}

	public void setGrantee(String grantee) {
		this.grantee = grantee;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getGrantor() {
		return grantor;
	}

	public void setGrantor(String grantor) {
		this.grantor = grantor;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getGrantable() {
		return grantable;
	}

	public void setGrantable(String grantable) {
		this.grantable = grantable;
	}

	public String getHierarchy() {
		return hierarchy;
	}

	public void setHierarchy(String hierarchy) {
		this.hierarchy = hierarchy;
	}

	public String getCommon() {
		return common;
	}

	public void setCommon(String common) {
		this.common = common;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInherited() {
		return inherited;
	}

	public void setInherited(String inherited) {
		this.inherited = inherited;
	}

	public ObjectPrivilege(String grantee, String owner, String table_name, String grantor, String privilege,
			String grantable, String hierarchy, String common, String type, String inherited) {
		super();
		this.grantee = grantee;
		this.owner = owner;
		this.table_name = table_name;
		this.grantor = grantor;
		this.privilege = privilege;
		this.grantable = grantable;
		this.hierarchy = hierarchy;
		this.common = common;
		this.type = type;
		this.inherited = inherited;
	}

	public ObjectPrivilege() {
		super();
	}

	public ObjectPrivilege(String grantee, String privilege) {
		super();
		this.grantee = grantee;
		this.privilege = privilege;
	}
}
