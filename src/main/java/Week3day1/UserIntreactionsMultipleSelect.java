package Week3day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserIntreactionsMultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement drop = driver.findElementByXPath("//p[text()='Drop here']");
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		
	}

}
