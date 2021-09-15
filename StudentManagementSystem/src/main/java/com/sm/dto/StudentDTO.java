package com.sm.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StudentDTO implements Serializable{
	private int sid;
	private String sname;
	private int sage;
	private String semail;
	private String sgen;
	private String saddr;
	public StudentDTO() {}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSgen() {
		return sgen;
	}
	public void setSgen(String sgen) {
		this.sgen = sgen;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
}
