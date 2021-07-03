package util;

import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class UtilHelpers extends TestBase {

	public UtilHelpers() {
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle(){
		return driver.getTitle();
	}

	public void navigateToBackPage() {
		driver.navigate().back();
	}

}
