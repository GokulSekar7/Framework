package snippet;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snippet {
	/*ClassRoom for Alerts and Frames:2
	---------------------------------
	https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm 
	Click Try It Button
	Click OK/Cancel in the alert
	Confirm the action is performed correctly by verifying the text !!
	 
	 *Hint*
	Switch to the frame
	Then click Try It with xpath
	Switch to the alert and Enter your name in alert box
	Then perform accept / dismiss
	Get the text using id 
	Verify the text based on the action*/
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		driver.close();
	}
}

