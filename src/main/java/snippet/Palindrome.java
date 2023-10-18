package snippet;

public class Palindrome{
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int num=14;
boolean flag=false;
if(num>1)
{
	for(int i=2;i<num;i++)
	{
		if(num%i==0) {
	    flag=true;
		break;
		}
	}

	if(flag==false)
	{
		System.out.println("Given number is prime");
	}
	else
	{
		System.out.println("Not a prime number");
	}
}
else
	System.out.println("Invalid number");
}
}
