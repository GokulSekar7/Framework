package week1.day1;

public class FibbinocciSeriesUsingWhile {
	
	
	// print Fibbinocci series upto 56
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
		//condition is to print fibbinocci series upto 56
		while(thirdNumber<56){
			// to get the third number = add first number and second number
			thirdNumber = firstNumber + secondNumber;
			// then replace the second number to first number
			firstNumber = secondNumber;
			// replace the third number to second number
			secondNumber = thirdNumber;
			//condition to break the loop if third number greater
			if(thirdNumber>56) break;
			System.out.print(thirdNumber+",");
		} 
		
	}

}
