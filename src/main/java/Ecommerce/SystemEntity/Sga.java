package Ecommerce.SystemEntity;

import java.math.BigDecimal;

public class Sga {
	private String name;
	private BigDecimal value;
	private BigDecimal con_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getCon_id() {
		return con_id;
	}

	public void setCon_id(BigDecimal con_id) {
		this.con_id = con_id;
	}

	public Sga(String name, BigDecimal value, BigDecimal con_id) {
		super();
		this.name = name;
		this.value = value;
		this.con_id = con_id;
	}

	public Sga() {
		super();
	}
}
