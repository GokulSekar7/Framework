package week3.day2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	/* Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] number = {2,3,5,7,4,1,8,1,4,5,9,10,2,4};
		Set<Integer> num = new TreeSet<Integer>();
		for (int i = 0; i < number.length; i++) {
			num.add(number[i]);
		}
		List<Integer> output = new LinkedList<Integer>(num);
		for (int i = 0; i < output.size(); i++) {
			if(output.get(i)!= i+1) {
				System.out.println(i+1 + " is the missing number");
				break;
			}
		}
		
	}

}
