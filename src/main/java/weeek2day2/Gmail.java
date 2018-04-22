package weeek2day2;

import org.junit.Test;

import wdMethods.SeMethods;

public class Gmail extends SeMethods{

	@Test
	public void gmailLogin() throws InterruptedException {
		
startApp("Chrome", "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	type(locateElement("id", "identifierId1"), "rajasekhar.reddy338@gmail.com");
	click(locateElement("xpath", "(//content/span)[2]"));Thread.sleep(2000);
	//click(locateElement("xpath", "//span[text()='Next']"));
	/*type(locateElement("xpath", "//input[@type='password']"), "sekhar@9393");
	click(locateElement("xpath", "(//content/span)[2]"));
	wait(locateElement("xpath", "\"//*[@id=\\\":j9\\\"]/div/div\""));
	click(locateElement("xpath", "//*[@id=\":j9\"]/div/div"));
	*/
	}
}
