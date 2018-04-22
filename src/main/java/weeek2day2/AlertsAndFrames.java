package weeek2day2;

import org.junit.Test;

import wdMethods.SeMethods;

public class AlertsAndFrames extends SeMethods{

	
	@Test
	public void implementSeMethods() {
		startApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		switchToFrame(locateElement("name", "iframeResult"));
		click(locateElement("xpath", "//button[text()[contains(.,'Try it')]]"));
		getAlertText();
	
	}

}

