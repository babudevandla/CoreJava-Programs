package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.vo.Address;
import com.java8.vo.Employee;

public class EmployeeStream {

	public static void main(String[] args) {

		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee("babu", "devandla", "bangalore", "nellore"));
		list.add(new Employee("ravi", "kambam", "hyderabad", "thirupathi"));
		list.add(new Employee("bhanu", "chandra", "chennai", "pune"));
		list.add(new Employee("raja", "k", "delhi", "orissa"));

		List<Address> addList = list.stream()
                .map(emp -> new Address(emp.getPresentAddr(), emp.getPermanetAddr()))
                .collect(Collectors.toList());

        System.out.println(addList);
		
	}

}
