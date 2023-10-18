package snippet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement mouseover = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions obj = new Actions(driver);
		obj.moveToElement(mouseover).perform();
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		String text = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(text);
		WebElement shoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		obj.moveToElement(shoes).click(shoes).perform();
		WebElement sort = driver.findElement(By.className("sort-label"));
		obj.moveToElement(sort).click(sort).perform();
		WebElement display = driver.findElement(By.xpath("//li[@class='search-li']"));
		display.click();
		
	     List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	     List<Integer> prices = new ArrayList<Integer>();
	     
	     System.out.println(productPrice.size());
	     
	     for(int i=1; i<productPrice.size();i++) {
	    	 Thread.sleep(2000);
	    	 String price = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]")).getText();
	    	 int parseInt = Integer.parseInt(price.replaceAll("[^0-9]", ""));
				prices.add(parseInt);
	     }
	   /*  
	     for (WebElement data : productPrice) {
	    	 Thread.sleep(2000);
			String text2 = data.getText();
			int parseInt = Integer.parseInt(text2.replaceAll("[^0-9]", ""));
			prices.add(parseInt);
	

			}
			*/
	     
	     boolean flag =false;
			for(int i=0;i<prices.size()-1;i++) {
				if((prices.get(i))<=(prices.get(i+1))) {
					
				flag=true;	
				}else {
					flag = false;
					
					break;
				}
			}
	     if(flag) {
	    	 System.out.println("Prices sorted succesfully");
	     }else {
	    	 System.out.println("Price not sorted");
	    	  }
	     WebElement price = driver.findElement(By.xpath("//div[@class='filter-type-name lfloat']"));
	     obj.moveToElement(price).perform();
	     Thread.sleep(2000);
	     WebElement fromValue = driver.findElement(By.xpath("//input[@name ='fromVal']"));
	     fromValue.clear();
	     fromValue.sendKeys("500");
	     WebElement toValue = driver.findElement(By.xpath("//input[@name = 'toVal']"));
	     toValue.clear();
	     toValue.sendKeys("700");
	     driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn')]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='Color_s-Black']/following-sibling::label[1]")).click();
	     String priceRange = driver.findElement(By.xpath("(//div[@class='navFiltersPill'])[1]")).getText();
	     Thread.sleep(2000);
	     String colour = driver.findElement(By.xpath("(//div[@class='navFiltersPill'])[2]/a")).getText();
	    System.out.println(priceRange);
	    System.out.println(colour);
	     if(priceRange.contains("Rs. 500 - Rs. 700")){
	    	 System.out.println("Filters applied are correct");
	     }else {
	    	 System.out.println("Filters applied are incorrect");
	     }
	    
	   	if(colour.contains("Black")) {
	   		System.out.println("Filters applied are correct");
	   	}else {
	   		System.out.println("Filters applied are incorrect");		
	   	}
	    	WebElement first = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
	    	obj.moveToElement(first).perform();
	    	WebElement view = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));
	    	obj.moveToElement(view).click(view).perform();
	    	String Amount = driver.findElement(By.xpath("//span[text()='549 ']")).getText();
	    	System.out.println("Rs.:" +Amount);
	    	Thread.sleep(2000);
	    	String discount = driver.findElement(By.xpath("//span[text()='21% Off']")).getText();
	    	System.out.println(discount);
	    	 File scr = driver.getScreenshotAs(OutputType.FILE);
             
            
             File des=new File("./snaps/img1.png");
           
             FileUtils.copyFile(scr, des);
            
			driver.close();
	}

}
