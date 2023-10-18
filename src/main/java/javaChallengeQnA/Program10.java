package javaChallengeQnA;

//Java Problem (10/20)
//
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0


public class Program10 {
	
	
	public static void main(String[] args) {
		
		
		String jewels = "aA";
		
		String stones ="aAAbbbb";
		
		String jewels_="z";
		String stones_="ZZ";
		Program10 find = new Program10();
		find.findStones(jewels,stones);
		find.findStones(jewels_, stones_);
		
	}
		public void findStones(String jewels,String stones)
		{
			char[] jewelsArray = jewels.toCharArray();
			char[] stonesArray = stones.toCharArray();
			int count =0;
			
			for(int i=0;i<=stonesArray.length-1;i++)
			{
				for(int j=0;j<=jewelsArray.length-1;j++)
				{
					if(stonesArray[i]==jewelsArray[j])
					{
						count++;
					}
				}
			}
				
			System.out.println("The number of stones "+count);
		}
		
		
		
		
	}

