package com.java.strings;

public class ReverseStringWithoutAnyMethods {

	public static void main(String[] args) {

		String str = "Welcome";
		System.out.println(str);
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		String revStr = "";
		for (int j = ch.length - 1; j >= 0; j--) {
			revStr = revStr + ch[j];
		}
		System.out.println(revStr);
		System.out.println("------------------------");
		for (int k = str.length() - 1; k >= 0; k--) {
			System.out.print(str.charAt(k));
		}
		System.out.println();
		System.out.println(reverseString("Kubernates"));

		System.out.println();
		System.out.println(reverseStringRecursive("Dockers"));
		
		
	}



	private static String reverseStringRecursive(String string) {
		if (string.isEmpty())
			return string;

		return reverseStringRecursive(string.substring(1)) + string.charAt(0);
	}

	private static String reverseString(String string) {

		char[] ch = string.toCharArray();
		//char[] ch =toCharArray(string);
		int n = ch.length;
		char[] result = new char[n];
		for (int i = 0; i < ch.length; i++) {
			result[n - 1] = ch[i];
			n = n - 1;
		}
		return new String(result);
	}
	
	
}
