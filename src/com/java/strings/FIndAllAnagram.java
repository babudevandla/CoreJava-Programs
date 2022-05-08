package com.java.strings;

import java.util.Arrays;
import java.util.List;

public class FIndAllAnagram {

	static final int NO_OF_CHARS = 256; 
	public static void main(String[] args) {
		String arr[] = { "geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs" };
		int n = arr.length;
		findAllAnagrams(arr, n);
		
		
	}

	static void findAllAnagrams(String arr[], int n) {
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (areAnagram(arr[i], arr[j]))
					System.out.println(arr[i] + " is anagram of " + arr[j]);
	}

	static boolean areAnagram(String str1, String str2) 
    { 
        // Create two count arrays and initialize 
        // all values as 0 
        int[] count = new int[NO_OF_CHARS]; 
        int i; 
  
        // For each character in input strings,  
        // increment count in the corresponding  
        // count array 
        for (i = 0; i < str1.length() && i < str2.length(); 
                                                   i++) 
        { 
            count[str1.charAt(i)]++; 
            count[str2.charAt(i)]--; 
        } 
  
        // If both strings are of different length. 
        // Removing this condition will make the program  
        // fail for strings like "aaca" and "aca" 
        if (str1.length() != str2.length()) 
          return false; 
  
        // See if there is any non-zero value in  
        // count array 
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count[i] != 0) 
                return false; 
         return true; 
    } 
}
