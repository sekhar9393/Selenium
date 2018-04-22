package week3day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

//import wdMethods.ProjectMethods;
import wdMethods.TestLeafProjectMethods;

public class DeactivateAccount extends TestLeafProjectMethods {
	@Test
	public void deactivateAccount() throws InterruptedException {
		// TODO Auto-generated method stub
		login();
		click(locateElement("xpath", "//div/following::a[2]"));


		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Find Accounts']"));

		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "FSSPG3");
		type(locateElement("xpath", "//input[@name='id']"), "11403");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		String id = getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		WebElement title = locateElement("xpath", "//title");
		String titletext = title.getText();
		verifyTitle(titletext);
		clickWithoutSnap(locateElement("xpath", "//a[text()='Deactivate Account']"));
		Thread.sleep(1000);
		String alertText = getAlertText();
		acceptAlert();
		WebElement condelmsg = locateElement("xpath", "//span[@class='subSectionWarning']");
		String errmsg = condelmsg.getText();
		verifyPartialText(locateElement("xpath", "//span[@class='subSectionWarning']"), errmsg);
		click(locateElement("xpath", "//a[text()='Find Accounts']"));

		type(locateElement("xpath", "(//input[@name='accountName'])[2]"), "FSSPG");
		type(locateElement("xpath", "//input[@name='id']"), "11240");
		click(locateElement("xpath", "//button[text()='Find Accounts']"));

		WebElement norcrdmsg = locateElement("xpath", "//div[@class='x-paging-info']");
		String errmsg1 = norcrdmsg.getText();
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), errmsg1);
		
		

	}

}