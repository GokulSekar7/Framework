package snippet;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NykaaTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement moveover = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		Actions obj = new Actions(driver);
		obj.moveToElement(moveover).perform();
		driver.findElement(By.xpath("//span[text()='Help']/following::input")).sendKeys("L'Oréal Paris");
		Thread.sleep(3000);
		driver.findElement(By.linkText("L'Oréal Paris")).click();
		if (driver.getTitle().contains("L'Oreal Paris")) {
            System.out.println("Title contains 'L'Oreal Paris'");
            WebElement mouseOver = driver.findElement(By.xpath("//span[@class = 'sort-name']"));
		
		obj.moveToElement(mouseOver).click(mouseOver).perform();
		WebElement radiobutton = driver.findElement(By.xpath("//div[@id='filter-sort']/div[1]/div[1]/ul[1]/div[4]/label[1]/div[2]"));
		obj.moveToElement(radiobutton).click(radiobutton).perform();
		driver.findElement(By.xpath("//a[@id ='category']")).click();
	
		WebElement product = driver.findElement(By.xpath("//div[@id='my-menu']/ul[1]/li[3]/a[1]"));
		obj.moveToElement(product).perform();
		WebElement product1 = driver.findElement(By.xpath("//div[@id='my-menu']/ul[1]/li[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
		obj.moveToElement(product1).perform();
		WebElement findElement = driver.findElement(By.xpath("//div[@id='my-menu']/ul[1]/li[3]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		obj.moveToElement(findElement).click().perform();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		
		WebElement concern = driver.findElement(By.xpath("(//div[@class='filter-open css-1gdff5r']//span)[3]"));
		obj.moveToElement(concern).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for ='checkbox_Color Protection_10764']//div[2]")).click();
		
		}
		
	}
	
	

}
