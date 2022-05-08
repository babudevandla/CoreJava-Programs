package com.java.arrays;

import java.util.Arrays;

public class SmalestPositiveInteger {

	public static void main(String[] args) {
		// int [] arr= {-1,-3};
		int[] arr = { 3, 1, 2 };
		
		int val=solution(arr);
		System.out.println(val);
	}

	public static int solution(int[] A) {
		
		Arrays.sort(A);
		int j, i = 1;
		for (j = 0; j < A.length; j++) {
			if (A[j] == i) {
				i++;
			}
		}
		//System.out.println(i);
		return i;
	}
}
