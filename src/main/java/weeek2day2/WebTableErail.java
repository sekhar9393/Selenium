package weeek2day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableErail {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SEC",Keys.TAB);
		boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
		if (selected==true)
			driver.findElementById("chkSelectDateOnly").click();
		else
			System.out.println("Already unchecked");
		//WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");	
	      WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
	 List<WebElement> rows = table.findElements(By.tagName("tr"));
		
	//Row count
			System.out.println(rows.size());		
			List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
			//Column Count
			System.out.println(columns.size());
			
	System.out.println(columns.get(1).getText());
		

}}
