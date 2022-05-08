package com.java.oops;

class Super{
	
	public  Object display()throws Exception  {
		System.out.println("Super display()");
		return null;
	}
}
class Sub extends Super{

	@Override
	public Object display()throws RuntimeException  {
		System.out.println("Sub display()");
		return null;
	}
	
}
public class OverridingCls {

	public static void main(String[] args) {
		

	}

}
