package com.java8;

interface A{
	void say();
}
public class MethodReference {

	public static void main(String[] args) {
		
		A a=MethodReference::saySomething;
	}
	public static void saySomething() {
		System.out.println("Hello world");
	}
}
