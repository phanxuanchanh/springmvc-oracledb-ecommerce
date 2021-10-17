package Ecommerce.SystemDTO;

public class UserInput {
	private String username;
	private String password;
	private String tablespace;
	private String quota;
	private String profile;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTablespace() {
		return tablespace;
	}

	public void setTablespace(String tablespace) {
		this.tablespace = tablespace;
	}

	public String getQuota() {
		return quota;
	}

	public void setQuota(String quota) {
		this.quota = quota;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public UserInput(String username, String password, String tablespace, String quota, String profile) {
		super();
		this.username = username;
		this.password = password;
		this.tablespace = tablespace;
		this.quota = quota;
		this.profile = profile;
	}

	public UserInput() {
		super();
	}
}
