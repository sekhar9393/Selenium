package hwweek1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class Mar14ii {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
	/*	
	 * 
	 * Homework 14th Mar starts
	 * boolean x = driver.findElementByXPath("//label[@for='java']/following-sibling::input").isSelected();
		System.out.println(x);
	
	if(x==false) 
		driver.findElementByXPath("//label[@for='java']/following-sibling::input").click();

boolean y=	driver.findElementByXPath("(//label[@for='java']/following-sibling::input)[6]").isSelected();
	
if(y==true) 
	driver.findElementByXPath("(//label[@for='java']/following-sibling::input)[6]").click();
driver.findElementByXPath("//div[text()[contains(.,'Not Selected')]]/input").click();
	driver.findElementByXPath("//div[text()[contains(.,'Option')]]/input[3]").click();
	
	*
	*
	*Home work 14th March Ends
	*/
	
	//Homework 15th March Starts
	boolean s =driver.findElementByXPath("//input[@type='checkbox'][5]/following::div/input").isSelected();
	System.out.println(s);
	
	if(s==true)
		driver.findElementByXPath("//input[@type='checkbox'][5]/following::div/input").click();
	
	}
}