package javaChallengeQnA;

import java.util.LinkedHashSet;
import java.util.Set;

//Java Challenge (5/20)
//
//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//
//
//
//Example 1:
//
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//Example 2:
//
//Input: n = 2
//Output: false
public class HappyNumber5 {
	
	public int findHappyNumber(int num)
	{
		int temp=0;
		int temp1=0;
		while(num>0)
		{
			temp=num%10;
			temp1=temp1+(temp*temp);
			num=num/10;
		}
		
	
		
		return temp1;
				
	}
	public int addSet(int num)
	{
		
		Set<Integer> intSet = new LinkedHashSet<Integer>();
		intSet.add(num);
		while(num!=1)
			{	
			       num=findHappyNumber(num);
				
					if(intSet.contains(num))
					{
						num=0;
						break;
					}
					
					intSet.add(num);
			}
		return num;
	}
	
	public void output(int result )
	{
		
		if(result==1)
		 {
			System.out.println("true");
		 }
		else
		{
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		HappyNumber5 happy = new HappyNumber5();
		
		int n = 19;
		int n_ = 2;
		int num_= happy.findHappyNumber(n);
		int num_1= happy.findHappyNumber(n_);
		System.out.println("Output for the input value 19");
		int result = happy.addSet(num_);
		happy.output(result);
		System.out.println("Output for the input value 2");
		result = happy.addSet(num_1);	
		happy.output(result);
		
	}
}