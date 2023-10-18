package snippet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the url as https://www.makemytrip.com/
		driver.get("https://www.makemytrip.com/");
		
		// Close the sweet alert --> which is present inside the frame
		WebElement frameNotification = driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame"));
		driver.switchTo().frame(frameNotification);
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		driver.switchTo().defaultContent();
		
		// click on the logo to handle the window block
		WebElement logo = driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']"));
		driver.executeScript("arguments[0].click();", logo);
		
		// Click on the Holiday packages
		driver.findElement(By.xpath("//span[text()='Holiday Packages']")).click();
		
		// Click on the from filed
		driver.findElement(By.id("fromCity")).click();
		
		// Clear the existing value in the from and enter as chennai
		WebElement fromCity = driver.findElement(By.className("citypicker_input"));
		fromCity.clear();
		fromCity.sendKeys("Chennai"+Keys.ENTER);
		Thread.sleep(2000);
		
		// Choose the first resulting one
		driver.findElement(By.xpath("//div[@class='searchedCity']//li")).click();
		
		// Click on the to field
		driver.findElement(By.id("toCity")).click();
		
		// Clear the existing value in the to and enter as Goa
		WebElement toCity = driver.findElement(By.xpath("//input[@class='dest-search-input']"));
		toCity.sendKeys("Goa"+Keys.ENTER);
		Thread.sleep(2000);
		
		//Choose the first Resulting one
		driver.findElement(By.className("dest-city-container")).click();
		
		// Choose the first resulting date in the calender
		driver.findElement(By.xpath("//div[@class='DayPicker-Day']")).click();
		
		// Choose maximum adult in room1
		WebElement increaseCount = driver.findElement(By.xpath("//div[@class='pointer plus-sign-wrapper']/*"));
		increaseCount.click();
		increaseCount.click();
		
		// Click on the apply button
		driver.findElement(By.className("applyBtn")).click();
		
		// Choose duration as 3 to 5 nights
		WebElement leftSlider = driver.findElement(By.xpath("//div[@role='slider']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(leftSlider).moveByOffset(50, 0).release().perform();
		WebElement rightSlider = driver.findElement(By.xpath("(//div[@role='slider'])[2]"));
		actions.clickAndHold(rightSlider).moveByOffset(-200, 0).release().perform();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		
		// Click on the search button
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		//Skip the auto assist help
		driver.findElement(By.className("skipBtn")).click();
		
		//Take a snap of first resulting package
		WebElement firstResultingPackage = driver.findElement(By.xpath("//div[@class='itemCard packageCard  ']"));
		
		File source = firstResultingPackage.getScreenshotAs(OutputType.FILE);
		File desn = new File("./snap/firstResultingPackage.png");
		FileUtils.copyFile(source, desn);
		
		//print the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		// Close the browser
		driver.close();
		
	}

}
