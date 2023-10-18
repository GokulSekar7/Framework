package planItTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase1 {

	@Test
	public  void tc_001() throws MalformedURLException {
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WIN10);
		dc.setBrowserName("chrome");
//		dc.setVersion();
		RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://192.168.29.166:4444"), dc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://jupiter.cloud.planittesting.com/#/");
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		WebElement errormsg = driver.findElement(By.xpath("//div[contains(@class,'alert alert')]"));
		System.out.println(errormsg.getText());
		driver.findElement(By.id("forename")).sendKeys("Gokul");
		driver.findElement(By.id("email")).sendKeys("gokul@gmail.com");
		driver.findElement(By.id("message")).sendKeys("feedback done");
		
	}

}
