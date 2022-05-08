package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.vo.Emp;

public class RealTimeQuery {

	static List<Emp> employeeList = new ArrayList<Emp>();

	static {

		employeeList.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 96554.0));
		employeeList.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Emp(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		employeeList.add(new Emp(244, "Babu Devandla", 31, "Male", "Product Development", 2008, 104700.0));

	}

	public static void main(String[] args) {

		System.out.println("1 : How many male and female employees are there in the organization? \n");
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		System.out.println(noOfMaleAndFemaleEmployees);

		System.out.println("***********************************");
		System.out.println("2 : Print the name of all departments in the organization? \n ");

		employeeList.stream().map(Emp::getDepartment).distinct().forEach(System.out::println);

		System.out.println("***********************************");

		System.out.println("3 : What is the average age of male and female employees? \n ");

		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingInt(Emp::getAge)));

		System.out.println(avgAgeOfMaleAndFemaleEmployees);

		Map<String, Double> avgDeptOfEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Emp::getDepartment, Collectors.averagingInt(Emp::getAge)));

		System.out.println(avgDeptOfEmployees);

		System.out.println("4 : Get the details of highest paid employee in the organization? \n");

		Optional<Emp> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary)));

		Emp highestPaidEmployee = highestPaidEmployeeWrapper.get();

		System.out.println("Details Of Highest Paid Employee : ");

		System.out.println("==================================");

		System.out.println("ID : " + highestPaidEmployee.getId());

		System.out.println("Name : " + highestPaidEmployee.getName());

		System.out.println("Age : " + highestPaidEmployee.getAge());

		System.out.println("Gender : " + highestPaidEmployee.getGender());

		System.out.println("Department : " + highestPaidEmployee.getDepartment());

		System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());

		System.out.println("Salary : " + highestPaidEmployee.getSalary());

		System.out.println("********************************************");

		System.out.println("5 : Get the names of all employees who have joined after 2015? \n");

		employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(Emp::getName)
				.forEach(System.out::println);

		System.out.println("********************************************");

		System.out.println("6 : Count the number of employees in each department? \n");

		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Emp::getDepartment, Collectors.counting()));

		employeeCountByDepartment.entrySet().stream().forEach(System.out::println);

		System.out.println("********************************************");

		System.out.println("7 : What is the average salary of each department? \n");

		Map<String, Double> avgSalaryOfDepartments = employeeList.stream()
				.collect(Collectors.groupingBy(Emp::getDepartment, Collectors.averagingDouble(Emp::getSalary)));

		avgSalaryOfDepartments.entrySet().stream().forEach(System.out::println);

		System.out.println("********************************************");
		System.out.println("8 : Get the details of youngest male employee in the product development department? \n ");

		Optional<Emp> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
				.filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
				.min(Comparator.comparingInt(Emp::getAge));

		Emp youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

		System.out.println("----------------------------------------------");

		System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());

		System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());

		System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());

		System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

		System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());

		System.out.println("********************************************");

		System.out.println("9 : Who has the most working experience in the organization? \n ");
		Optional<Emp> seniorMostEmployeeWrapper = employeeList.stream()
				.sorted(Comparator.comparingInt(Emp::getYearOfJoining)).findFirst();

		Emp seniorMostEmployee = seniorMostEmployeeWrapper.get();

		System.out.println("Senior Most Employee Details :");

		System.out.println("----------------------------");

		System.out.println("ID : " + seniorMostEmployee.getId());

		System.out.println("Name : " + seniorMostEmployee.getName());

		System.out.println("Age : " + seniorMostEmployee.getAge());

		System.out.println("Gender : " + seniorMostEmployee.getGender());

		System.out.println("Age : " + seniorMostEmployee.getDepartment());

		System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());

		System.out.println("Salary : " + seniorMostEmployee.getSalary());

		System.out.println("********************************************");

		System.out.println("10 : How many male and female employees are there in the sales and marketing team? \n");
		
		Map<String,Long> countMaleFemaleEmployeesInSalesMarketing=employeeList.stream().filter(e -> e.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));
		System.out.println(countMaleFemaleEmployeesInSalesMarketing);
		
		System.out.println("********************************************");

		System.out.println("11 : What is the average salary of male and female employees? \n ");
		
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
		employeeList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(Emp::getSalary)));
		         
		System.out.println(avgSalaryOfMaleAndFemaleEmployees);
		System.out.println("********************************************");
		
		System.out.println("12 : List down the names of all employees in each department? \n");
		Map<String, List<Emp>> employeeListByDepartment=
		employeeList.stream().collect(Collectors.groupingBy(Emp::getDepartment));
		         
		Set<Entry<String, List<Emp>>> entrySet = employeeListByDepartment.entrySet();
		         
		for (Entry<String, List<Emp>> entry : entrySet) 
		{
		    System.out.println("--------------------------------------");
		             
		    System.out.println("Employees In "+entry.getKey() + " : ");
		             
		    System.out.println("--------------------------------------");
		             
		    List<Emp> list = entry.getValue();
		             
		    for (Emp e : list) 
		    {
		        System.out.println(e.getName());
		    }
		}
		
		System.out.println("********************************************");
		System.out.println("13 : What is the average salary and total salary of the whole organization? \n");
		
		DoubleSummaryStatistics employeeSalaryStatistics=
		employeeList.stream().collect(Collectors.summarizingDouble(Emp::getSalary));
		         
		System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
		         
		System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());
		
		System.out.println("******************************************");
		
		System.out.println("14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years. \n");
		
		Map<Boolean, List<Emp>> partitionEmployeesByAge=
		employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		         
		Set<Entry<Boolean, List<Emp>>> entrySet1 = partitionEmployeesByAge.entrySet();
		         
		for (Entry<Boolean, List<Emp>> entry : entrySet1) 
		{
		    System.out.println("----------------------------");
		             
		    if (entry.getKey()) 
		    {
		        System.out.println("Employees older than 25 years :");
		    }
		    else
		    {
		        System.out.println("Employees younger than or equal to 25 years :");
		    }
		             
		    System.out.println("----------------------------");
		             
		    List<Emp> list = entry.getValue();
		             
		    for (Emp e : list) 
		    {
		        System.out.println(e.getName());
		    }
		}

		System.out.println("******************************************");
		
		System.out.println("15 : Who is the oldest employee in the organization? What is his age and which department he belongs to? \n");
		
		Optional<Emp> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Emp::getAge));
        
		Emp oldestEmployee = oldestEmployeeWrapper.get();
		         
		System.out.println("Name : "+oldestEmployee.getName());
		         
		System.out.println("Age : "+oldestEmployee.getAge());
		         
		System.out.println("Department : "+oldestEmployee.getDepartment());

	}

}
