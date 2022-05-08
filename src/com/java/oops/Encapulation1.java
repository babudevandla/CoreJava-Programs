package com.java.oops;


class Stud {

	private String fname;
	private String lname;
	private int age;

	public Stud(String fname, String lname, int i) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = i;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Encapulation1 {
	public static void main(String[] args) {
		Stud st = new Stud("fname", "lname", 20);
		System.out.println(st.getFname());
	}
}
