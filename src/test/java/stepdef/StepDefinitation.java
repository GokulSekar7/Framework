package stepdef;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinitation {
	public ChromeDriver driver;
		
	@Given ("launch the browser and load the url as {string}")
	public void launchBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@Given ("enter the username as")
	public void enterUsername(DataTable dataTable) {
		List<Map<String, String>> credential = dataTable.asMaps(String.class, String.class);
		
		driver.findElement(By.id("username")).sendKeys("");
	}
	
	public boolean verify(List<Map<String, String>> tableData) {
		if(isVisible (clientpageTable, 1)) {
			List<String> expCols = new ArrayList<>();
			for (int i = 0; i < tableData.size(); i++) {
			if(tableData.get(i).get("Section").trim().equalsIgnoreCase("Columns")) {
			List<Object> cols = Arrays.asList(tableData.get(i).get("content").split(","));
			cols.forEach (o -> expCols.add (o.toString().trim()));
			}
			}
			boolean hdrCount = (clientpageTableHdrs.size() == expCols.size ());
			reportStepLog("Client List Page Table Header count should be matched", explols.size (),
			clientpageTablehdrs.size(), hdrCount) ;
			List<String> uiCols = new ArrayList<>();
			clientpageTableHdrs.forEach(e-> uiCols.add(e.getText().trim()));
			boolean isColMatched = expCols.equals (uiCols);
			reportStepLog("Client List Page Table Headers should be matched", expCols.tostring(), uiCols.toString().
			isColMatched);
			return (hdrCount 88 isColMatched);
			
	}
	
	@Given ("enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When ("click the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
