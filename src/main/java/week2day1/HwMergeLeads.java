package week2day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HwMergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("	").click();
		driver.findElementByXPath("//div[@id ='label']/a").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt ='Lookup'])[1]").click();
		Set<String> allWind = driver.getWindowHandles();
		List<String> listwindows=new ArrayList<String>();
		listwindows.addAll(allWind);
		System.out.println(driver.getTitle());
		driver.switchTo().window(listwindows.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//div/input)[1]").sendKeys("1");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();


		WebDriverWait wait = new WebDriverWait(driver, 10);
		/*wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
         WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a")));
		 */

		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();

		//Thread.sleep(2000);
		String text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(text);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//System.out.println(driver.getTitle());
		driver.switchTo().window(listwindows.get(0));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//img[@alt ='Lookup'])[2]").click();
			Set<String> allWind1 = driver.getWindowHandles();
			List<String> listwindows1 = new ArrayList<String>();
			listwindows1.addAll(allWind1);
			driver.switchTo().window(listwindows1.get(1));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("(//div/input)[1]").sendKeys("103");
		driver.findElementByXPath("(//button[@class='x-btn-text'])[1]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.switchTo().window(listwindows.get(0));
		driver.findElementByXPath("(//td/a)[5]").click();	
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//div[@class='x-form-item x-tab-item'][1]/div/input").sendKeys(text);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
Thread.sleep(1000);
String text2 = driver.findElementByXPath("//div[@class='x-paging-info']").getText();

if(text2.contains("No records to display"))
	System.out.println("true");
else
	System.out.println("False");
	//driver.getScreenshotAs(OutputType.FILE);
	

//driver.close();

	}

}
