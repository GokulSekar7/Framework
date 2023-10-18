package javaChallengeQnA;
//Java Problem (13/20)

//
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//
//You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//
//Return the maximum number of words that appear in a single sentence.
//
//
//
//Example 1:
//
//Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//Output: 6
//Explanation: 
//- The first sentence, "alice and bob love leetcode", has 5 words in total.
//- The second sentence, "i think so too", has 4 words in total.
//- The third sentence, "this is great thanks very much", has 6 words in total.
//Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
//Example 2:
//
//Input: sentences = ["please wait", "continue to fight", "continue to win"]
//Output: 3
//Explanation: It is possible that multiple sentences contain the same number of words. 
//In this example, the second and third sentences (underlined) have the same number of words.

import java.util.Arrays;

public class Program13 {
	
	public static void main(String[] args) {
		
		Program13 find = new Program13();
		String[] string = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		String[] string_= {"please wait", "continue to fight", "continue to win"};
		find.findMaxmimumWord(string);
		find.findMaxmimumWord(string_);
		
		
		
	}
	
		
		
		public void findMaxmimumWord(String[] string)
		{
			String[] split;
			System.out.println("===============================");
			System.out.println("String Array");
			System.out.println(Arrays.toString(string));
			int[] max = new int[string.length];
			for(int i=0;i<=string.length-1;i++)
			{
				String trim = string[i].trim();
				split = trim.split(" ");
		 
				max[i]=split.length;
							
			}
			int max_value=0;
			for(int i=0;i<=string.length-1;i++)
			{
				for(int j=0;j<=string.length-1;j++)
				{
					if(max[i]>max[j])
					{
						max_value=max[i];
					}
				}
				
			}
			System.out.println("===============================");
			System.out.println("Maximun words in sentence");
			System.out.println(max_value);
		}
		
	}

