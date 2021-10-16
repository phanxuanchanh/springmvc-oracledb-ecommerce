package Ecommerce.SystemEntity;

import java.math.BigDecimal;

public class Process {
	private String addr;
	private BigDecimal pid;
	private String sosid;
	private String spid;
	private String stid;
	private String execution_type;
	private String pname;
	private String username;
	private BigDecimal serial;
	private String terminal;
	private String program;
	private String traceid;
	private String tracefile;
	private String background;
	private String latchwait;
	private String latchspin;
	private BigDecimal pga_used_mem;
	private BigDecimal pga_alloc_mem;
	private BigDecimal pga_freeable_mem;
	private BigDecimal pga_max_mem;
	private BigDecimal numa_default;
	private BigDecimal numa_curr;
	private BigDecimal cpu_used;
	public BigDecimal getCpu_used() {
		return cpu_used;
	}

	public void setCpu_used(BigDecimal cpu_used) {
		this.cpu_used = cpu_used;
	}

	private BigDecimal con_id;

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public BigDecimal getPid() {
		return pid;
	}

	public void setPid(BigDecimal pid) {
		this.pid = pid;
	}

	public String getSosid() {
		return sosid;
	}

	public void setSosid(String sosid) {
		this.sosid = sosid;
	}

	public String getSpid() {
		return spid;
	}

	public void setSpid(String spid) {
		this.spid = spid;
	}

	public String getStid() {
		return stid;
	}

	public void setStid(String stid) {
		this.stid = stid;
	}

	public String getExecution_type() {
		return execution_type;
	}

	public void setExecution_type(String execution_type) {
		this.execution_type = execution_type;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getTraceid() {
		return traceid;
	}

	public void setTraceid(String traceid) {
		this.traceid = traceid;
	}

	public String getTracefile() {
		return tracefile;
	}

	public void setTracefile(String tracefile) {
		this.tracefile = tracefile;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getLatchwait() {
		return latchwait;
	}

	public void setLatchwait(String latchwait) {
		this.latchwait = latchwait;
	}

	public String getLatchspin() {
		return latchspin;
	}

	public void setLatchspin(String latchspin) {
		this.latchspin = latchspin;
	}

	public BigDecimal getPga_used_mem() {
		return pga_used_mem;
	}

	public void setPga_used_mem(BigDecimal pga_used_mem) {
		this.pga_used_mem = pga_used_mem;
	}

	public BigDecimal getPga_alloc_mem() {
		return pga_alloc_mem;
	}

	public void setPga_alloc_mem(BigDecimal pga_alloc_mem) {
		this.pga_alloc_mem = pga_alloc_mem;
	}

	public BigDecimal getPga_freeable_mem() {
		return pga_freeable_mem;
	}

	public void setPga_freeable_mem(BigDecimal pga_freeable_mem) {
		this.pga_freeable_mem = pga_freeable_mem;
	}

	public BigDecimal getPga_max_mem() {
		return pga_max_mem;
	}

	public void setPga_max_mem(BigDecimal pga_max_mem) {
		this.pga_max_mem = pga_max_mem;
	}

	public BigDecimal getNuma_default() {
		return numa_default;
	}

	public void setNuma_default(BigDecimal numa_default) {
		this.numa_default = numa_default;
	}

	public BigDecimal getNuma_curr() {
		return numa_curr;
	}

	public void setNuma_curr(BigDecimal numa_curr) {
		this.numa_curr = numa_curr;
	}

	public BigDecimal getCon_id() {
		return con_id;
	}

	public void setCon_id(BigDecimal con_id) {
		this.con_id = con_id;
	}

	public Process(String addr, BigDecimal pid, String sosid, String spid, String stid, String execution_type,
			String pname, String username, BigDecimal serial, String terminal, String program, String traceid,
			String tracefile, String background, String latchwait, String latchspin, BigDecimal pga_used_mem,
			BigDecimal pga_alloc_mem, BigDecimal pga_freeable_mem, BigDecimal pga_max_mem, BigDecimal numa_default,
			BigDecimal numa_curr, BigDecimal cpu_used, BigDecimal con_id) {
		super();
		this.addr = addr;
		this.pid = pid;
		this.sosid = sosid;
		this.spid = spid;
		this.stid = stid;
		this.execution_type = execution_type;
		this.pname = pname;
		this.username = username;
		this.serial = serial;
		this.terminal = terminal;
		this.program = program;
		this.traceid = traceid;
		this.tracefile = tracefile;
		this.background = background;
		this.latchwait = latchwait;
		this.latchspin = latchspin;
		this.pga_used_mem = pga_used_mem;
		this.pga_alloc_mem = pga_alloc_mem;
		this.pga_freeable_mem = pga_freeable_mem;
		this.pga_max_mem = pga_max_mem;
		this.numa_default = numa_default;
		this.numa_curr = numa_curr;
		this.cpu_used = cpu_used;
		this.con_id = con_id;
	}

	public Process() {
		super();
	}

	public Process(String addr, BigDecimal pid, String sosid, String spid, String stid, String execution_type,
			String pname, String username) {
		super();
		this.addr = addr;
		this.pid = pid;
		this.sosid = sosid;
		this.spid = spid;
		this.stid = stid;
		this.execution_type = execution_type;
		this.pname = pname;
		this.username = username;
	}
}
