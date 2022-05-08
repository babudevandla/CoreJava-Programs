package com.custom.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CustomHashMapSort {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();

        map.put(1, new Employee(1,"x"));
        map.put(2, new Employee(2,"a"));
        map.put(3, new Employee(3,"f"));
        System.out.println(map.toString());
	}

}


class ValueComparator implements Comparator<Integer> {

    Map<Integer, Employee> base;
    public ValueComparator(Map<Integer, Employee> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.    
    public int compare(Integer a, Integer b) {
        return ((Employee)base.get(a)).compareTo(base.get(b));
    }

}

class Employee implements Comparable {
    public String name;
    public int id;

    Employee(int id, String name) { 
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object obj) {
        return this.name.compareTo(((Employee)obj).name);
    }

    public String toString() {
        return name;
    }
}