package javaChallengeQnA;

//Java Problem (20/20)
//
//Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.
//
//The distance between two indices i and j is abs(i - j), where abs is the absolute value function. 
//
//Example 1:
//
//Input: s = "aaab", c = "b"
//Output: [3,2,1,0]


public class Program20 {
	
	public static void main(String[] args) {
		
		String string="aaab";
		char c ='b';
		
		Program20 find = new Program20();
		find.findDistance(string, c);
		
		
	}
	
	public void findDistance(String string,char c)
	{
		int count =0;
		
			char[] charArray = string.toCharArray();
			
			for(int i=0;i<=charArray.length-1;i++)
			{
				
				if(charArray[i]!=c)
				{
					count++;
					continue;
				}
				
				else
				{
					
					for(int j=count;j>=0;j--)
					{
						System.out.print(j);
					}
					
					count=0;
					continue;
				}
				
				
			}
			
			
		}
		
		 
		
	}
	
	
	


