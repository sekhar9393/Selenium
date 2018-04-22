package hwweek1day1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LearningSynchronizationEditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();;
		driver.findElementByLinkText("Find Leads").click();;
		driver.findElementByXPath("//div[@class='x-form-item x-tab-item'][2]/div/input").sendKeys("s");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		String actualTitle=	driver.getTitle();
		String expecedTitle="View Lead | opentaps CRM";
		assertEquals(expecedTitle, actualTitle);;
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
		driver.findElementByLinkText("Edit").click();
		// driver.findElementByLinkText("Edit").click();
		driver.findElementByXPath("//input[@id = 'updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id = 'updateLeadForm_companyName']").sendKeys("FSSCHN");
        driver.findElementByXPath("//input[@type ='submit']").click();
       //wait.until(ExpectedConditions.refreshed()))
        
        WebElement updated = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		String check=updated.getText();
		String newname="FSSCHN";
		System.out.println(check);
		if(check.contains(newname))
		System.out.println("Having updated name");
        
        driver.close();
	}

}
