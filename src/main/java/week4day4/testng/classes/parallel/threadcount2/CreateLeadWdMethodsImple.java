package week4day4.testng.classes.parallel.threadcount2;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
import wdMethods.TestLeafProjectMethods;


public class CreateLeadWdMethodsImple extends TestLeafProjectMethods {
@Test
	public void createLead() {
		login();
click(locateElement("linkText", "Create Lead"));
type(locateElement("id", "createLeadForm_companyName"), "SekharLead");
type(locateElement("id", "createLeadForm_firstName"), "Reddy1");
type(locateElement("id", "createLeadForm_lastName"), "P");
type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), "91");
type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "8939326843");
click(locateElement("class", "smallSubmit"));
String text = getText(locateElement("id", "viewLead_companyName_sp"));
System.out.println(text);
click(locateElement("linkText", "Find Leads"));
type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Reddy1");
click(locateElement("xpath", "(//button[@type ='button'])[7]"));
	}


}
