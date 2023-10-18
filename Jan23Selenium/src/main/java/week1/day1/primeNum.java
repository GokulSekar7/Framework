package week1.day1;

public class primeNum {

	public static void main(String[] args) {
		int num2=0,num3=0,num5=0;
		for(int num =2; num<=100;num++) {
		if((num%2==0)||(num%3==0)||(num%5==0)) {
			
			if((num%2==0)&&(num2==0)) {
				System.err.println("The number "+num+" is a prime number");
				num2++;
			}else if((num%3==0)&&(num3==0)){
				System.err.println("The number "+num+" is a prime number");
				num3++;
			}else if((num%5==0)&&(num5==0)) {
				System.err.println("The number "+num+" is a prime number");
				num5++;
			}else {
				System.out.println("The number "+num+" is not a prime number");
			}
		
		}else {
			System.err.println("The number "+num+" is a prime number");
		}
	  }
	}

}
