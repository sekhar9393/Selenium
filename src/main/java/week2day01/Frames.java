package week2day01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {


	public static void main(String[] args) {
		// TODO Learning Alerts
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame(1);
		//driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()[contains(.,'Try it')]]").click();
		//driver.switchTo().alert().accept();
		String txt=	driver.switchTo().alert().getText();
		System.out.println(txt);
		driver.switchTo().alert().sendKeys("Sekhar");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		String str = driver.findElementById("demo").getText();
		System.out.println(str);
		if(str.contains("Hello Sekhar! How are you today?"))
		{
			System.out.println("True");

		}
		else
		{
			System.out.println("False");
		}


	}

}
