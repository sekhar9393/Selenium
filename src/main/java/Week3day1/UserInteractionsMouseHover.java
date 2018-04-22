package Week3day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserInteractionsMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[text()='✕']").click();

		Actions flm=new Actions(driver);

		WebElement elect = driver.findElementByXPath("//span[text()='Electronics']");

		flm.moveToElement(elect).click().perform();

		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//span[text()='Panasonic']")));
		WebElement pana = driver.findElementByXPath("//span[text()='Panasonic']");
		flm.click(pana).perform();
	}

}
