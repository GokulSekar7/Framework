package snippet;

import org.testng.annotations.Test;

public class LearnRegularExpression {

	@Test
	public void runTC() {
		
		String name = "166Hello135# 663Te$tleaf1234";
		// To get only number from the String 
		String numValue1 = name.replaceAll("[^0-9]", ""); // other than the numbers it will replace all the char with null value.
		String numChar = name.replaceAll("[a-zA-Z]", "");
		System.out.println("numValue1 :" +numValue1);
		System.out.println("numChar : " + numChar);
		
	}
	
	
	
}
