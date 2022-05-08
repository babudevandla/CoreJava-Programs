package com.java8.collectons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
        
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
         
        listOne.retainAll(listTwo);
         
        System.out.println(listOne);
        
        ArrayList<String> alOne = new ArrayList<>(Arrays.asList("item1","item2","item3","item4"));
        ArrayList<String> alTwo = new ArrayList<>(Arrays.asList("item3","item4"));
        alOne.retainAll(alTwo);
        System.out.println(alOne);
        
        String[] namesArray = new String[] {"alex", "brian", "charles", "david"};
        
        List<String> namesList = Collections.unmodifiableList(Arrays.asList(namesArray));
         
        System.out.println(namesList);
        
        System.out.println("-----------------------");
        
        List<String> combinedList = Stream.of(listOne, listTwo)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        
        System.out.println(combinedList);
	}

}
