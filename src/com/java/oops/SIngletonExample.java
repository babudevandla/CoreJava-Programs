package com.java.oops;

public class SIngletonExample implements Cloneable {
	private static SIngletonExample singleton = null;

	private SIngletonExample() {
	}

	private static SIngletonExample getInstance() {
		if (singleton != null) {
			return singleton;
		} else
			return singleton = new SIngletonExample();
	}

	private static void print() {
		System.out.println("teting method..");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		SIngletonExample s = SIngletonExample.getInstance();
		SIngletonExample s2 = SIngletonExample.getInstance();
		System.out.println(s2);
		s.print();
		System.out.println(s);

		SIngletonExample s1 = (SIngletonExample) s2.clone();
		System.out.println(s1);

	}

}
