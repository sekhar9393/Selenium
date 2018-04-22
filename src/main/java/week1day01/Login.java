package week1day01;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	Select dd= new Select(driver.findElementById("createLeadForm_dataSourceId"));
	dd.selectByVisibleText("Employee");
	List<WebElement> options = dd.getOptions();
	/*
for (WebElement webElement : options) {
	System.out.println();
	*/
	
	Select ff =new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
	List<WebElement> listOfData = ff.getOptions();
	for (WebElement eachOPtion : listOfData) {
		System.out.println(eachOPtion.getText());
	}
listOfData.size();
ff.selectByIndex(listOfData.size()-2);
}	
	}


