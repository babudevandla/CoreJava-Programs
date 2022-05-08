package com.java.strings;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String[] testdata = { "aabscs", "abcd", "aaaa", null, "", "aaabbb", "abababa","bcc" };

		for (String input : testdata) {
			System.out.printf("Input : %s  Output: %s %n", input, removeDuplicates(input));
		}

	}

	private static String removeDuplicates(String word) {
		if(word==null|| word.length() < 2) {
			return word;
		}
		
		char[] ch=word.toCharArray();
		int pos=1;
		for(int i=1;i<word.length();i++) {
			int j;
			for(j=0;j<pos;j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}
			if(j==pos) {
				ch[pos]=ch[i];
				++pos;
			}else {
				ch[pos]=0;
				++pos;
			}
		}
		return toUniqueString(ch);
	}

	private static String toUniqueString(char[] ch) {
		StringBuilder br=new StringBuilder(ch.length);
		for(char c:ch) {
			if(c!=0) {
				br.append(c);
			}
		}
		return br.toString();
	}

}
