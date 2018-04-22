package parameter.dataprovider;
import org.testng.annotations.DataProvider;
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
public class CreateLeadExcelData extends TestLeafProjectMethods {
	@Test(dataProvider="readExcel")
	public void createLead(String Cname,String Fname,String areaCode,String Pnum) {
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),Cname );
		type(locateElement("id", "createLeadForm_firstName"), Fname);
		type(locateElement("id", "createLeadForm_lastName"), "P");
		type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), areaCode);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), Pnum);
		click(locateElement("class", "smallSubmit"));
		String text = getText(locateElement("id", "viewLead_companyName_sp"));
		System.out.println(text);
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("xpath", "(//input[@name='firstName'])[3]"), "Reddy1");
		click(locateElement("xpath", "(//button[@type ='button'])[7]"));
	}

	@DataProvider(name="readExcel")
	public Object[] dataProvider() {

		Object[][] data= new Object[2][4];

		data[0][0]= "SekharLead1";
		data[0][1]= "Reddy1";
		data[0][2]= "91";
		data[0][3]= "8939326843";

		data[1][0]= "SekharLead1";
		data[1][1]= "Reddy1";
		data[1][2]= "91";
		data[1][3]= "8939326843";
		return data;


	}

}
