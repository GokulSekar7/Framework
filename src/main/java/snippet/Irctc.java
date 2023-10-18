package snippet;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new LinkedList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		String title = driver.getTitle();
		System.out.println("Title of the window:  "+title);
		driver.switchTo().window(window.get(0));
		driver.close();

	}

}
