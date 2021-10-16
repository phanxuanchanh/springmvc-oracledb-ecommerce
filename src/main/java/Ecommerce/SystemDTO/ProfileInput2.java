package Ecommerce.SystemDTO;

public class ProfileInput2 {
	private String profile_name;

	public String getProfile_name() {
		return profile_name;
	}

	public void setProfile_name(String profile_name) {
		this.profile_name = profile_name;
	}

	public ProfileInput2(String profile_name) {
		super();
		this.profile_name = profile_name;
	}

	public ProfileInput2() {
		super();
	}
}
