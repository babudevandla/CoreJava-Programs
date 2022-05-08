package com.java.collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {

     TreeSet<String> tset=new TreeSet<>();
     tset.add("A");
     tset.add("a");
     tset.add("0");
     System.out.println(tset);
     
     ArrayList list=new ArrayList<>();
     list.add(2);
	 list.add("test");
	 list.add(2.0);
	 System.out.println(list);

	}

}
