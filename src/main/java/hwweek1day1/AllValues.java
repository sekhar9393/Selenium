package hwweek1day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		Select dd2 = new Select(driver.findElementByXPath("(//div/select)[1]"));

		List<WebElement> options = dd2.getOptions();

		for (WebElement dd2Values : options) {
			dd2Values.getText();
			System.out.println(dd2Values.getText());
		}
	}


}
