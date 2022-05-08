package com.java.strings;

public class AnagramExampl {

	public static void main(String[] args) {
		String str = "Java";
		String str1 = "babu";
		char[] ch1 = str.toCharArray();
		char[] ch2 = str1.toCharArray();
		boolean status = isAnagram(ch1, ch2);
		System.out.println("Given Strings or Anagram or not? ======>" + status);
	}

	private static boolean isAnagram(char[] ch1, char[] ch2) {
		int n1 = ch1.length;
		int n2 = ch2.length;
		if (n1 != n2) {
			return false;
		}
		sort(ch1); //Arrays.sort(ch1);
		sort(ch2);  //Arrays.sort(ch2);
		for (int i = 0; i < n1; i++) {
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

}
