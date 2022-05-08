package com.java.oops;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int n=20;
		int f,f1=0,f2=1;
		int i=0;
		System.out.print(f1+" "+f2);
		while(i<=n) {
			f=f1+f2;
			System.out.print(" "+f);
			f1=f2;
			f2=f;
			i++;
		} 
		
		System.out.println("-----------------------------");
		 f1=0;f2=1;
		System.out.print(f1+" "+f2);
		for(int j=0;j<=n;j++) {
			f=f1+f2;
			System.out.print(" "+f);
			f1=f2;
			f2=f;
		}

	}

}
