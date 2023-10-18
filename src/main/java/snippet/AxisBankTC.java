package snippet;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AxisBankTC {

	@Test(invocationCount = 10)
	public  void runAxisBankTC() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.axisbank.com/");
		driver.findElement(By.className("close_button")).click();
		driver.findElement(By.className("landing-page-icon")).click();
		WebElement chatFrame = driver.findElement(By.xpath("//iframe[@title='chatbot']"));
		driver.switchTo().frame(chatFrame);
		driver.findElement(By.className("custom--checkbox")).click();
		driver.findElement(By.className("submit-btn")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("chatBoxLogout")).click();
		driver.switchTo().frame(chatFrame);
		driver.findElement(By.className("cancel-btn")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Stock Information")).click();
		driver.findElement(By.xpath("//div[@class='watchContent clearfix bse']/..")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		String sensex = driver.findElement(By.id("splpt")).getText();
		System.out.println("sensex : " + sensex);
		
		driver.quit();
	}

}
