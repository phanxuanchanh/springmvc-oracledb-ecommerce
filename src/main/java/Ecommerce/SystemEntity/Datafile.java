package Ecommerce.SystemEntity;

import java.math.BigDecimal;

public class Datafile {
	private String file_name;
	private BigDecimal file_id;
	private String tablespace_name;
	private BigDecimal bytes;
	private BigDecimal blocks;
	private String status;
	private BigDecimal relative_fno;
	private String autoextensible;
	private BigDecimal maxbytes;
	private BigDecimal maxblocks;
	private BigDecimal increment_by;
	private BigDecimal user_bytes;
	private BigDecimal user_blocks;
	private String online_status;
	private String lost_write_protect;

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public BigDecimal getFile_id() {
		return file_id;
	}

	public void setFile_id(BigDecimal file_id) {
		this.file_id = file_id;
	}

	public String getTablespace_name() {
		return tablespace_name;
	}

	public void setTablespace_name(String tablespace_name) {
		this.tablespace_name = tablespace_name;
	}

	public BigDecimal getBytes() {
		return bytes;
	}

	public void setBytes(BigDecimal bytes) {
		this.bytes = bytes;
	}

	public BigDecimal getBlocks() {
		return blocks;
	}

	public void setBlocks(BigDecimal blocks) {
		this.blocks = blocks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getRelative_fno() {
		return relative_fno;
	}

	public void setRelative_fno(BigDecimal relative_fno) {
		this.relative_fno = relative_fno;
	}

	public String getAutoextensible() {
		return autoextensible;
	}

	public void setAutoextensible(String autoextensible) {
		this.autoextensible = autoextensible;
	}

	public BigDecimal getMaxbytes() {
		return maxbytes;
	}

	public void setMaxbytes(BigDecimal maxbytes) {
		this.maxbytes = maxbytes;
	}

	public BigDecimal getMaxblocks() {
		return maxblocks;
	}

	public void setMaxblocks(BigDecimal maxblocks) {
		this.maxblocks = maxblocks;
	}

	public BigDecimal getIncrement_by() {
		return increment_by;
	}

	public void setIncrement_by(BigDecimal increment_by) {
		this.increment_by = increment_by;
	}

	public BigDecimal getUser_bytes() {
		return user_bytes;
	}

	public void setUser_bytes(BigDecimal user_bytes) {
		this.user_bytes = user_bytes;
	}

	public BigDecimal getUser_blocks() {
		return user_blocks;
	}

	public void setUser_blocks(BigDecimal user_blocks) {
		this.user_blocks = user_blocks;
	}

	public String getOnline_status() {
		return online_status;
	}

	public void setOnline_status(String online_status) {
		this.online_status = online_status;
	}

	public String getLost_write_protect() {
		return lost_write_protect;
	}

	public void setLost_write_protect(String lost_write_protect) {
		this.lost_write_protect = lost_write_protect;
	}

	public Datafile(String file_name, BigDecimal file_id, String tablespace_name, BigDecimal bytes, BigDecimal blocks,
			String status, BigDecimal relative_fno, String autoextensible, BigDecimal maxbytes, BigDecimal maxblocks,
			BigDecimal increment_by, BigDecimal user_bytes, BigDecimal user_blocks, String online_status,
			String lost_write_protect) {
		super();
		this.file_name = file_name;
		this.file_id = file_id;
		this.tablespace_name = tablespace_name;
		this.bytes = bytes;
		this.blocks = blocks;
		this.status = status;
		this.relative_fno = relative_fno;
		this.autoextensible = autoextensible;
		this.maxbytes = maxbytes;
		this.maxblocks = maxblocks;
		this.increment_by = increment_by;
		this.user_bytes = user_bytes;
		this.user_blocks = user_blocks;
		this.online_status = online_status;
		this.lost_write_protect = lost_write_protect;
	}

	public Datafile() {
		super();
	}

	public Datafile(String file_name, BigDecimal file_id, String tablespace_name) {
		super();
		this.file_name = file_name;
		this.file_id = file_id;
		this.tablespace_name = tablespace_name;
	}
}
