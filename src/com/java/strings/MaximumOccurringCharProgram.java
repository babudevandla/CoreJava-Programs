package com.java.strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccurringCharProgram {

	static final int ASCII_SIZE = 256;
	static final int N = 256;
	
	public static void main(String[] args) {
		printMaxOccurringChar("Welcome to Java");

		System.out.println("========================");

		printMaxOccurringChar("Java J2ee Android Hibernate JSP");

		System.out.println("========================");

		printMaxOccurringChar("abbcccddddeeeeeffffff");

		System.out.println("=========================");

		printMaxOccurringChar("122333444455555666666");

		String str = "Welcome to Java Have a nice day";
		System.out.println("Max occurring character is ::" + MaxOccuringChar(str));
		System.out.println("Max occurring character is ::" + getMaxOccuringChar(str));
	}

	static char MaxOccuringChar(String str1) {
		int ctr[] = new int[N];
		int l = str1.length();
		for (int i = 0; i < l; i++)
			ctr[str1.charAt(i)]++;
		int max = -1;
		char result = ' ';

		for (int i = 0; i < l; i++) {
			if (max < ctr[str1.charAt(i)]) {
				max = ctr[str1.charAt(i)];
				result = str1.charAt(i);
			}
		}

		return result;
	}

	

	static char getMaxOccuringChar(String str) {
		// Create array to keep the count of individual
		// characters and initialize the array as 0
		int count[] = new int[ASCII_SIZE];

		// Construct character count array from the input
		// string.
		int len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.println(str.charAt(i));
			count[str.charAt(i)]++;
		}
		
		int max = -1; // Initialize max count
		char result = ' '; // Initialize result

		// Traversing through the string and maintaining
		// the count of each character
		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		return result;
	}

	private static void printMaxOccurringChar(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();

		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();

		int maxCount = 0;

		char maxChar = 0;

		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();

				maxChar = entry.getKey();
			}
		}

		System.out.println("Input String : " + inputString);

		System.out.println("Maximum Occurring char and its count :");

		System.out.println(maxChar + " : " + maxCount);
	}
}
