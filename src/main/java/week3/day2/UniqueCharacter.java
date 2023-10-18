package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueCharacter {
	//PrintUniqueCharacter
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "babu";
		char[] words = input.toCharArray();
		Set<Character> output = new HashSet<Character>();
		for (char word : words) {
			if(!output.add(word)) {
				output.remove(word);
			}
		}
		System.out.println(output);
	}

}
