package javaChallenge;

import java.util.Arrays;

public class Anagram {

	public static String runAnagram(String input1, String input2) {
		String output ="";
		if(input1.length()==input2.length()) {
			char[] charArray1 = input1.toLowerCase().toCharArray();
			char[] charArray2 = input2.toLowerCase().toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			for (int i = 0; i < charArray2.length; i++) {
				if(charArray1[i]==charArray2[i]) {
					output ="The given inputs are Anagram";
				}else {
					output = "Not a Anagram";
				}
			}
		}else {
			output = "Not a Anagram";
		}
		return output;
	}
	public static void main(String[] args) {
		System.out.println(runAnagram("Post", "Stop"));
		System.out.println(runAnagram("pot", "spot"));
	}

}