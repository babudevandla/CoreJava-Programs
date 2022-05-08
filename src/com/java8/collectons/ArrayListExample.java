package com.java8.collectons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));

		ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
		
		listOne.removeAll(listTwo);
		System.out.println(listOne);
		
		//listTwo.removeAll(listOne);
		//System.out.println(listTwo);
		
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(3,5,7,1,4,9,2));

		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("-----------------");
		
		List<Integer> list1 =Arrays.asList(1,2,4,5,6,7);
		
		int sum = list1.stream().filter( i-> i%2!=0).map(n -> n*n).reduce(0,Integer::sum).intValue();
		System.out.println(sum);
		
	}
}
