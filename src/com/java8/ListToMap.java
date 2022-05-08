package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		 // create ArrayList
        List<Employees> employees = new ArrayList<Employees>();
 
        // add employee objects to list
        employees.add(new Employees(1001, "Surya", 18, "Consultant"));
        employees.add(new Employees(1002, "Akash", 20, "HR"));
        employees.add(new Employees(1003, "Pankaj", 23, "Developer"));
        employees.add(new Employees(1004, "Surya", 31, "SSE"));
        employees.add(new Employees(1005, "Aravind", 45, "Manager"));
        employees.add(new Employees(1006, "Pankaj", 35, "SSE"));
        employees.add(new Employees(1007, "Babu", 28, "Consultant"));
        employees.add(new Employees(1008, "Hari", 43, "Manager"));
        employees.add(new Employees(1009, "Yonus", 45, "Manager"));
        employees.add(new Employees(1010, "Subhas", 34, "HR"));
        
        
        // printing to console - List of Employees
        System.out.println("List of Employee : \n");
 
        // print to console using Java 8 for-each
        employees.forEach((employee) -> System.out.println(employee));
        System.out.println("---------------------");
        List<Employees> sortedList = employees.stream()
                .sorted(Comparator.comparingInt(Employees::getEmpAge))
                .collect(Collectors.toList());
     
        sortedList.forEach(System.out::println);
            
        Map<Integer, String> mapOfEmployees = employees.stream().collect(
                        Collectors.toMap(
                                e -> e.getEmpId(),
                                e -> e.getEmpName()));
 
        // printing to console - Map of Employees
        System.out.println("\nMap of Employee : \n");
 
        // print to console using Java 8 for-each
        mapOfEmployees.forEach(
                (key, value) -> System.out.println("Key: " + key 
                        + "\tValue: "+ value));
          
        System.out.println("\nSorting Map of values\n");
        mapOfEmployees.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue()).forEach(System.out::println);
       
        System.out.println("\nSorting Map of values in reverse Order\n");
        mapOfEmployees.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed()).forEach(System.out::println);
        
        System.out.println("---------------");
       // Map<Integer,Employees> map=employees.stream().collect(Collectors.toMap(Employees::getEmpId, emp->emp));
        Map<Integer,Employees> map=employees.stream().collect(Collectors.toMap(Employees::getEmpId, Function.identity()));
        map.entrySet().forEach(System.out::println);
        
        System.out.println("-----------");
        Map<Employees,Integer> map1=employees.stream().collect(Collectors.toMap(Function.identity(),Employees::getEmpId));
        map1.entrySet().stream().sorted((e1,e2) -> e1.getKey().getEmpName().compareTo(e2.getKey().getEmpName())).forEach(System.out::println);
        
        
        System.out.println("\nSorting Map of Value(Employees) \n");
        
        map.entrySet().stream().sorted((e1,e2) -> e1.getValue().getEmpName().compareTo(e2.getValue().getEmpName())).forEach(System.out::println);
        System.out.println("---------- Group By EmpName--------------------");
       
        Map<String, List<Employees>> groupByEmp=employees.stream().collect(Collectors.groupingBy(Employees::getEmpDesignation));
        groupByEmp.entrySet().forEach(System.out::println);
        
        System.out.println("^^^^^^^^^^^ Without Group BY^^^^^^^^^^^");
       // Map<String, List<Employees>> withoutGroupBy=employees.stream().collect(Collectors.toMap(Employees::getEmpId, e -> e.get))
        		
        //System.out.println("\nSorting Map of Value(Employees) \n");
        
      
	}

}
