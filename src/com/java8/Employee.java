package com.java8;

public class Employee {

	private Integer empid;
	private String empname;
	private double sal;

	
	public Employee(Integer empid, String empname, double sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", sal=" + sal + "]";
	}

}
