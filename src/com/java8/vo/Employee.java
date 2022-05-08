package com.java8.vo;

public class Employee {

	private String fname;
	private String lname;
	private String presentAddr;
	private String permanetAddr;

	
	
	public Employee(String fname, String lname, String presentAddr, String permanetAddr) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.presentAddr = presentAddr;
		this.permanetAddr = permanetAddr;
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

	public String getPresentAddr() {
		return presentAddr;
	}

	public void setPresentAddr(String presentAddr) {
		this.presentAddr = presentAddr;
	}

	public String getPermanetAddr() {
		return permanetAddr;
	}

	public void setPermanetAddr(String permanetAddr) {
		this.permanetAddr = permanetAddr;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", presentAddr=" + presentAddr + ", permanetAddr="
				+ permanetAddr + "]";
	}

}
