package com.java8.stream;

import java.util.HashMap;
import java.util.Map;

public class StreamsFilter {

	public static void main(String[] args) {

       Map<Integer, String> map=new HashMap<Integer,String>();
       
       for(int i=1;i<=20;i++) {
    	   map.put(i,"test_"+i);
       }
       
       for(int i=20;i<=100;i++) {
    	   map.put(i,"abc_"+i);
       }
       
       map.forEach((k,v)-> {
    	   System.out.println("Key:"+k+", Value:"+v);
       });
       System.out.println("-----------------");
       map.entrySet().stream().filter( str -> str.getValue().startsWith("test_")).forEach(System.out::println);
       

	}

}
