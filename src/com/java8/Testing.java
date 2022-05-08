package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Testing {

	public static void main(String[] args) {
		 List<String> listOfItems =new ArrayList<String>();
		 listOfItems.add("Item1");
		 listOfItems.add("Item2");
		 listOfItems.add("Item3");
		 listOfItems.add("Item4");

		 List<String> listOfItems2 =new ArrayList<String>();
		 listOfItems2.add("Item2");
		 listOfItems2.add("Item3");
		 
		 
		List<String> commonVal= listOfItems.stream().filter( s -> !listOfItems2.contains(s)).collect(Collectors.toList());
		 
		 commonVal.forEach(System.out::println);
		 
		 
		 listOfItems.removeAll(listOfItems2);
		 System.out.println(listOfItems);

	}

}
