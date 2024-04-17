package com;

import java.io.Serializable;

//public record UserBean(String uname, String pword, String fname, String lname, String address, String mid, long phno)
//		implements Serializable {
//public UserBean {
//}
//}

public class UserBean implements Serializable {
	private String uname;
	private String pword;
	private String fname;
	private String lname;
	private String address;
	private String mid;
	private Long phno;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public UserBean(String uname, String pword, String fname, String lname, String address, String mid, Long phno) {
		super();
		this.uname = uname;
		this.pword = pword;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mid = mid;
		this.phno = phno;
	}

}