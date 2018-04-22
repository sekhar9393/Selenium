package wdMethods;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class TestLeafProjectMethods extends SeMethods{


	@Parameters({"url","uName","password"})
	@BeforeMethod

	public void login(String url,String uName,String password) {
		startApp("chrome", url);
		type(locateElement("id", "username"),uName);
		type(locateElement("id", "password"),password);
		//type(locateElement("class", "decorativeSubmit");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText", "Leads"));

	}
	
	@AfterMethod
	public void close1() {
closeBrowser();		
	}}

	/*	normal implementation(without parameters)
	public void login() {
		startApp("chrome", "http://www.leaftaps.com/opentaps/control/main");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		//type(locateElement("class", "decorativeSubmit");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText", "Leads"));

	}*/


