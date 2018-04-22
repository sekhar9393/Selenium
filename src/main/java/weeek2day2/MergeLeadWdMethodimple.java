package weeek2day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import wdMethods.SeMethods;


public class MergeLeadWdMethodimple extends SeMethods {
	@Test
public void mergeLeads() throws InterruptedException {
startApp("chrome", "http://www.leaftaps.com/opentaps/control/main");
type(locateElement("id", "username"),"DemoSalesManager");
type(locateElement("id", "password"),"crmsfa");
//type(locateElement("class", "decorativeSubmit");
click(locateElement("class", "decorativeSubmit"));
click(locateElement("linkText", "CRM/SFA"));
click(locateElement("linkText", "Leads"));
click(locateElement("linkText", "Merge Leads"));
click(locateElement("xpath","(//img[@alt ='Lookup'])[1]"));
switchToWindow(2);
type(locateElement("xpath", "(//div/input)[1]"), "1");
Thread.sleep(3000);
String text = getText(locateElementByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
clickWithoutSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));

//clickWithoutSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
switchToWindow(0);
click(locateElement("xpath", "(//img[@alt ='Lookup'])[2]"));
switchToWindow(2);
type(locateElement("xpath", "(//div/input)[1]"), "10228");

click(locateElement("xpath", "(//button[@class='x-btn-text'])[1]"));

Thread.sleep(3000);
//String text = getText(locateElementByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
clickWithoutSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
switchToWindow(0);

clickWithoutSnap(locateElement("xpath", "(//td/a)[5]"));
acceptAlert();
click(locateElement("linkText", "Find Leads"));
type(locateElement("xpath", "//div[@class='x-form-item x-tab-item'][1]/div/input"), text);
click(locateElementByXpath("//button[contains(text(),'Find Leads')]"));
String text2 = getText(locateElement("xpath", "//div[@class='x-paging-info']"));
verifyExactText(locateElementByXpath("//div[@class='x-paging-info']"), "No records to display");


	}


}
	