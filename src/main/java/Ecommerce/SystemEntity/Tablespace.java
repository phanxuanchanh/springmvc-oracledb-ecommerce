package Ecommerce.SystemEntity;

import java.math.BigDecimal;

public class Tablespace {
	private String tablespace_name;
	private BigDecimal block_size;
	private BigDecimal initial_extent;
	private BigDecimal next_extent;
	private BigDecimal min_extents;
	private BigDecimal max_extents;
	private BigDecimal max_size;
	private BigDecimal pct_increase;
	private BigDecimal min_extlen;
	private String status;
	private String contents;
	private String logging;
	private String force_logging;
	private String extent_management;
	private String allocation_type;
	private String plugged_in;
	private String segment_space_management;
	private String def_tab_compression;
	private String retention;
	private String bigfile;
	private String predicate_evaluation;
	private String encrypted;
	private String compress_for;
	private String def_inmemory;
	private String def_inmemory_priority;
	private String def_inmemory_distribute;
	private String def_inmemory_compression;
	private String def_inmemory_duplicate;
	private String shared;
	private String def_index_compression;
	private String index_compress_for;
	private String def_cellmemory;
	private String def_inmemory_service;
	private String def_inmemory_service_name;
	private String lost_write_protect;
	private String chunk_tablespace;

	public String getTablespace_name() {
		return tablespace_name;
	}

	public void setTablespace_name(String tablespace_name) {
		this.tablespace_name = tablespace_name;
	}

	public BigDecimal getBlock_size() {
		return block_size;
	}

	public void setBlock_size(BigDecimal block_size) {
		this.block_size = block_size;
	}

	public BigDecimal getInitial_extent() {
		return initial_extent;
	}

	public void setInitial_extent(BigDecimal initial_extent) {
		this.initial_extent = initial_extent;
	}

	public BigDecimal getNext_extent() {
		return next_extent;
	}

	public void setNext_extent(BigDecimal next_extent) {
		this.next_extent = next_extent;
	}

	public BigDecimal getMin_extents() {
		return min_extents;
	}

	public void setMin_extents(BigDecimal min_extents) {
		this.min_extents = min_extents;
	}

	public BigDecimal getMax_extents() {
		return max_extents;
	}

	public void setMax_extents(BigDecimal max_extents) {
		this.max_extents = max_extents;
	}

	public BigDecimal getMax_size() {
		return max_size;
	}

	public void setMax_size(BigDecimal max_size) {
		this.max_size = max_size;
	}

	public BigDecimal getPct_increase() {
		return pct_increase;
	}

	public void setPct_increase(BigDecimal pct_increase) {
		this.pct_increase = pct_increase;
	}

	public BigDecimal getMin_extlen() {
		return min_extlen;
	}

	public void setMin_extlen(BigDecimal min_extlen) {
		this.min_extlen = min_extlen;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getLogging() {
		return logging;
	}

	public void setLogging(String logging) {
		this.logging = logging;
	}

	public String getForce_logging() {
		return force_logging;
	}

	public void setForce_logging(String force_logging) {
		this.force_logging = force_logging;
	}

	public String getExtent_management() {
		return extent_management;
	}

	public void setExtent_management(String extent_management) {
		this.extent_management = extent_management;
	}

	public String getAllocation_type() {
		return allocation_type;
	}

	public void setAllocation_type(String allocation_type) {
		this.allocation_type = allocation_type;
	}

	public String getPlugged_in() {
		return plugged_in;
	}

	public void setPlugged_in(String plugged_in) {
		this.plugged_in = plugged_in;
	}

	public String getSegment_space_management() {
		return segment_space_management;
	}

	public void setSegment_space_management(String segment_space_management) {
		this.segment_space_management = segment_space_management;
	}

	public String getDef_tab_compression() {
		return def_tab_compression;
	}

	public void setDef_tab_compression(String def_tab_compression) {
		this.def_tab_compression = def_tab_compression;
	}

	public String getRetention() {
		return retention;
	}

	public void setRetention(String retention) {
		this.retention = retention;
	}

	public String getBigfile() {
		return bigfile;
	}

	public void setBigfile(String bigfile) {
		this.bigfile = bigfile;
	}

	public String getPredicate_evaluation() {
		return predicate_evaluation;
	}

	public void setPredicate_evaluation(String predicate_evaluation) {
		this.predicate_evaluation = predicate_evaluation;
	}

	public String getEncrypted() {
		return encrypted;
	}

	public void setEncrypted(String encrypted) {
		this.encrypted = encrypted;
	}

	public String getCompress_for() {
		return compress_for;
	}

	public void setCompress_for(String compress_for) {
		this.compress_for = compress_for;
	}

	public String getDef_inmemory() {
		return def_inmemory;
	}

	public void setDef_inmemory(String def_inmemory) {
		this.def_inmemory = def_inmemory;
	}

	public String getDef_inmemory_priority() {
		return def_inmemory_priority;
	}

	public void setDef_inmemory_priority(String def_inmemory_priority) {
		this.def_inmemory_priority = def_inmemory_priority;
	}

	public String getDef_inmemory_distribute() {
		return def_inmemory_distribute;
	}

	public void setDef_inmemory_distribute(String def_inmemory_distribute) {
		this.def_inmemory_distribute = def_inmemory_distribute;
	}

	public String getDef_inmemory_compression() {
		return def_inmemory_compression;
	}

	public void setDef_inmemory_compression(String def_inmemory_compression) {
		this.def_inmemory_compression = def_inmemory_compression;
	}

	public String getDef_inmemory_duplicate() {
		return def_inmemory_duplicate;
	}

	public void setDef_inmemory_duplicate(String def_inmemory_duplicate) {
		this.def_inmemory_duplicate = def_inmemory_duplicate;
	}

	public String getShared() {
		return shared;
	}

	public void setShared(String shared) {
		this.shared = shared;
	}

	public String getDef_index_compression() {
		return def_index_compression;
	}

	public void setDef_index_compression(String def_index_compression) {
		this.def_index_compression = def_index_compression;
	}

	public String getIndex_compress_for() {
		return index_compress_for;
	}

	public void setIndex_compress_for(String index_compress_for) {
		this.index_compress_for = index_compress_for;
	}

	public String getDef_cellmemory() {
		return def_cellmemory;
	}

	public void setDef_cellmemory(String def_cellmemory) {
		this.def_cellmemory = def_cellmemory;
	}

	public String getDef_inmemory_service() {
		return def_inmemory_service;
	}

	public void setDef_inmemory_service(String def_inmemory_service) {
		this.def_inmemory_service = def_inmemory_service;
	}

	public String getDef_inmemory_service_name() {
		return def_inmemory_service_name;
	}

	public void setDef_inmemory_service_name(String def_inmemory_service_name) {
		this.def_inmemory_service_name = def_inmemory_service_name;
	}

	public String getLost_write_protect() {
		return lost_write_protect;
	}

	public void setLost_write_protect(String lost_write_protect) {
		this.lost_write_protect = lost_write_protect;
	}

	public String getChunk_tablespace() {
		return chunk_tablespace;
	}

	public void setChunk_tablespace(String chunk_tablespace) {
		this.chunk_tablespace = chunk_tablespace;
	}

	public Tablespace(String tablespace_name, BigDecimal block_size, BigDecimal initial_extent, BigDecimal next_extent,
			BigDecimal min_extents, BigDecimal max_extents, BigDecimal max_size, BigDecimal pct_increase,
			BigDecimal min_extlen, String status, String contents, String logging, String force_logging,
			String extent_management, String allocation_type, String plugged_in, String segment_space_management,
			String def_tab_compression, String retention, String bigfile, String predicate_evaluation, String encrypted,
			String compress_for, String def_inmemory, String def_inmemory_priority, String def_inmemory_distribute,
			String def_inmemory_compression, String def_inmemory_duplicate, String shared, String def_index_compression,
			String index_compress_for, String def_cellmemory, String def_inmemory_service,
			String def_inmemory_service_name, String lost_write_protect, String chunk_tablespace) {
		super();
		this.tablespace_name = tablespace_name;
		this.block_size = block_size;
		this.initial_extent = initial_extent;
		this.next_extent = next_extent;
		this.min_extents = min_extents;
		this.max_extents = max_extents;
		this.max_size = max_size;
		this.pct_increase = pct_increase;
		this.min_extlen = min_extlen;
		this.status = status;
		this.contents = contents;
		this.logging = logging;
		this.force_logging = force_logging;
		this.extent_management = extent_management;
		this.allocation_type = allocation_type;
		this.plugged_in = plugged_in;
		this.segment_space_management = segment_space_management;
		this.def_tab_compression = def_tab_compression;
		this.retention = retention;
		this.bigfile = bigfile;
		this.predicate_evaluation = predicate_evaluation;
		this.encrypted = encrypted;
		this.compress_for = compress_for;
		this.def_inmemory = def_inmemory;
		this.def_inmemory_priority = def_inmemory_priority;
		this.def_inmemory_distribute = def_inmemory_distribute;
		this.def_inmemory_compression = def_inmemory_compression;
		this.def_inmemory_duplicate = def_inmemory_duplicate;
		this.shared = shared;
		this.def_index_compression = def_index_compression;
		this.index_compress_for = index_compress_for;
		this.def_cellmemory = def_cellmemory;
		this.def_inmemory_service = def_inmemory_service;
		this.def_inmemory_service_name = def_inmemory_service_name;
		this.lost_write_protect = lost_write_protect;
		this.chunk_tablespace = chunk_tablespace;
	}

	public Tablespace() {
		super();
	}

	public Tablespace(String tablespace_name, BigDecimal block_size, BigDecimal initial_extent, BigDecimal next_extent,
			String status, String contents) {
		super();
		this.tablespace_name = tablespace_name;
		this.block_size = block_size;
		this.initial_extent = initial_extent;
		this.next_extent = next_extent;
		this.status = status;
		this.contents = contents;
	}
}
