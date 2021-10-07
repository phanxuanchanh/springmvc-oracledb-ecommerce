package Ecommerce.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Product {
	private BigDecimal ID;
	private String name;
	private String description;
	private BigDecimal price;
	private BigDecimal discount;
	private BigDecimal quanty;
	private BigDecimal productCategoryId;
	private BigDecimal productStateId;
	private BigDecimal supplierId;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getQuanty() {
		return quanty;
	}

	public void setQuanty(BigDecimal quanty) {
		this.quanty = quanty;
	}

	public BigDecimal getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(BigDecimal productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public BigDecimal getProductStateId() {
		return productStateId;
	}

	public void setProductStateId(BigDecimal productStateId) {
		this.productStateId = productStateId;
	}

	public BigDecimal getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(BigDecimal supplierId) {
		this.supplierId = supplierId;
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

	public Product(BigDecimal iD, String name, String description, BigDecimal price, BigDecimal discount,
			BigDecimal quanty, BigDecimal productCategoryId, BigDecimal productStateId, BigDecimal supplierId,
			Timestamp createAt, Timestamp updateAt) {
		super();
		ID = iD;
		this.name = name;
		this.description = description;
		this.price = price;
		this.discount = discount;
		this.quanty = quanty;
		this.productCategoryId = productCategoryId;
		this.productStateId = productStateId;
		this.supplierId = supplierId;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public Product() {
		super();
	}
}
