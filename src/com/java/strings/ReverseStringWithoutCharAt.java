package com.java.strings;

public class ReverseStringWithoutCharAt {

	public static void main(String[] args) {
		String test = "implementation";
		char[] value = new char[test.length()];
		for (int x = 0; x < test.length(); x++) {
			System.out.println(charAtImp(x, value));
		}

	}

	public static char charAtImp(int index, char[] value) {
		if ((index < 0) || (index >= value.length)) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return value[index];
	}

}
