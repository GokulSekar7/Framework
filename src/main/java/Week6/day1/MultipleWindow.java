package Week6.day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindow {
	
	public MultipleWindow() {
		this("Gokul");
		System.out.println("No arguments");
	}
	
	public MultipleWindow(String a) {
		this(0,a);
		System.out.println(a);
		
		System.out.println("single arguments");
	}
	
	public MultipleWindow(int a, String b) {
		System.out.println("two arguments");
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		
		MultipleWindow win = new MultipleWindow();
		
		
		// TODO Auto-generated method stub
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags" + Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")).click();
		//div[@class='sponsored-products-truncator-truncated']
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> window1 = new LinkedList<String>(windowHandles1); 
		driver.switchTo().window(window1.get(1));
		driver.findElement(By.xpath("//div[@class='sponsored-products-truncator-truncated']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> window2 = new LinkedList<String>(windowHandles2); 
		driver.switchTo().window(window2.get(2));
		Thread.sleep(5000);
		driver.close();
		*/
	}
}
		