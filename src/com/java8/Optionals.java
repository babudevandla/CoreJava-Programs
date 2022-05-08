package com.java8;

import java.util.Optional;

public class Optionals {
	
	public static void main(String[] args) {
		
		
		Employee data=new Employee(1, "ravi", 100000);
		
		Optional<Employee> optional=Optional.ofNullable(data);
		
		if(optional.isPresent()) {
			System.out.println("data present >>>>>");
		}
		
	}

}
