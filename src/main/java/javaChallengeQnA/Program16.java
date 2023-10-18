package javaChallengeQnA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Java Problem (16/20)
//
//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
//
//Return the largest lucky integer in the array. If there is no lucky integer return -1. 
//
//Example 1:
//
//Input: arr = [2,2,3,4]
//Output: 2
//Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//Example 2:
//
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//Example 3:
//
//Input: arr = [2,2,2,3,3]
//Output: -1
//Explanation: There are no lucky numbers in the array.

public class Program16 {
	public static void main(String[] args) {
		
		int[] arr= {2,2,3,4};
		int[] arr_= {1,2,2,3,3,3};
		int[] arr_1 = {2,2,2,3,3};
		
		Program16 find = new Program16();
		find.findLuckyNumber(arr);
		find.findLuckyNumber(arr_);
		find.findLuckyNumber(arr_1);
		
		
	}
	
	
	
	
	public void findLuckyNumber(int[] arr)
	{
		int count=0;
		Set<Integer> intSet = new LinkedHashSet<Integer>();
		for(int i=0; i<=arr.length-1;i++)
		{
			count =0;
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==arr[i])
			{
				intSet.add(count);
				
			}
		
		}
		
		List<Integer> intList = new ArrayList<Integer>(intSet);
		Collections.sort(intList);
		
		if((intList.size())>0)
		{
		System.out.println(intList.get(intList.size()-1));
		System.out.println("================================");
		
		}
		else
		{
			System.out.println(-1);
		}
		
	}
	
	

}
