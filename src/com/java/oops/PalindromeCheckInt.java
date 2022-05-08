package com.java.oops;

public class PalindromeCheckInt {

	public static void main(String[] args) {
		
		int num=12356,rev=0,remider;
		int original =num;
		System.out.println("Given Integer: "+original);
		while(num!=0) {
			remider=num%10;
			rev=rev*10+remider;
			num=num/10;
		}
		System.out.println("Reverse Integer: "+rev);
		if(original==rev) {
			System.out.println("Pallindrom");
		}else {
			System.out.println("Not Pallindrom");
		}
	}

}
