package com.java.arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7 };
		int[] arr1 = { 1, 2, 3, 4, 6, 7, 8 };

		int missing=findMissingElement(arr);
		int missing1=findMissingEle(arr1);
		System.out.println("Missing Element : "+missing);
		System.out.println("Missing Element : "+missing1);

	}

	private static int findMissingEle(int[] arr) {
		int n=arr.length;
		int total=(n+1)* (n+2)/2;
		for(int i=0;i<n;i++) {
			total=total-arr[i];
		}
		return total;
	}

	private static int findMissingElement(int[] arr) {
		int n = arr.length;
		int sumOfAll = (n * (n + 1)) / 2;
		int sumOfArray = 0;
		for (int i = 0; i <= n - 2; i++) {
			sumOfArray = sumOfArray + arr[i];
		}

		int missingEle = sumOfAll - sumOfArray;
		return missingEle;
	}

}
