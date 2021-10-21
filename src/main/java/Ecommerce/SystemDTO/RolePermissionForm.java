package Ecommerce.SystemDTO;

public class RolePermissionForm {
	private String role_name;
	private String permissions;
	private String option;

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	
	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public RolePermissionForm(String role_name, String permissions, String option) {
		super();
		this.role_name = role_name;
		this.permissions = permissions;
		this.option = option;
	}

	public RolePermissionForm() {
		super();
	}
}
