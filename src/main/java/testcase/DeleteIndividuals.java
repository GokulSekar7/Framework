package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteIndividuals extends BaseClass {

	@Test
	public  void runDelete()throws InterruptedException {
		/*
		 * "Test Steps:
1. Login to https://login.salesforce.com
2. Click on the toggle menu button from the left corner
3. Click View All and click Individuals from App Launcher
4. Click on the Individuals tab 
5. Search the Individuals 'Kumar'
6. Click on the Dropdown icon and Select Delete
7.Click on the Delete option in the displayed popup window.
8. Verify Whether Individual is Deleted using Individual last name"

		 */
		
		
		WebElement scroll = driver.findElement(By.xpath("//p[text()='Party Consent']"));
		driver.executeScript("arguments[0].scrollIntoView();", scroll);
		WebElement individual = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", individual);
		Thread.sleep(3000);
		WebElement clk = driver.findElement(By.xpath("//a[@title='Individuals']//span[1]"));
		driver.executeScript("arguments[0].click();", clk);
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@name='Individual-search-input']"));
		String individualsName ="Hari";
		name.sendKeys(individualsName);
		name.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement pop = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		driver.executeScript("arguments[0].click();", pop);////div[@class='uiPopupTrigger']
		//Thread.sleep(2000);
		WebElement delete = driver.findElement(By.xpath("//a[@role='menuitem']/div[@title='Delete']"));
		driver.executeScript("arguments[0].click();", delete);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String msg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
		 System.out.println(msg);
		WebElement searchIndividuals = driver.findElement(By.xpath("//input[@class='slds-input']"));
		searchIndividuals.clear();
		searchIndividuals.sendKeys(individualsName);
		searchIndividuals.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String verify = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		if(verify.contains("No items to display")) {
			System.out.println("Individuals deleted successfully");
		}
		
	}
	
}
