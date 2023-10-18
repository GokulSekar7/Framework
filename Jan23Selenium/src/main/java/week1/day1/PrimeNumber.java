package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 9;
		boolean flag = true;
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				System.out.println("The number "+num+" is not a prime number");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("The number "+num+" is a prime number");
		}
	}

}
