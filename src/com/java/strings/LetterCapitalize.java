package com.java.strings;

public class LetterCapitalize {

	public static void main(String[] args) {
		String str="i love you darling";
		StringBuilder sb=new StringBuilder();
		String[] words=str.split(" ");
		for(String w:words) {
			sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
		}
		System.out.println(sb.toString());
		
		System.out.println("Hello".substring(0));
	}

}
