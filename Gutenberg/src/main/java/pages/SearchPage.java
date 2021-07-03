package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class SearchPage extends TestBase{

	WebDriverWait wait = new WebDriverWait(driver, 10);

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	public void searchBook(String bookName) {
		driver.findElement(By.id("menu-book-search")).clear();
//		getLogger.info();
		driver.findElement(By.id("menu-book-search")).sendKeys(bookName);
		driver.findElement(By.name("submit_search")).click();		
		//wait till search result get display
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("content")));

	}

	public String getSearchedBookHeader() {
		return driver.findElement(By.cssSelector(".header h1")).getText();
	}
}
