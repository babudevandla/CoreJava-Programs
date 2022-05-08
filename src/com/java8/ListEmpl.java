package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListEmpl {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(1,"babu",15000));
		list.add(new Employee(2,"ravi",25000));
		list.add(new Employee(3,"bhanu",19000));
		list.add(new Employee(4,"sathish",56000));
		list.add(new Employee(5,"hari",34000));
		list.add(new Employee(6,"sayed",10000));
		list.add(new Employee(7,"ismail",45000));
		
		
		List<Employee> result=list.stream().filter(emp -> emp.getSal()>25000).collect(Collectors.toList());
		Map<Integer,Employee> map=list.stream().filter(emp -> emp.getSal()>25000).collect(Collectors.toMap(emp -> emp.getEmpid(), emp ->emp));

		map.forEach((k,v) ->{
				System.out.println("Key::"+k+" , Value::"+v);
		});
		
		System.out.println("--------------------");
		
		map.entrySet().stream().forEach(System.out::println);
		
		System.out.println("-------- Sorting Employees list------------");
		Comparator<Employee> sorttedList=(e1,e2) -> e1.getEmpname().compareTo(e2.getEmpname());
		List<Employee> result1=list.stream().sorted(sorttedList).collect(Collectors.toList());
		result1.forEach(System.out::println);
		System.out.println("-------------------------");
		list.stream().sorted(sorttedList).forEach(System.out::println);
		
		
		System.out.println("---------------------");
		
		list.stream().filter(emp -> emp.getSal()>25000).peek(emp -> emp.setEmpname("S")).forEach(System.out::println);
	}

}
