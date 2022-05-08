package com.java.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingInArrays {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4 };
		int[] arr1 = { 2, 3, 4 };

		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());

		list.removeAll(list1);
		System.out.println(list);
	}

}
