package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.TestBase;
import pages.HomePage;
import pages.LatestBookPage;
import util.UtilHelpers;

public class HomePageTest extends TestBase {	

	HomePage homePage;
	UtilHelpers utils;
	LatestBookPage latestBookPage;

	public HomePageTest(){
		super();	
	}

	//Before class launch the browser and open the Gutenberg page 
	//@test -- execute test case
	//after class case -- close the browser


	@BeforeClass
	public void setUp() throws InterruptedException {
		initializeDriver();
		homePage= new HomePage();
		utils = new UtilHelpers();
		latestBookPage = new LatestBookPage();
	}

	@Test()
	public void verifyHomePageTitle(){
		String homePageTitle = utils.getPageTitle();
		Assert.assertEquals(homePageTitle, "Free eBooks | Project Gutenberg","Home page title not matched");
	}

	@Test()
	public void verifyDisplayBookCounts() {
		int count = homePage.getBooksCount();
		Assert.assertEquals(count, 10,"Page count not matched");

	}

	@Test()
	public void verifyThePageHeader() {
		String pageHeader = homePage.getHomePageHeader();
		Assert.assertEquals(pageHeader, "Welcome to Project Gutenberg","Home page header not matched");

	}

	@Test()
	public void verifyBookDetails() {
		//ToDo need to add the Assert here to match the book details
		homePage.getBookDetails();
	}

	@Test()
	public void VerifyOnClickingMoreLatestBookLinkNewPageIsGettingOpened() {
		//ToDO's to add assertions 
		homePage.clickOnMoreLatesBookLink();
		latestBookPage.verifyLatesBookPageIsOpened();	

		//From Latest book page come back to the Welcome/home page. 
		//utils.navigateToBackPage();		
	}


	/* 
	 * ToDo's
	 * There are so many TC's on Welcome/Home page we can add
	 */


	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
