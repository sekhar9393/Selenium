package Week3day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserInteractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/sortable");
		Actions act =new Actions(driver);
		driver.switchTo().frame(0);
		WebElement itm1 = driver.findElementByXPath("//li[text()='Item 1']");
		int y = itm1.getLocation().getY();
		System.out.println(y);
		WebElement itm3 = driver.findElementByXPath("//li[text()='Item 3']");
		act.clickAndHold(itm1).dragAndDropBy(itm3, 0, y).perform();

	}

}
