package com.java.oops;

import java.io.FileNotFoundException;

class Test {
	public int division(int a, int b) throws Exception {
		int result = a / b;
		return result;
	}

	public  void division(float a, float b) throws FileNotFoundException {
		double result = a / b;
		System.out.println("division of floating point numbers: " + result);
	}
}

public class OverloadingCls {

	public static void main(String[] args) throws Exception {
		Test t = new Test();
		System.out.println(t.division(60, 20));

		t.division(10f,20f);

	}

}
