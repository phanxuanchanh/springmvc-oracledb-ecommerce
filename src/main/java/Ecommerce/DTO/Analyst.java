package Ecommerce.DTO;

public class Analyst {
	private int productNumber;
	private int productCategoryNumber;
	private int supplierNumber;
	private int customerNumber;

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public int getProductCategoryNumber() {
		return productCategoryNumber;
	}

	public void setProductCategoryNumber(int productCategoryNumber) {
		this.productCategoryNumber = productCategoryNumber;
	}

	public int getSupplierNumber() {
		return supplierNumber;
	}

	public void setSupplierNumber(int supplierNumber) {
		this.supplierNumber = supplierNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Analyst(int productNumber, int productCategoryNumber, int supplierNumber, int customerNumber) {
		super();
		this.productNumber = productNumber;
		this.productCategoryNumber = productCategoryNumber;
		this.supplierNumber = supplierNumber;
		this.customerNumber = customerNumber;
	}

	public Analyst() {
		super();
	}
}
