package week3day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.TestLeafProjectMethods;

public class MergeAccount extends TestLeafProjectMethods {
	@Test
	public void mergeAccount() throws InterruptedException {
		login();
		click(locateElement("xpath", "//div/following::a[2]"));
		click(locateElement("xpath", "//a[text()='Accounts']"));
		click(locateElement("xpath", "//a[text()='Merge Accounts']"));
		clickWithoutSnap(locateElement("xpath", "(//img[@alt = 'Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "1");
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(2000);
		WebElement id = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String idval = id.getText();
		clickWithoutSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);
		clickWithoutSnap(locateElement("xpath", "(//img[@alt = 'Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath", "//input[@name='id']"), "114");
		click(locateElement("xpath", "(//button[@class='x-btn-text'])[1]"));
		Thread.sleep(2000);

		clickWithoutSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);
		clickWithoutSnap(locateElement("xpath", "//a[@class='buttonDangerous']"));

		acceptAlert();
		click(locateElement("xpath", "//a[text()='Find Accounts']"));
		type(locateElement("xpath", "//input[@name='id']"), idval);
		click(locateElement("xpath", "//button[text()='Find Accounts']"));
		WebElement norcrdmsg = locateElement("xpath", "//div[@class='x-paging-info']");
		String errmsg1 = norcrdmsg.getText();
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), errmsg1);



	}

}