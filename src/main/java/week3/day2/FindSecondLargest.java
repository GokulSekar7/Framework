package week3.day2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	// Here is the input
//			int[] data = {3,2,11,4,6,7,2,3,3,6,7};
			//       output= 7;

			/*
			 * Pseudo Code: 
			 * a) Create a empty Set Using TreeSet
			 * b) Declare for loop iterator from 0 to data.length and add into Set 
			 * c) converted Set into List
			 * d) Print the second last element from List
			 * 
			 * 
			 */
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> number = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			number.add(data[i]);
		}
		List<Integer> output = new LinkedList<Integer>(number);
		System.out.println("Second Largest number "+output.get(1));
	}

}
