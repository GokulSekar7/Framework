package javaChallengeQnA;

//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//
//A string is represented by an array if the array elements concatenated in order forms the string.
//
//Example 1:
//
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
//Example 2:
//
//Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
//Output: false
//Example 3:
//
//Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
//Output: true

public class Program15 {
	
	
	public static void main(String[] args) {
		
		
		String[] word1= {"ab", "c"};
		String[] word2= {"a", "bc"};
		
		String[] word3= {"a", "cb"};
		String[] word4= {"ab", "c"};
		
		String[] word5= {"abc", "d", "defg"};
		String[] word6= {"abcddefg"};
		
		Program15 find = new Program15();
		find.findConcatenatedString(word1, word2);
		find.findConcatenatedString(word3, word4);
		find.findConcatenatedString(word5, word6);	
	}
		
		public void findConcatenatedString(String[] word1,String[] word2) {
			String string1="";
			String string2 ="";
			
			for(int i=0;i<=word1.length-1;i++)
			{
				string1=string1+word1[i];
			}
			
			for(int i=0;i<=word2.length-1;i++)
			{
				string2=string2+word2[i];
				
			}
			System.out.println("==================");
			if(string1.equals(string2))
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
			
		}
	}
	

