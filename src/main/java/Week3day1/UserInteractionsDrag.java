package Week3day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserInteractionsDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		Actions act =new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElementByXPath("//p[text()='Drag me to my target']");

		WebElement drop = driver.findElementByXPath("//p[text()='Drop here']");

		act.dragAndDrop(drag, drop).perform();



	}

}
