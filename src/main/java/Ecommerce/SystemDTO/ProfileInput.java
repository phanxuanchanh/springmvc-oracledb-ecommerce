package Ecommerce.SystemDTO;

public class ProfileInput {
	private String profile_name;
	private String connect_time;
	private String sessions_per_user;
	private String failed_login_attempts;
	private String password_lock_time;

	public String getProfile_name() {
		return profile_name;
	}

	public void setProfile_name(String profile_name) {
		this.profile_name = profile_name;
	}

	public String getConnect_time() {
		return connect_time;
	}

	public void setConnect_time(String connect_time) {
		this.connect_time = connect_time;
	}

	public String getSessions_per_user() {
		return sessions_per_user;
	}

	public void setSessions_per_user(String sessions_per_user) {
		this.sessions_per_user = sessions_per_user;
	}

	public String getFailed_login_attempts() {
		return failed_login_attempts;
	}

	public void setFailed_login_attempts(String failed_login_attempts) {
		this.failed_login_attempts = failed_login_attempts;
	}

	public String getPassword_lock_time() {
		return password_lock_time;
	}

	public void setPassword_lock_time(String password_lock_time) {
		this.password_lock_time = password_lock_time;
	}

	public ProfileInput(String profile_name, String connect_time, String sessions_per_user, String failed_login_attempts,
			String password_lock_time) {
		super();
		this.profile_name = profile_name;
		this.connect_time = connect_time;
		this.sessions_per_user = sessions_per_user;
		this.failed_login_attempts = failed_login_attempts;
		this.password_lock_time = password_lock_time;
	}

	public ProfileInput() {
		super();
	}
}
