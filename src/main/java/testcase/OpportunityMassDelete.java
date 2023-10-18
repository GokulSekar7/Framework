package testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class OpportunityMassDelete {

	@Test
	public void massDelete() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
//		options.setBrowserVersion("116");
		ChromeDriver driver = new ChromeDriver(options);
//		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement opportunityTab = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		((RemoteWebDriver) driver).executeScript("arguments[0].click();", opportunityTab);
		
		List<WebElement> totalOpportunity = driver.findElements(By.xpath("//span[contains(@class,'slds-icon-utility-down')]"));
		System.out.println("Total count ---> "+totalOpportunity.size());
		for (int i = 0; i <totalOpportunity.size(); i++) {
			driver.findElement(By.xpath("//span[contains(@class,'slds-icon-utility-down')]")).click();
			driver.findElement(By.xpath("//a[@title='Delete']")).click();
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			Thread.sleep(1000);
		}
		driver.close();
	}
	
}
