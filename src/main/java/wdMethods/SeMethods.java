package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
		} catch (NotFoundException e) {
			throw new NotFoundException();
		}catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			throw new RuntimeException();
		}catch (NullPointerException e) {
			System.err.println("Null Pointer Exception due to startApp method issue");
		}
		finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "linkText":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;

			}
		} catch (NoSuchElementException e) {
			System.err.println("Passed Locator was wrong");
			throw new RuntimeException("Inspected Element was nt found")	;
		}
		catch (Exception e) {
			System.err.println("Exception");

		}catch (Throwable e) {
			System.err.println("Throwble Exception");
		}
		finally {
			takeSnap();
		}
		return ele;
	}
	public WebElement locateElementById(String locValue) {
		WebElement ele = driver.findElementById(locValue);

		return ele;
	}

	public WebElement locateElementByXpath(String locValue) {
		WebElement ele = driver.findElementByXPath(locValue);
		return ele;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The given value is entered "+data);
		} catch (WebDriverException e) {
		//	throw new WebDriverException();
		}finally {
			takeSnap();
		}
	}

	public void typewithtab(WebElement ele, String data) {
		try {
			ele.sendKeys(data,Keys.TAB);
			System.out.println("The given value is entered "+data);
		} catch (NotFoundException e) {
			throw new NotFoundException();

		}finally {
			takeSnap();

		}
	}

	public void uncheck(WebElement ele) {
		try {
			if(ele.isSelected())
				ele.click();
		} catch (NotFoundException e) {
			throw new NotFoundException("Inspected element was not found ");
		}finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
			takeSnap();
		} catch (StaleElementReferenceException e) {
			System.err.println("Element not present in DOM");
			throw new RuntimeException();
		}
		catch (Exception e) {
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}
	}

	public void clickWithoutSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (StaleElementReferenceException e) {
			System.err.println("Element not present in DOM");
			throw new RuntimeException();
		}
		catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public String getText(WebElement ele,String data) {
		try {
			data=ele.getText();
			
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		return data;
	}

	public String getText(WebElement ele) {
		String text = null;
		try {
			text = ele.getText();
			System.out.println("Inspected Text was got Successfuly ::"+text);
			takeSnap();
		} catch (NotFoundException e) {
			throw new NotFoundException();
		}
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dd = new Select(ele);
			dd.selectByVisibleText(value);
		} catch (NotFoundException e) {
			throw new NotFoundException();
		}
	}
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select dd = new Select(ele);
			dd.selectByIndex(index);
		} catch (NotFoundException e) {
			throw new NotFoundException();
		}
	}
	public boolean verifyTitle(String expectedTitle) {
		try {
			String title = driver.getTitle();
			if (title.contains(expectedTitle))
				System.out.println("Title was verified and was the correct window");
			else
				System.out.println("wrong window");
			takeSnap();
		} catch (NotFoundException e) {
			throw new RuntimeException();

		}
		return false;

	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if(text.equals(expectedText))
			System.out.println("Exact Title was matched up");
		else
			System.out.println("Exact Title was not matched up");

		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			if (ele.getText().contains(expectedText))
			{
				System.out.println("True");
			}
			else
			{System.out.println("False");}
		}  catch (StaleElementReferenceException e) {
			System.err.println("Element not present in DOM");
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			throw new WebDriverException();
		}finally {
			takeSnap();

		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {

		String check=ele.getAttribute(attribute);
		if(check.equals(value))
			System.out.println("Having exact value");
		else
			System.out.println("Not having exact value");

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String check=ele.getAttribute(attribute);
		if(check.contains(value))
			System.out.println("Having partial value");
		else
			System.out.println("Not having partial value");

	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
				System.out.println("Selected");
			else
				System.out.println("Not Selected");
		} catch (WebDriverException e) {
			throw new WebDriverException();
		}
		finally {
			takeSnap();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
				System.out.println("Displayed");
			else
				System.out.println("Not Displayed");
		} catch (WebDriverException e) {
			throw new WebDriverException();
		}
		finally {
			takeSnap();
		}

	}

	public void 	switchToWindow(int index) {

		try {
			Set<String> allWind1 = driver.getWindowHandles();
			List<String> listwindows1 = new ArrayList<String>();
			listwindows1.addAll(allWind1);
			driver.switchTo().window(listwindows1.get(index));
		} catch (NoSuchWindowException e) {
			throw new NoSuchWindowException("Target window was not Found");
		}catch (ArrayIndexOutOfBoundsException e) {
			throw new ArrayIndexOutOfBoundsException("Window looking for was not found with the index "+index)	;	}
	}


	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			System.out.println("");
		} catch (NoSuchFrameException e) {
			throw new NoSuchFrameException("Target Frame was not Found");
		}finally {
			takeSnap();

		}

	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert was found and was accepted successfully");
		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException("Inspetced Alert was not found");
		}catch (StaleElementReferenceException e) {
			throw new StaleElementReferenceException("Inspetced Alert was not found");

		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert was found and was dismissed successfully");
		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException("Inspetced Alert was not found");
		}catch (StaleElementReferenceException e) {
			throw new StaleElementReferenceException("Inspetced Alert was not found");

		}

	}

	public String getAlertText() {
		String text;
		try {
			text = driver.switchTo().alert().getText();
			System.out.println("Text in the alert was ::"+ text);
		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException("Inspetced Alert was not found");
		}catch (StaleElementReferenceException e) {
			throw new StaleElementReferenceException("Inspetced Alert was not found");

		}
		return text;
	}

	public String sendTextToAlert() {
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
			System.out.println("Text in the alert was ::"+ text);
		} catch (NoAlertPresentException e) {
			throw new NoAlertPresentException("Inspetced Alert was not found");
		}catch (StaleElementReferenceException e) {
			throw new StaleElementReferenceException("Inspetced Alert was not found");

		}
		return text;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("Current window was closed successfully");
		} catch (NoSuchSessionException e) {
			//throw new NoSuchElementException();
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("All the windows are closed successfully");
		} catch (NoSuchSessionException e) {

		}

	}


	public void wait(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (NotFoundException e) {
			throw new NotFoundException("Inspected element was not found within the wait time");
		}
	}

	@Override
	public WebElement locateElement(String locValue) {
		// TODO Auto-generated method stub
		return null;
	}




}
