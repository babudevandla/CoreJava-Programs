package com.java.strings;

public class CircularStringCheck {

	public static void main(String[] args) {

		String s = "abcdef";
		String s1 = "cdefab";

		boolean circularStr = checkCircularStr(s, s1);
		System.out.println("circular Str ==>" + circularStr);
	}

	private static boolean checkCircularStr(String s, String s1) {
		if (s.isEmpty() || s1.isEmpty()) {
			return false;
		}
		String total = s + s;
		boolean contain = total.contains(s1);
		return contain;
	}

}
