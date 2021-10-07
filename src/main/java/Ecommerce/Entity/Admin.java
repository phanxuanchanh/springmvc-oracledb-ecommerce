package Ecommerce.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Admin {
	private BigDecimal ID;
	private String username;
	private String fullname;
	private String gender;
	private String description;
	private String email;
	private Timestamp birthday;
	private String avatar;
	private String phone;
	private String password;
	private BigDecimal roleId;
	private Timestamp createAt;
	private Timestamp updateAt;

	public BigDecimal getID() {
		return ID;
	}

	public void setID(BigDecimal ID) {
		this.ID = ID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getRoleId() {
		return roleId;
	}

	public void setRoleId(BigDecimal roleId) {
		this.roleId = roleId;
	}

	public Timestamp getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}

	public Timestamp getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}

	public Admin(BigDecimal ID, String username, String fullname, String gender, String description, String email,
			Timestamp birthday, String avatar, String phone, String password, BigDecimal roleId, Timestamp createAt,
			Timestamp updateAt) {
		super();
		this.ID = ID;
		this.username = username;
		this.fullname = fullname;
		this.gender = gender;
		this.description = description;
		this.email = email;
		this.birthday = birthday;
		this.avatar = avatar;
		this.phone = phone;
		this.password = password;
		this.roleId = roleId;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Admin() {
		super();
	}
}
