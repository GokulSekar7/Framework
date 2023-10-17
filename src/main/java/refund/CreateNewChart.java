package refund;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewChart {

	public static void main(String[] args) throws InterruptedException {

// Open Browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// Enter the Url
		driver.get("https://login.salesforce.com/");

		
// Enter the Username & Password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("earth@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bootcamp@123");

// Click LoginButton
		driver.findElement(By.id("Login")).click();

// Click MenuButton
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

// Click ViewAll
		driver.findElement(By.xpath("//button[text()='View All']")).click();

// Click ServiceControl
		driver.findElement(By.xpath("//p[text()='Service Console']")).click();

// Click Dropdown and Select Refunds
		driver.findElement(By.xpath(
				"//button[@class='slds-button slds-button_icon slds-p-horizontal__xxx-small slds-button_icon-small slds-button_icon-container']"))
				.click();
		driver.findElement(By.xpath("//span[text()='Refunds']")).click();

//Click DropDown near Recently Viewed & Change to 'All'	
		driver.findElement(By.xpath("(//div[@class='slds-dropdown-trigger slds-dropdown-trigger_click']/button)[1]"))
				.click();
		driver.findElement(By.xpath("//span[text()='All']")).click();

// Click ChartButton under NewButton
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//button[@class='slds-button slds-button_icon slds-button_icon-border-filled slds-button_first']"))
				.click();

// Click NewChart under Setting icon
		driver.findElement(By.xpath(
				"//lightning-icon[@class='slds-button__icon slds-icon-utility-settings slds-icon_container forceIcon']"))
				.click();

		driver.findElement(By.xpath("//a[text()='New Chart']")).click();

// Type ChartName
		driver.findElement(By.xpath("//input[@class='chartNameInputBox input']")).sendKeys("Students Mark");
// Select Average in Aggregate Type		
		driver.findElement(By.xpath("(//a[@class='select'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Average']")).click();
// Select Amount in Aggregate field		
		driver.findElement(By.xpath("(//a[@class='select'])[4]")).click();
		driver.findElement(By.xpath("//a[@title='Amount']")).click();
// Click SaveButton		
		driver.findElement(By.xpath("//button[@title='Save']")).click();
// Click SettingsIcon
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//lightning-icon[@class='slds-button__icon slds-icon-utility-settings slds-icon_container forceIcon']"))
				.click();
// Change ChartType to Vertical Bar Chart
		driver.findElement(By.xpath("//a[text()='Vertical Bar Chart']")).click();

	}

}