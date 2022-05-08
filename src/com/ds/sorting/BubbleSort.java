package com.ds.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		System.out.println("Bubble Sort Algorithm");
		System.out.print("Before Sorted array: ");
		printArray(arr, n);
		
		bubbleSort(arr, n); //SOrting algorithm
		
		System.out.print("After Sorted array: ");
		printArray(arr, n);

	}

	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
	private static void bubbleSort(int[] arr, int n) {

		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
