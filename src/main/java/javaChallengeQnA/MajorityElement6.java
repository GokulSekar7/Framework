package javaChallengeQnA;

//Java Problem (6/20)
//
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement6 {
	
	public static void main(String[] args) {
		
		int[] nums = {3,2,3};
		
		int count =0,temp=0,count_=0;
		
		for(int i=0 ;i<nums.length;i++)
		{
			count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
			
			if(count>nums.length/2)
			{
				temp=nums[i];
				count_=count;
			}
			
			
		}
		if(count_>nums.length/2)
		{
		System.out.println("majority element is ====> "+temp);
		}
		else
		{
			System.out.println("No majority element");
		}
		
		
	}

}