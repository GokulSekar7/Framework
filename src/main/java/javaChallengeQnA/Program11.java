package javaChallengeQnA;

//Given a string s consisting of lowercase English letters, return the first letter to appear twice.
//
//Note:
//
//A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
//s will contain at least one letter that appears twice.
//
//Example 1:
//
//Input: s = "abccbaacz"
//Output: "c"
//Explanation:
//The letter 'a' appears on the indexes 0, 5 and 6.
//The letter 'b' appears on the indexes 1 and 4.
//The letter 'c' appears on the indexes 2, 3 and 7.
//The letter 'z' appears on the index 8.
//The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
//Example 2:
//
//Input: s = "abcdd"
//Output: "d"
//Explanation:
//The only letter that appears twice is 'd' so we return 'd'.
public class Program11 {
	public static void main(String[] args) {
		
		Program11 program = new Program11();
		program.findLetters("abccbaacz");
		program.findLetters("abcdd");
		
	}
		public void findLetters(String string)
		{
			int count=0;
			char[] charArray = string.toCharArray();
			System.out.println("=============================");
			for(int i=1;i<=charArray.length-1;i++)
			{
				count=0;
				for(int j=0;j<=charArray.length-1;j++ )
				{
					
					if(charArray[i]==charArray[j]&&charArray[j]==charArray[i-1])
					{
						count++;
						
						
					}
				}
				if(count>1)
				{
					System.out.println("First letter to appear twice is===> "+charArray[i]);
					break;
				}
			}
		
		
		
		
		
		
		
		
	}

}