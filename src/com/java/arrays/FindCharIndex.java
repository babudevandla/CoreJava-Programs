package com.java.arrays;

public class FindCharIndex {

	public static void main(String[] args) {
		String s="India is my country";
		String word="y c";
		int index=findIndexOf(s.toCharArray(),'y');
		System.out.println(index);
	}
	
	private static int findIndexOf(char[] sentence,char word){
		
		int i;
		for(i=0;i<sentence.length;i++) {
			if(sentence[i]==word) {
				System.out.println(sentence[i]+"::"+i);
				return i;
			}
		}
		return i;
		



	}


}
