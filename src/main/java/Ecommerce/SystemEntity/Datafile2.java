package Ecommerce.SystemEntity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Datafile2 { //v$datafile
	private BigDecimal file;
	private BigDecimal creation_time2; //creation_time#
	private Timestamp creation_time;
	private BigDecimal ts;
	private BigDecimal rfile;
	private String status;
	private String enabled;
	private BigDecimal chekpoint_change;
	private Timestamp checkpoint_time;
	private BigDecimal unrecoverrable_change;
	private Timestamp unrecoverable_time;
	private BigDecimal last_change;
	private Timestamp last_time;
	private BigDecimal offline_change;
	private BigDecimal online_change;
	private Timestamp online_time;
	private BigDecimal bytes;
	private BigDecimal blocks;
	private BigDecimal create_bytes;
	private BigDecimal block_size;
	private String name;
	private BigDecimal plugged_in;
	private BigDecimal block1_offset;
	private String aux_name;
	private BigDecimal first_nonlogged_scn;
	private Timestamp first_nonlogged_time;
	private BigDecimal foregin_dbid;
	private BigDecimal foreign_creation_change; 
	private Timestamp foreign_creation_time;
	private String plugged_readonly;
	private BigDecimal plugin_change;
	private Timestamp plugin_resetlogs_time;
	private BigDecimal con_id;
	public BigDecimal getFile() {
		return file;
	}
	public void setFile(BigDecimal file) {
		this.file = file;
	}
	public BigDecimal getCreation_time2() {
		return creation_time2;
	}
	public void setCreation_time2(BigDecimal creation_time2) {
		this.creation_time2 = creation_time2;
	}
	public Timestamp getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(Timestamp creation_time) {
		this.creation_time = creation_time;
	}
	public BigDecimal getTs() {
		return ts;
	}
	public void setTs(BigDecimal ts) {
		this.ts = ts;
	}
	public BigDecimal getRfile() {
		return rfile;
	}
	public void setRfile(BigDecimal rfile) {
		this.rfile = rfile;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public BigDecimal getChekpoint_change() {
		return chekpoint_change;
	}
	public void setChekpoint_change(BigDecimal chekpoint_change) {
		this.chekpoint_change = chekpoint_change;
	}
	public Timestamp getCheckpoint_time() {
		return checkpoint_time;
	}
	public void setCheckpoint_time(Timestamp checkpoint_time) {
		this.checkpoint_time = checkpoint_time;
	}
	public BigDecimal getUnrecoverrable_change() {
		return unrecoverrable_change;
	}
	public void setUnrecoverrable_change(BigDecimal unrecoverrable_change) {
		this.unrecoverrable_change = unrecoverrable_change;
	}
	public Timestamp getUnrecoverable_time() {
		return unrecoverable_time;
	}
	public void setUnrecoverable_time(Timestamp unrecoverable_time) {
		this.unrecoverable_time = unrecoverable_time;
	}
	public BigDecimal getLast_change() {
		return last_change;
	}
	public void setLast_change(BigDecimal last_change) {
		this.last_change = last_change;
	}
	public Timestamp getLast_time() {
		return last_time;
	}
	public void setLast_time(Timestamp last_time) {
		this.last_time = last_time;
	}
	public BigDecimal getOffline_change() {
		return offline_change;
	}
	public void setOffline_change(BigDecimal offline_change) {
		this.offline_change = offline_change;
	}
	public BigDecimal getOnline_change() {
		return online_change;
	}
	public void setOnline_change(BigDecimal online_change) {
		this.online_change = online_change;
	}
	public Timestamp getOnline_time() {
		return online_time;
	}
	public void setOnline_time(Timestamp online_time) {
		this.online_time = online_time;
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
	public BigDecimal getCreate_bytes() {
		return create_bytes;
	}
	public void setCreate_bytes(BigDecimal create_bytes) {
		this.create_bytes = create_bytes;
	}
	public BigDecimal getBlock_size() {
		return block_size;
	}
	public void setBlock_size(BigDecimal block_size) {
		this.block_size = block_size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPlugged_in() {
		return plugged_in;
	}
	public void setPlugged_in(BigDecimal plugged_in) {
		this.plugged_in = plugged_in;
	}
	public BigDecimal getBlock1_offset() {
		return block1_offset;
	}
	public void setBlock1_offset(BigDecimal block1_offset) {
		this.block1_offset = block1_offset;
	}
	public String getAux_name() {
		return aux_name;
	}
	public void setAux_name(String aux_name) {
		this.aux_name = aux_name;
	}
	public BigDecimal getFirst_nonlogged_scn() {
		return first_nonlogged_scn;
	}
	public void setFirst_nonlogged_scn(BigDecimal first_nonlogged_scn) {
		this.first_nonlogged_scn = first_nonlogged_scn;
	}
	public Timestamp getFirst_nonlogged_time() {
		return first_nonlogged_time;
	}
	public void setFirst_nonlogged_time(Timestamp first_nonlogged_time) {
		this.first_nonlogged_time = first_nonlogged_time;
	}
	public BigDecimal getForegin_dbid() {
		return foregin_dbid;
	}
	public void setForegin_dbid(BigDecimal foregin_dbid) {
		this.foregin_dbid = foregin_dbid;
	}
	public BigDecimal getForeign_creation_change() {
		return foreign_creation_change;
	}
	public void setForeign_creation_change(BigDecimal foreign_creation_change) {
		this.foreign_creation_change = foreign_creation_change;
	}
	public Timestamp getForeign_creation_time() {
		return foreign_creation_time;
	}
	public void setForeign_creation_time(Timestamp foreign_creation_time) {
		this.foreign_creation_time = foreign_creation_time;
	}
	public String getPlugged_readonly() {
		return plugged_readonly;
	}
	public void setPlugged_readonly(String plugged_readonly) {
		this.plugged_readonly = plugged_readonly;
	}
	public BigDecimal getPlugin_change() {
		return plugin_change;
	}
	public void setPlugin_change(BigDecimal plugin_change) {
		this.plugin_change = plugin_change;
	}
	public Timestamp getPlugin_resetlogs_time() {
		return plugin_resetlogs_time;
	}
	public void setPlugin_resetlogs_time(Timestamp plugin_resetlogs_time) {
		this.plugin_resetlogs_time = plugin_resetlogs_time;
	}
	public BigDecimal getCon_id() {
		return con_id;
	}
	public void setCon_id(BigDecimal con_id) {
		this.con_id = con_id;
	}
	public Datafile2(BigDecimal file, BigDecimal creation_time2, Timestamp creation_time, BigDecimal ts,
			BigDecimal rfile, String status, String enabled, BigDecimal chekpoint_change, Timestamp checkpoint_time,
			BigDecimal unrecoverrable_change, Timestamp unrecoverable_time, BigDecimal last_change, Timestamp last_time,
			BigDecimal offline_change, BigDecimal online_change, Timestamp online_time, BigDecimal bytes,
			BigDecimal blocks, BigDecimal create_bytes, BigDecimal block_size, String name, BigDecimal plugged_in,
			BigDecimal block1_offset, String aux_name, BigDecimal first_nonlogged_scn, Timestamp first_nonlogged_time,
			BigDecimal foregin_dbid, BigDecimal foreign_creation_change, Timestamp foreign_creation_time,
			String plugged_readonly, BigDecimal plugin_change, Timestamp plugin_resetlogs_time, BigDecimal con_id) {
		super();
		this.file = file;
		this.creation_time2 = creation_time2;
		this.creation_time = creation_time;
		this.ts = ts;
		this.rfile = rfile;
		this.status = status;
		this.enabled = enabled;
		this.chekpoint_change = chekpoint_change;
		this.checkpoint_time = checkpoint_time;
		this.unrecoverrable_change = unrecoverrable_change;
		this.unrecoverable_time = unrecoverable_time;
		this.last_change = last_change;
		this.last_time = last_time;
		this.offline_change = offline_change;
		this.online_change = online_change;
		this.online_time = online_time;
		this.bytes = bytes;
		this.blocks = blocks;
		this.create_bytes = create_bytes;
		this.block_size = block_size;
		this.name = name;
		this.plugged_in = plugged_in;
		this.block1_offset = block1_offset;
		this.aux_name = aux_name;
		this.first_nonlogged_scn = first_nonlogged_scn;
		this.first_nonlogged_time = first_nonlogged_time;
		this.foregin_dbid = foregin_dbid;
		this.foreign_creation_change = foreign_creation_change;
		this.foreign_creation_time = foreign_creation_time;
		this.plugged_readonly = plugged_readonly;
		this.plugin_change = plugin_change;
		this.plugin_resetlogs_time = plugin_resetlogs_time;
		this.con_id = con_id;
	}
	public Datafile2() {
		super();
	}
}
