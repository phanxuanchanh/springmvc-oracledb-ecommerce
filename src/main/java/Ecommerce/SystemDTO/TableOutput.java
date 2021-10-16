package Ecommerce.SystemDTO;

public class TableOutput {
	private String owner;
	private String table_name;
	private String tablespace_name;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public String getTablespace_name() {
		return tablespace_name;
	}

	public void setTablespace_name(String tablespace_name) {
		this.tablespace_name = tablespace_name;
	}

	public TableOutput(String owner, String table_name, String tablespace_name) {
		super();
		this.owner = owner;
		this.table_name = table_name;
		this.tablespace_name = tablespace_name;
	}

	public TableOutput() {
		super();
	}
}
