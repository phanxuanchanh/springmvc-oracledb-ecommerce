package Ecommerce.SystemEntity;

public class SystemPrivilege {
	private String grantee;
	private String privilege;
	private String admin_option;
	private String common;
	private String inherited;

	public String getGrantee() {
		return grantee;
	}

	public void setGrantee(String grantee) {
		this.grantee = grantee;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getAdmin_option() {
		return admin_option;
	}

	public void setAdmin_option(String admin_option) {
		this.admin_option = admin_option;
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

	public SystemPrivilege(String grantee, String privilege, String admin_option, String common, String inherited) {
		super();
		this.grantee = grantee;
		this.privilege = privilege;
		this.admin_option = admin_option;
		this.common = common;
		this.inherited = inherited;
	}

	public SystemPrivilege() {
		super();
	}

	public SystemPrivilege(String grantee, String privilege) {
		super();
		this.grantee = grantee;
		this.privilege = privilege;
	}
}
