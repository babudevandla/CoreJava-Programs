package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> number = new ArrayList<Integer>();

		number.add(11);
		number.add(45);
		number.add(12);
		number.add(32);
		number.add(36);

		number.removeIf(num -> num % 2 == 0);

		System.out.println(number);
		
		System.out.println("---------------------------");
		
		List<Integer> list= new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer num= it.next();
            if(num % 2 ==0){
                it.remove();
            }
        }
        System.out.println("ArryList Odd Number="+list);
	}

}
