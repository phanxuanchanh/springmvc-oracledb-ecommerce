package Ecommerce.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Supplier {
	private BigDecimal ID;
	private String name;
	private String description;
	private String phone;
	private String email;
	private String fax;
	private Timestamp createAt;
	private Timestamp updateAt;

	public BigDecimal getID() {
		return ID;
	}

	public void setID(BigDecimal iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
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

	public Supplier(BigDecimal iD, String name, String description, String phone, String email, String fax,
			Timestamp createAt, Timestamp updateAt) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
		this.phone = phone;
		this.email = email;
		this.fax = fax;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Supplier() {
		super();
	}
}
