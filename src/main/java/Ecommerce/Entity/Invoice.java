package Ecommerce.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Invoice {
	private BigDecimal ID;
	private BigDecimal customerId;
	private Timestamp orderDate;
	private Timestamp shipedDate;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private BigDecimal fee;
	private BigDecimal paymentTypeId;
	private Timestamp paidDate;
	private BigDecimal invoiceStateId;
	private BigDecimal totalMoney;

	public BigDecimal getID() {
		return ID;
	}

	public void setID(BigDecimal iD) {
		ID = iD;
	}

	public BigDecimal getCustomerId() {
		return customerId;
	}

	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}

	public Timestamp getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Timestamp getShipedDate() {
		return shipedDate;
	}

	public void setShipedDate(Timestamp shipedDate) {
		this.shipedDate = shipedDate;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getPaymentTypeId() {
		return paymentTypeId;
	}

	public void setPaymentTypeId(BigDecimal paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}

	public Timestamp getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Timestamp paidDate) {
		this.paidDate = paidDate;
	}

	public BigDecimal getInvoiceStateId() {
		return invoiceStateId;
	}

	public void setInvoiceStateId(BigDecimal invoiceStateId) {
		this.invoiceStateId = invoiceStateId;
	}

	public BigDecimal getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Invoice(BigDecimal iD, BigDecimal customerId, Timestamp orderDate, Timestamp shipedDate, String address1,
			String address2, String city, String state, String postalCode, String country, BigDecimal fee,
			BigDecimal paymentTypeId, Timestamp paidDate, BigDecimal invoiceStateId, BigDecimal totalMoney) {
		super();
		ID = iD;
		this.customerId = customerId;
		this.orderDate = orderDate;
		this.shipedDate = shipedDate;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.fee = fee;
		this.paymentTypeId = paymentTypeId;
		this.paidDate = paidDate;
		this.invoiceStateId = invoiceStateId;
		this.totalMoney = totalMoney;
	}

	public Invoice() {
		super();
	}
}
