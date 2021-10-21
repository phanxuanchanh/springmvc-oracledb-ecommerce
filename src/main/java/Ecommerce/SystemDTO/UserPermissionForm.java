package Ecommerce.SystemDTO;

public class UserPermissionForm {
	private String username;
	private String permissions;
	private String option;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public UserPermissionForm(String username, String permissions, String option) {
		super();
		this.username = username;
		this.permissions = permissions;
		this.option = option;
	}

	public UserPermissionForm() {
		super();
	}
}
