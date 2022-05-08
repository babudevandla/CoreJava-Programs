package com.java8.stream;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Babu Devandla";
		String reversed = str.chars().mapToObj(c -> (char) c)
				.reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
		System.out.println(reversed);

		String[] words = str.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
		
		//(int a,int b) -> a+b;
	}
	
	
	

}
