package Ecommerce.SystemDTO;

import java.math.BigDecimal;

public class ProcessVsSession {
	private String saddr;
	private BigDecimal sid;
	private BigDecimal serial;
	private String username;
	private String program;
	private String paddr;
	private BigDecimal pid;
	private String sosid;
	private String spid;
	private String pname;

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public BigDecimal getSid() {
		return sid;
	}

	public void setSid(BigDecimal sid) {
		this.sid = sid;
	}

	public String getPaddr() {
		return paddr;
	}

	public void setPaddr(String paddr) {
		this.paddr = paddr;
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

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}
	
	public ProcessVsSession() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public ProcessVsSession(String saddr, BigDecimal sid, BigDecimal serial, String username, String program,
			String paddr, BigDecimal pid, String sosid, String spid, String pname) {
		super();
		this.saddr = saddr;
		this.sid = sid;
		this.serial = serial;
		this.username = username;
		this.program = program;
		this.paddr = paddr;
		this.pid = pid;
		this.sosid = sosid;
		this.spid = spid;
		this.pname = pname;
	}
}
