package snippet;

import java.util.Locale;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faker faker = new Faker(new Locale("en", "IN"));
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String phoneNumber = faker.phoneNumber().phoneNumber();
		String fullAddress = faker.address().fullAddress();
		
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("phoneNumber : " + phoneNumber);
		System.out.println("fullAddress : " + fullAddress);
		
	}

}
