package snippet;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnGrid {

	@Test
	public void loginLeaftaps() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WIN10);
		dc.setBrowserName("chrome");
//		dc.setVersion();
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL(" http://192.168.29.166:4444"), dc);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframeResult"));
		driver.switchTo().frame("iframeResult");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Try it']"))).click();
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
	}
	
	
	
}
