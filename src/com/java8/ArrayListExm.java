package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExm {

	public static void main(String[] args) {

		List<String> list=new ArrayList<String>();
		list.add("Ram is a boy");
		
		List<String> list2=new ArrayList<String>();
		list2.add("Ram is a bad boy");

		list.retainAll(list2);
		
		System.out.println("Common words ::"+list2);
	}

}
