package Ecommerce.SystemDTO;

public class TablespaceInput {
	private String tablespace_name;
	private String datafiles;
	private String sizes;

	public String getTablespace_name() {
		return tablespace_name;
	}

	public void setTablespace_name(String tablespace_name) {
		this.tablespace_name = tablespace_name;
	}

	public String getDatafiles() {
		return datafiles;
	}

	public void setDatafiles(String datafiles) {
		this.datafiles = datafiles;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public TablespaceInput(String tablespace_name, String datafiles, String sizes) {
		super();
		this.tablespace_name = tablespace_name;
		this.datafiles = datafiles;
		this.sizes = sizes;
	}

	public TablespaceInput() {
		super();
	}
}
