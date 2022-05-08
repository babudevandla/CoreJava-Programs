package com.java8;

public class Employees {

	// member variables
	private int empId;
	private String empName;
	private int empAge;
	private String empDesignation;

	// 4-arg parameterized constructor
	public Employees(int empId, String empName, 
            int empAge, String empDesignation) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empDesignation = empDesignation;
    }

	// getter & setter
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	// override toString()
	@Override
	public String toString() {
		return "Employee [" + "empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empDesignation="
				+ empDesignation + "]";
	}
}
