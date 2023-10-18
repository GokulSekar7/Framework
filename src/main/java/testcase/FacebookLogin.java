package testcase;

import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class FacebookLogin {

	public static void main(String[] args) {
		Faker faker = new Faker(new Locale("en", "IN"));
		
		//Instantiate the Browser driver
		ChromeDriver driver = new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Load the url
		driver.get("https://www.facebook.com/");
		//Enter the email id
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		driver.findElement(By.id("email")).sendKeys(firstName+lastName+"@testleaf.com");
		//Enter the password
		driver.findElement(By.id("pass")).sendKeys("Leaf$1234");
		//Click on the Login button
		driver.findElement(By.name("login")).click();
		//Click on the Find your account and log in.
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//Verify the title
		String currentTitle = driver.getTitle();
		if(currentTitle.contains("Forgotten Password")) {
			System.out.println("Title is verified successfully");
		}else {
			System.out.println("Title is not verified successfully");
		}
		//Close the window
		driver.close();

	}

}
