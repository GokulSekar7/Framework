package javaChallengeQnA;

import java.util.ArrayList;
import java.util.List;

//Java Problem (18/20)
//
//A distinct string is a string that is present only once in an array.
//
//Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
//
//Note that the strings are considered in the order in which they appear in the array.
//
// 
//
//Example 1:
//
//Input: arr = ["d","b","c","b","c","a"], k = 2
//Output: "a"
//Explanation:
//The only distinct strings in arr are "d" and "a".
//"d" appears 1st, so it is the 1st distinct string.
//"a" appears 2nd, so it is the 2nd distinct string.
//Since k == 2, "a" is returned. 
//Example 2:
//
//Input: arr = ["aaa","aa","a"], k = 1
//Output: "aaa"
//Explanation:
//All strings in arr are distinct, so the 1st string "aaa" is returned.
//Example 3:
//
//Input: arr = ["a","b","a"], k = 3
//Output: ""
//Explanation:
//The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".

public class Program18 {
	
	public static void main(String[] args) {
		Program18 find = new Program18();
		
		String[] arr = {"d","b","c","b","c","a"};
		String[] arr_ = {"aaa","aa","a"};
		String[] arr_1 = {"a","b","a"};
		
		int k=2,k_=1,k_1=3;
		
		
		find.findPosition(arr,k);
		find.findPosition(arr_,k_);
		find.findPosition(arr_1,k_1);
		
		
	}
	
	public void findPosition(String[] arr,int k)
	{
		int count =0;
		List<String> stringList = new ArrayList<String>();
		for(int i=0;i<=arr.length-1;i++)
		{
			
			count=0;
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
				}
				
			}
			if(count==1)
			{
				stringList.add(arr[i]);
				
				
			}
				
		}
		System.out.println(stringList);

		if((stringList.size())>=k)
		{
			System.out.println(stringList.get(k-1));
			System.out.println("========================");
		}
		else
		{
			System.out.println("empty string ");
			System.out.println("========================");
		}
		
		
	}
	
	

}
