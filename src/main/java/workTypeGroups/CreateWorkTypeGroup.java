package workTypeGroups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateWorkTypeGroup {
	
//	Test Steps:
//		1. Login to https://login.salesforce.com
//
//		2. Click on the toggle menu button from the left corner
//
//		3. Click View All and click Work Type Groups from App Launcher
//
//		4. Click on the Dropdown icon in the Work Type Groups tab
//
//		5. Click on New Work Type Group
//
//		6. Enter Work Type Group Name as 'Salesforce Automation by *Your Name*'
//
//		7.Click save and verify Work Type Group Name
	
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
		
		//driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-bare']")).click();
		
		WebElement clickDropDown = driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']"));
		action.click(clickDropDown).build().perform();
		
		WebElement clickNewWorkType = driver.findElement(By.xpath("//span[text()='New Work Type Group']"));
		driver.executeScript("arguments[0].click()", clickNewWorkType);
		
		driver.findElement(By.xpath("//input[@class=' input']")).sendKeys("Salesforce Automation by PS");
		
		//driver.findElement(By.xpath("//a[text()='Default']")).click();
		
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		
		
		
		
	}

}
