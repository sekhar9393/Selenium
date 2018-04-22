package week1day02;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LearningSynchronizationDeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//div[@id ='label']/a").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//div[@class = 'frameSectionBody']/ul/li[3]/a").click();
		driver.findElementByXPath("(//span[@class='x-tab-strip-inner']/span)[2]").click();
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("91");
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("2345");
		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		Thread.sleep(2000);
		String firstSearchFoundId= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(firstSearchFoundId);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class ='frameSectionExtra']/a)[4]")));
		driver.findElementByXPath("(//div[@class ='frameSectionExtra']/a)[4]").click();
		driver.findElementByXPath("//div[@class = 'frameSectionBody']/ul/li[3]/a").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item']/div/input)[1]").sendKeys(firstSearchFoundId);
		driver.findElementByXPath("//button[text()=\"Find Leads\"]").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-paging-info']")));
		
		//		Thread.sleep(2000);
		String error=driver.findElementByXPath("//div[@class='x-paging-info']").getText();
	
		System.out.println(error);
		/*
	
		String expRes="No records to display";
	if (actual==expRes)
			System.out.println("Record was  deleted");
	else
		System.out.println("Record was npt deleted");*/
	}
	}
	
