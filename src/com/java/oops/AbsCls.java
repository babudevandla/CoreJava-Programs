package com.java.oops;

public abstract class AbsCls {

	//zero or more abstract methods() and instance methods()
	// not posible to create static and default methods()
	public abstract void show() ;
	
}


class A extends AbsCls{
	
	public static void main(String[] args) {
		AbsCls a=new A();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
