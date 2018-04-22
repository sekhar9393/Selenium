package Week3day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElementByXPath("//button[text()='✕']").click();
WebDriverWait wait = new WebDriverWait(driver, 20);
WebElement ele = driver.findElementByXPath("//div[text()='Water Bottle & Hand Juicers']");
Actions act = new Actions(driver);


		
	}

}
