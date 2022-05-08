package com.java.strings;

public class AnagramProgram {

	public static void main(String[] args) {

		String str = "good";
		String str1 = "good";

		char[] ch1 = str.toCharArray();
		char[] ch2 = str1.toCharArray();
		boolean status = isAnagram(ch1, ch2);
		System.out.println("Given two stringare Anagram or not  ? ===>" + status);
		int[] arr = { 20, 3, 4, 6, 5, 1, 2, 7 };

		System.out.print("Before: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		bubbleSort(arr);
		System.out.println();
		System.out.print("After:");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

	static boolean isAnagram(char[] ch1, char[] ch2) {

		int len = ch1.length;
		int len1 = ch2.length;
		if (len != len1)
			return false;
		sort(ch1);
		sort(ch2);
		for (int i = 0; i < len; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}

		return true;
	}

	private static void sort(char[] ch) {
		char temp = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] > ch[i]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
}
