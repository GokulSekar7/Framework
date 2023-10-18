package week1.day1;

public class FibbinocciSeriesUsingForLoop {

	// concept of Fibbinocci series is add the first and second number to get the third number
	//It starts with 0, 1, 1, 2, 3 , 5 , 8, 13, ...
	
	public static void main(String[] args) {
		
		// intialze the first number as 0
		int firstNumber=0 ;
		// intialze the second number as 1
		int secondNumber=1;
		// intialze the third number which is default(0)
		int thirdNumber = 0 ;
		//print first  number
		System.out.print(firstNumber+",");
		// print second number
		System.out.print(secondNumber+",");
		//condition to print the 1st 11 numbers
		for(int i=1; i<=11;i++) {
			// to get the third number = add first number and second number
			thirdNumber = firstNumber + secondNumber;
			// then replace the second number to first number
			firstNumber = secondNumber;
			// replace the third number to second number
			secondNumber = thirdNumber;
			//print the fibbinocci series 
			System.out.print(thirdNumber+",");
		}

	}

}
