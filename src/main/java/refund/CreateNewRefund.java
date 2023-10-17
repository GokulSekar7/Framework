package refund;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewRefund {

	public static void main(String[] args) throws InterruptedException {

// Open Browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

// Enter Url
		driver.get("https://login.salesforce.com/");

// Enter Username & Password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf$321");

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

// Click NEW Button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='New']")).click();

// Select AccountName
		WebElement account = driver.findElement(By.xpath("//input[@title='Search Accounts']"));

		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.visibilityOf(account));
		account.click();

		driver.findElement(By.xpath("(//div[@class='slds-m-left--smalllabels slds-truncate slds-media__body'])[1]"))
				.click();

// Select Status as Canceled
		driver.findElement(By.xpath("(//a[@class='select'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Canceled']")).click();

// Give Amount & Select Referenced in Type
		driver.findElement(By.xpath("//input[@class='input uiInputSmartNumber']")).sendKeys("50000");
		driver.findElement(By.xpath("(//a[@class='select'])[2]")).click();
		driver.findElement(By.xpath("//a[@title='Referenced']")).click();

// Select Processing Model as External		
		driver.findElement(By.xpath("(//a[@class='select'])[3]")).click();
		driver.findElement(By.xpath("//a[@title='External']")).click();

// Click on Save
		driver.findElement(By.xpath(
				"//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']"))
				.click();

// Get Refund Number
		String refundNum = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();
		System.out.println("Refund No:- " + refundNum);
	}

}
