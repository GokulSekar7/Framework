package snippet;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundBasicAuth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String username = "admin";
		String password = "testleaf";
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/auth.xhtml");
		driver.findElement(By.xpath("//span[text()='Basic Auth']/..")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new LinkedList<String>(windowHandles);
		System.out.println(window.size());
		System.out.println(windowHandles.size());
		driver.switchTo().window(window.get(1));
		Thread.sleep(2000);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String[] split = currentUrl.split("//");
		String authencationUrl = split[0]+username+":"+password+"@"+split[1];
		driver.get(authencationUrl);
		String verificationText = driver.findElement(By.xpath("/html/body")).getText();
		System.out.println(verificationText);
		System.out.println(driver.getTitle());
		driver.switchTo().window(window.get(0));
		
		driver.quit();
	}

}
