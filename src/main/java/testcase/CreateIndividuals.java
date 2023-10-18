package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateIndividuals extends BaseClass{
	
	@Test
	public  void runCreate() {
		
	
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
//		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
//		driver.executeScript("arguments[0].click();", individual);
		driver.executeScript("arguments[1].click();",scroll, individual);
//		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']//a")).click();
		WebElement clk = driver.findElement(By.xpath("//div[text()='New']/.."));
		driver.executeScript("arguments[0].click();", clk);
		String lastName="Hari";
		driver.findElement(By.xpath("//input[contains(@class,'lastName compound')]")).sendKeys(lastName);
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		String message = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
		//verify Individuals Name
		if(message.contains(lastName)) {
			System.out.println("Individuals Created successfully");
		}else {
			System.out.println("Unable to Create Individuals");
		}
	
	}
	
}
