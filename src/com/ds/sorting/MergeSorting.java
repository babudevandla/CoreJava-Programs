package com.ds.sorting;

public class MergeSorting {

	public static void main(String[] args) {
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		System.out.println("Merge Sort Algorithm");
		System.out.print("Before Sorted array: ");
		printArray(arr, n);

		sort(arr,0,n-1); // Sorting algorithm

		System.out.print("After Sorted array: ");
		printArray(arr, n);
	}

	private static void printArray(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	private static void sort(int[] arr, int l, int r) {
		if(l<r) {
			int m=(l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			mergeSort(arr,l,m,r);
		}
	}

	private static void mergeSort(int[] arr, int l, int m, int r) {
		int n1=m-l+1;
		int n2=r-m;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=arr[m+1+j];
		}
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while( i<n1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] =R[j];
			j++;
			k++;
		}
	}

}
