package weeek2day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DeleteLead extends SeMethods{

	@Test(dependsOnMethods= {"wdMethods.CreateLead.launch"})
	public void launch() throws InterruptedException
	{
		startApp("chrome", "http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		//		Click Login
		click(locateElement("className", "decorativeSubmit"));
		//		Click crm/sfa link
		click(locateElement("linkText", "CRM/SFA"));
		//		Click Leads link
		click(locateElement("linkText", "Leads"));
		//		Click Find leads
		click(locateElement("linkText", "Find Leads"));
		//Thread.sleep(4000);
		//		Click on Phone
		click(locateElement("xpath","//span[text()='Phone']"));
		//		Enter phone number
		type(locateElement("name", "phoneNumber"),"1");
		//		Click find leads button
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		//		Capture lead ID of First Resulting lead
		WebElement id = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		//		getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String leadId = id.getText();
		//		Click First Resulting lead
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		//		Click Delete
		click(locateElement("xpath", "//a[text()='Delete']"));
		//		Click Find leads
		click(locateElement("xpath", "//a[text()='Find Leads']"));
		//		Enter captured lead ID
		type(locateElement("className", "x-form-text x-form-field"),leadId);
		//		Click find leads button
		click(locateElement("className", "x-btn-text"));
		//		Verify error msg
		String err = "No records to display";
		String errDisp = locateElement("class", "x-paging-info").getText();
		if(err.equals(errDisp))
			System.out.println("ID not found");
		//		Close the browser (Do not log out)
		closeBrowser();
	}
}

