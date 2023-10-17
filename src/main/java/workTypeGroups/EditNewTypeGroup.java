package workTypeGroups;
//Test Steps:
//1. Login to https://login.salesforce.com
//
//2. Click on the toggle menu button from the left corner
//
//3. Click View All and click Work Type Groups from App Launcher
//
//4. Click on the Work Type Group tab 
//
//5. Search the Work Type Group 'Salesforce Automation by *Your Name*'
//
//6. Click on the Dropdown icon and Select Edit
//
//7.Enter Description as 'Automation'.
//
//8.Select Group Type as 'Capacity'
//
//9.Click on Save
//10. Click on 'Salesforce Automation by *Your Name*'and Verify Description as 'Automation'

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditNewTypeGroup {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
//		1. Login to https://login.salesforce.com
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
//		2. Click on the toggle menu button from the left corner
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
//		3. Click View All and click Work Type Groups from App Launcher	
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//p[text()='Work Type Groups']"));
		
		Actions action = new Actions(driver);
		action.scrollToElement(findElement).perform();
		action.click(findElement).build().perform();
		
		WebElement search = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
		//driver.findElement(By.xpath)
		
		
	}

}
