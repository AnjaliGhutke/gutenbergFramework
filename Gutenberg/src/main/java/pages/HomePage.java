package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String getHomePageHeader() {
		return driver.findElement(By.id("welcome-to-project-gutenberg")).getText();
	}

	public int getBooksCount() {
		return driver.findElements(By.cssSelector(".box_shadow .lib.latest.no-select a")).size();
	}

	public void getBookDetails() {
		//ToDo this function will get the all book details and will return the details
		//need to change the return type when this method gets implements
	}

	public void clickOnMoreLatesBookLink() {
		//ToDo this function will click on the link 'Click Here for more latest books!'
	}

}
