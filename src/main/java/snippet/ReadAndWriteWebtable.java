package snippet;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAndWriteWebtable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("url");
		List<WebElement> row1 = driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> col1= driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		String data[][] = new String[row1.size()][col1.size()];
		for (int i =1; i <= row1.size(); i++) {
			for(int j =1; j<= col1.size(); j++) {
				String text = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				data[i-1][j-1] = text;
			}
		}
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		List<WebElement> row2 = driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> col2 = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		for (int i =1; i <= row2.size(); i++) {
			for(int j =1; j<= col2.size(); j++) {
				driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).sendKeys(data[i-1][j-1]);
				
			}
		}
		
	}
	
}
