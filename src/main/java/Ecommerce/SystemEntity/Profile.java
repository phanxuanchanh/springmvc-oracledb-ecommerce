package Ecommerce.SystemEntity;

public class Profile {
	private String profile;
	private String resource_name;
	private String resource_type;
	private String limit;
	private String common;
	private String inherited;
	private String implicit;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getResource_name() {
		return resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}

	public String getResource_type() {
		return resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
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

	public String getImplicit() {
		return implicit;
	}

	public void setImplicit(String implicit) {
		this.implicit = implicit;
	}

	public Profile(String profile, String resource_name, String resource_type, String limit, String common,
			String inherited, String implicit) {
		super();
		this.profile = profile;
		this.resource_name = resource_name;
		this.resource_type = resource_type;
		this.limit = limit;
		this.common = common;
		this.inherited = inherited;
		this.implicit = implicit;
	}

	public Profile() {
		super();
	}
}
