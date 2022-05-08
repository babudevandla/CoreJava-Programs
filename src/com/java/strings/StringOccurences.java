package com.java.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringOccurences {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		//examp: Goodbye bye bye world world world
//		for(int i=0;i<n;i++) {
//			strList.add(sc.next());
//		}
		List<String> strList=new ArrayList<>();
		strList.add("Goodbye bye bye world world world");
		printOccurences(strList);
	}

	private static void printOccurences(List<String> strList) {
		Collections.sort(strList);
		Map<String,Integer> map=new LinkedHashMap<>();
		
		for(String s:strList) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}
		System.out.println();
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
