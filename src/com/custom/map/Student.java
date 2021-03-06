package com.custom.map;

import java.util.Comparator;

public class Student {

	private Integer id;
	private String name;

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 0;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
