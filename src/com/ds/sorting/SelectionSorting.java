package com.ds.sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		System.out.println("Selection Sorting Algorithm");
		System.out.print("Before Sorted array: ");
		printArray(arr, n);

		selectionSort(arr, n); // SOrting algorithm

		System.out.print("After Sorted array: ");
		printArray(arr, n);

	}

	private static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void selectionSort(int[] arr, int n) {
		
		for(int i=0;i<n-1;i++) {
			int mid=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[mid]) {
					mid=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[mid];
			arr[mid]=temp;
		}
	}

}
