package weeek2day2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;
import wdMethods.TestLeafProjectMethods;


public class EditLeadWdMethodsImple1 extends TestLeafProjectMethods {
	@Test
	public void editLead() throws InterruptedException {
			login();
		click(locateElement("linkText", "Find Leads"));
		//type(locateElement("xpath", "//div[@class='x-form-item x-tab-item'][2]/div/input"), "reddy");
		type(locateElement("xpath", "(//input[@name ='firstName'])[3]"), "Marliyn");
		click(locateElement("xpath", "//button[text()=\"Find Leads\"]"));
		Thread.sleep(1000);
		click(locateElement("xpath", "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Lead | opentaps CRM");
		click(locateElement("linkText", "Edit"));

		locateElement("xpath", "//input[@id = 'updateLeadForm_companyName']").clear();

		type(locateElement("xpath", "//input[@id = 'updateLeadForm_companyName']"), "FSS2");
		click(locateElement("xpath", "//input[@type ='submit']"));
		verifyPartialText(locateElement("id", "viewLead_companyName_sp"), "FSS2");
		//closeAllBrowsers();
	}


}
