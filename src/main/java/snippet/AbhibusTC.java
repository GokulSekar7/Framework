package snippet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhibusTC {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Load the url
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on the buses tab
		driver.findElement(By.id("bus-link")).click();
		// Enter chennai in the from input field
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("chennai");
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		// Enter bangalore in the to input field.
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='collection-item auto-complete-list-item ']")).click();
		//Click on the Today button.
		driver.findElement(By.linkText("Today")).click();
		// Print the first resulting bus
		String firstResultingBus = driver.findElement(By.xpath("//h5[@class='title']")).getText();
		System.out.println(firstResultingBus);
		// Choose sleeper from the bus type menu
		driver.findElement(By.xpath("//span[text()='Sleeper']/ancestor::a")).click();
		// Print the available seats from the first resulting bus
		String availableSeats = driver.findElement(By.xpath("//div[@class='text-grey']/small")).getText();
		System.out.println(availableSeats);
		// Click on the Show seats button
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		// Click on the any available seat
		WebElement firstAvailableSeat = driver.findElement(By.xpath("//*[@fill='white' and @width='59']/ancestor::button"));
		firstAvailableSeat.click();
		// Click on the first resulting option from the boarding point.
		driver.findElement(By.xpath("//div[@id='place-container']//input")).click();
		// Click on the first resulting option from the dropping point
		driver.findElement(By.xpath("(//div[@id='place-select-container']//input)[2]")).click();
		// Print the Selected seats and ticket fare
		String selectesSeatNo = driver.findElement(By.xpath("//div[@id='seating-selected-seat-details']")).getText();
		System.out.println(selectesSeatNo);
		// Get the title of the page.
		System.out.println(driver.getTitle());
		driver.close();
	}
	
}
