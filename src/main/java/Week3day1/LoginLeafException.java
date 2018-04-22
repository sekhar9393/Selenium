package Week3day1;

import org.junit.Test;

import wdMethods.SeMethods;

public class LoginLeafException extends SeMethods {
	@Test
	public void login() {
		startApp("chrome", "http://www.leaftaps.com/opentaps/control/main");
		//locateElement("id", "username");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linktext", "CRM/SFA"));
		click(locateElement("linktext", "Leads"));
		click(locateElement("linktext", "Create Leads"));
		/*type(locateElement("id", "createLeadForm_companyName"), "AutoTestCompany");
		type(locateElement("id", "createLeadForm_firstName"), "YogaTest");
		type(locateElement("id", "createLeadForm_lastName"), "RajTest");
		click(locateElement("class", "smallSubmit"));
		closeBrowser();*/

	}

}
