package com.java.strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String sentence="Hello Babu";
		
		String[] words=sentence.split(" ");
		StringBuilder br=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			br.append(words[i]+" ");
		}
		System.out.println(br.toString().trim());
		
		StringBuilder b=new StringBuilder();
		for(String s:words) {
			b.append(reverseStr(s));
			b.append(" ");
		}
		
		System.out.println(b);
	}

	private static String reverseStr(String s) {
 
		StringBuilder br=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			br.append(s.charAt(i));
			
		}
		return br.toString();
	}

}
