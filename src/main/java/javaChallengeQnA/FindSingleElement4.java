package javaChallengeQnA;
//Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1

public class FindSingleElement4{
	public void findSingleElement(int[] intArray)
	{
		

			for(int i=0;i<intArray.length;i++)
			{
				int count=0;
				for(int j=0;j<intArray.length;j++)
				{
					if(intArray[i]==intArray[j])
					{
						
						count++;
					}
				}
				if(count==1)
				{
					System.out.println("Single one Element in the Array is ==> "+intArray[i]);
				}
			}
			
			
		}
	

	
	
	public static void main(String[] args) 
	{
		
		FindSingleElement4 element = new FindSingleElement4();
		int[] nums= {2,2,1};
		
		int[] nums_= {4,1,2,1,2};
		
		int[] nums1= {1};
		
			
		element.findSingleElement(nums);
		element.findSingleElement(nums_);
		element.findSingleElement(nums1);
	}

}