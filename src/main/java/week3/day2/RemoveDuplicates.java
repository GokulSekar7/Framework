package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) { 
		
		String text = "Paypal India";
		char[] charArray = text.toLowerCase().toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (Character character : charArray) {
			if(!charSet.add(character)) {
				dupCharSet.add(character);
			}
		}
		System.out.println("CharSet-->  "+charSet);
		System.out.println("DupCharSet--->  "+dupCharSet);
		charSet.removeAll(dupCharSet);
		System.out.print("unique char : ");
		for (Character ch : charSet) {
			if(ch != ' ') {
				System.out.print(ch);
		}
		}
//		System.out.println("CharSet-->  "+charSet);
//		System.out.println("DupCharSet--->  "+dupCharSet);
	}

}
