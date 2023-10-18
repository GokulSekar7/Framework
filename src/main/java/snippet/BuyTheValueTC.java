package snippet;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BuyTheValueTC {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://buythevalue.in/");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='owl-item active']")).click();
		
		driver.switchTo().frame(1);
		Actions a=new Actions(driver);
		a.scrollByAmount(100, 200);
	//	driver.findElement(By.xpath("//div[@class='VizExIcon__IconWrapper-sc-13xmv9w-0 kLdQSk']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("560068");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		
		driver.findElement(By.id("product-add-to-cart")).click();
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//input[@class='harman_btn5 btn']"));
		driver.executeScript("arguments[0].click()", findElement);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		

	}

}
