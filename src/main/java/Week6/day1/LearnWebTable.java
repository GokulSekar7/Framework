package Week6.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> tableRowCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td[2]"));
		
		for(int i=1; i<=tableRowCount.size(); i++) {
			String countryName = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(countryName);
		}
		driver.close();
	}

}
