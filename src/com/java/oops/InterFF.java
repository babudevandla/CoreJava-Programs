package com.java.oops;

import java.util.ArrayList;
import java.util.List;

public interface InterFF {

	public void show() ;
}


class ABC implements InterFF{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		InterFF f=new ABC();
		f.show();
		
		//List<String>  list=new ArrayList<String>();
	}
}

//List ---> ArrayLis<>();