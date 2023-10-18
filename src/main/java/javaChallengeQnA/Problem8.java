package javaChallengeQnA;

//Java Problem (8/20)
//
//Given an integer array nums andPr an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

public class Problem8{
	
	public static void main(String[] args) {
		
		Problem8 find = new Problem8();
		int[] nums = {1,2,3,1};
		int k = 3;
		find.findResult(nums, k);
		
	}
	

		public void findResult(int[] nums,int k)
		{
			int count=0;
			for(int i=0;i<=nums.length-1;i++)
			{
				for(int j=i+1;j<=nums.length-1;j++)
				{
					if((nums[i]==nums[j])&&Math.abs((i-j))<=k)
					{
						count++;
					}
				}
			}
		if(count>0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
			
		}
		}

