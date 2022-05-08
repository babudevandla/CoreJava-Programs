package com.custom.map;

import java.util.HashMap;
import java.util.Map;

public class CustomHashMap {

	public static void main(String[] args) {
		final Map<Student,Integer > map = new HashMap<>();
		map.put(new Student(10, "C"),2500);
	    map.put(new Student(5, "A"),4000);
	    map.put(new Student(4, "B"),2000);
	    map.put(new Student(2, "D"),60000);
	    
	    System.out.println(map.size());
	    System.out.println(map.get(new Student(10, "C"))); // null value it will print
	    
	    System.out.println(map);
	}

}
