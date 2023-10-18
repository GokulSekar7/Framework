package javaChallenge;

public class ReverseEachWord {

	public static String runReverseEachWord(String input) {
		String[] split = input.split(" ");
		String output="";
		for (int i = split.length-1; i>=0 ; i--) {
			char[] charArray = split[i].toCharArray();
			String revChar="";
			for (int j=charArray.length-1; j >=0; j--) {
				revChar = revChar + charArray[j];
			}
			if(i==0) {
			output= output + revChar;	
			}else {
			output= output + revChar+" ";
			}
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		System.out.println(runReverseEachWord("How are you today?"));
		System.out.println(runReverseEachWord("Not bad :)"));
	}

}
