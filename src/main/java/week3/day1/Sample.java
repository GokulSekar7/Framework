package week3.day1;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var=-40,pos;
		if (var<0) {
			pos=~(var-1);
			System.out.println("Converted negative value is" +pos);
		} else {
		System.out.println("it is not a negative number");
		}

	}

}
