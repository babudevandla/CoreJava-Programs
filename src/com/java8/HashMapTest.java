package com.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String,String> map=new HashMap<>();
		map.put("1", null);
		map.put("2", "y");
		map.put("3", "abc");
		map.put("4", null);
		map.put("4", "bcd");
		System.out.println(map.size());
		map.entrySet().stream().forEach(System.out::println);
		
		System.out.println(map.get("1"));
		
		List<String> values=map.entrySet().stream().filter( entry -> entry.getValue()!=null).map(m -> m.getValue().toUpperCase()).collect(Collectors.toList());
		values.forEach(System.out::println);
		
		System.out.println("----------------------");
		
		map.forEach((k,v) ->{
			if(v!=null) {
				System.out.println(v.toUpperCase());
			}
		});
		

		System.out.println("-----------------------------");
		
	for(Map.Entry m:map.entrySet()) {
		if(m.getValue()!=null) {
			String v=(String) m.getValue();
			System.out.println("Key: "+m.getKey()+", Value: "+v.toUpperCase());
		}
	}
	
	Iterator it = map.entrySet().iterator();
	
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	}
	
	 Function<String,String> funUpper=(str) ->{
		if(str!=null) {
			str.toUpperCase();
		}
		return str;
	};

	
}
