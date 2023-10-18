package javaChallenge;

import java.util.Arrays;

public class CountEachCharInString {
	
	public static void countEachChar(String input) {
		String output = "";
		char[] charArray = input.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		//bhkll
		for (int i = 0; i < charArray.length - 1; i++) {
//			System.out.print(charArray[i]);
			if ((charArray[i] != charArray[i + 1]) && i < charArray.length - 2) {
				output += charArray[i];
			} else if ((i == charArray.length - 2) && (charArray[i] != charArray[i + 1])) {
				output = output + charArray[i] + charArray[i + 1];
			}
			if ((i == charArray.length - 2) && (charArray[i] == charArray[i + 1])){
				output += charArray[i]; // output = output + charArray[i]
			}
		}
		
//		System.out.println("\n" + output);
		//bhkll -->charArray
		//bhkl ---> uniqueChar(output)
		for (int i = 0; i < output.length(); i++) {
			int count=0;
			for(int j=0; j<charArray.length; j++) {
				if(output.charAt(i)==charArray[j]) {
					count++;
				}
				
			}
			System.out.println("The occurrence of "+output.charAt(i)+ " is " + count);
		}
		
		System.out.println("==========================");
	}

	public static void main(String[] args) {

		
		countEachChar("Helloworld");
		countEachChar("Have a nice day");
		
		

		
	}
}
