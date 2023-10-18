package week3.day1;

public class ReverseEvenWords {
	
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	

	/* Pseudo Code:
	 
	 * Declare the input as Follow
      		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)
	
	d)split the words and have it in an array
	
	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
	
	 
*/
	
	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] words = test.split(" ");
		for (int i = 0; i < words.length; i++) {
			if(i%2!=0) {
				String even = words[i];
				char[] charArray = even.toCharArray();
				words[i]="";
				for (int j = charArray.length-1; j >=0; j--) {
					words[i] += charArray[j];
				}
			}
			System.out.print(words[i]+" ");
		}
	}

}
