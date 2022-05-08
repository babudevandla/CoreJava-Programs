package com.java.oops;

final class Student {
	private final String empName;
	private final int age;
	private final Address address;

	public Student(String name, int age, Address address) {
		super();
		this.empName = name;
		this.age = age;
		this.address = address;
	}

	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}

}

class Address implements Cloneable {
	public String address;
	public String city;

	public Address(String address, String city) {
		super();
		this.address = address;
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return " address - " + address + ", city - " + city;
	}
}

public class MainClass {
	public static void main(String[] args) throws Exception {
		Student emp = new Student("Adithya", 34, new Address("Hi-tech City"," Hyderrabad"));
		Address address = emp.getAddress();
		System.out.println(address);
		address.setAddress("Ecospace Blore");
		address.setCity("Bangalore");
		System.out.println(emp.getAddress());
	}
}