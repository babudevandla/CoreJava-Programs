package com.custom.immutable;

public class MainTest {

	public static void main(String[] args) {
		Employee emp=new Employee(123, "babu", new Department("CSE"));
		emp.getDept().setName("ECE");
		

		System.out.println(emp.toString());
	}

}
