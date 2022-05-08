package com.java.strings;

public class RecursiveReverseString {

	public static void main(String[] args) {

		String s="Hello";
		System.out.println("Before :"+s);
		String rev=revrecursiveReverse(s);
		System.out.println("After: "+rev);
	}

	private static String revrecursiveReverse(String s) {
		if(s.isEmpty())
			return s;
		else { }
			return revrecursiveReverse(s.substring(1))+s.charAt(0);
			
	}

}
