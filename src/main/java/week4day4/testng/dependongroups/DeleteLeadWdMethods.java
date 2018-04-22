package week4day4.testng.dependongroups;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import wdMethods.TestLeafProjectMethods;

public class DeleteLeadWdMethods extends TestLeafProjectMethods{
	@Test(groups="sanity", dependsOnGroups="smoke")
	public void deleteLeadWdMethods() throws InterruptedException {
login();
click(locateElement("linkText", "Find Leads"));
//type(locateElement("xpath", "//div[@class='x-form-item x-tab-item'][2]/div/input"), "reddy");
type(locateElement("xpath", "(//input[@name ='firstName'])[3]"), "M");
click(locateElement("xpath", "//button[text()=\"Find Leads\"]"));
Thread.sleep(1000);
click(locateElement("xpath", "(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

click(locateElement("linkText", "Delete"));
click(locateElement("linkText", "Find Leads"));
type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "sam");

}
}
