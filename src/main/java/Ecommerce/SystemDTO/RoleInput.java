package Ecommerce.SystemDTO;

public class RoleInput {
	private String role_name;
	private String password;

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleInput(String role_name, String password) {
		super();
		this.role_name = role_name;
		this.password = password;
	}

	public RoleInput() {
		super();
	}
}
