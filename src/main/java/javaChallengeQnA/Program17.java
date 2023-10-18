package javaChallengeQnA;
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
//
//Return the sum of all the unique elements of nums.
//
//Example 1:
//
//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4.
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: 0
//Explanation: There are no unique elements, and the sum is 0.
//Example 3:
//
//Input: nums = [1,2,3,4,5]
//Output: 15
//Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

public class Program17 {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,2};
		int[] nums_= {1,1,1,1,1};
		int[] num_1 = {1,2,3,4,5};
		
		Program17 find = new Program17();
		find.findSumOfUniqueElement(nums);
		find.findSumOfUniqueElement(nums_);
		find.findSumOfUniqueElement(num_1);
		
		
		
	}
	
	public void findSumOfUniqueElement(int[] num)
	{
		int count = 0;
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			count=0;
			for(int j=0;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				sum = sum +num[i];
			}
		}
		System.out.println("==================");
		System.out.println(sum);
		System.out.println("==================");
		
	}
	
	

}
