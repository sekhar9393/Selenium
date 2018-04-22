package hwweek1day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("TempTestLeafUser");
		driver.findElementByLinkText("Check Availability").click();
		driver.findElementById("userRegistrationForm:password").sendKeys("Sekhar@9393");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Sekhar@9393");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What was the name of your first school?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Maharshi Vidya Mandir");
		
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Raja Sekhar");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Reddy");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Pathapati");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		Select dd = new Select(driver.findElementById("userRegistrationForm:dobDay"));
		dd.selectByValue("21");
		
		Select mm = new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		mm.selectByValue("08");
		
		Select yy = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		yy.selectByValue("1994");
		

		Select occupation = new Select(driver.findElementById("userRegistrationForm:occupation"));
		occupation.selectByValue("2");
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("638760239918");
		
		driver.findElementById("userRegistrationForm:idno").sendKeys("BZAPP6019G");
		
		
		Select country = new Select(driver.findElementById("userRegistrationForm:countries"));
		//country.selectByValue("94");

		driver.findElementByXPath("//select[@id ='userRegistrationForm:countries']/option[starts-with(text(),'E')][2]").click();
		
		/*
		driver.findElementById("userRegistrationForm:email").sendKeys("rajasekhar.reddy338@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8939326843");
		
		
		Select nataionality = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		nataionality.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("B-34,302");
		
		driver.findElementById("userRegistrationForm:street").sendKeys("Ambedkar Road");
		
		driver.findElementById("userRegistrationForm:area").sendKeys("Pudupakkam");
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("603103",Keys.TAB);
	
		
		Thread.sleep(2000);
		Select city = new Select(driver.findElementById("userRegistrationForm:cityName"));
		city.selectByValue("Kanchipuram");
		
		Thread.sleep(2000);
		Select postofficeName = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		postofficeName.selectByValue("Kelambakkam S.O");
		
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("0442032568");
		
		
		
		
		
		
		
*/		//driver.close();
	}

}
