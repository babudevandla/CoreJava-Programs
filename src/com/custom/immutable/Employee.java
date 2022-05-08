package com.custom.immutable;

public final class Employee  {

	private final Integer id;
	private final String name;
	private final Department dept;
	
	public Employee(Integer id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Department getDept() {
		return dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public String subString(int start, int end) {
		
		return null;
	}
}
