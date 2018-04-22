package hwweek1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class Mar14 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/Dropdown.html");
	//driver.findElementByXPath("(//select[@id = 'dropdown1']/option)[4]");
Select lastButOne = new Select(driver.findElementByXPath("//select[@id = 'dropdown1']"));
List<WebElement> options = lastButOne.getOptions();
for (WebElement op : options) {
	System.out.println(op.getText());}
options.size();
lastButOne.selectByIndex(options.size()-2);
}
}
