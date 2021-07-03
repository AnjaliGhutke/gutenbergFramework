package pages;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LatestBookPage extends TestBase {

	public LatestBookPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyLatesBookPageIsOpened() {
		//ToDo this function will verify the latest book page is opened  
	}
}
