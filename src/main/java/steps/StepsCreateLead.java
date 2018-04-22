package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class StepsCreateLead {

	public static ChromeDriver driver;
	
	@Given("open Browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	}

	
	@And("load URL")
	public void loadURL() {
		driver.get("http://www.leaftaps.com/opentaps/control/main");
	}

	@And("maximimize the window")
	public void maximizeWindow() {
		driver.manage().window().maximize();

	}
	
	@And("Enter UserName")
	public void EnterUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@And("Enter Password")
	public void EnterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@And("Click LoginButton")
	public void ClickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click CRMSFA")
	public void ClickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click Leads")
	public void ClickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click Create Lead")
	public void CreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter CompanyName (.*)")
	public void EnterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@And("Enter FirstName (.*)")
	public void EnterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter LastName (.*)")
	public void EnterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	public void CreateLeadButton()
	{
		driver.findElementByClassName("").click();
	}
}

