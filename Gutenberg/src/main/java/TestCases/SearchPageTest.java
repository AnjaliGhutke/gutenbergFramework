package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.TestBase;
import pages.SearchPage;
import util.UtilHelpers;



public class SearchPageTest extends TestBase {

	SearchPage searchPage;
	UtilHelpers utils;
	public SearchPageTest(){
		super();	
	}
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		initializeDriver();
		searchPage= new SearchPage();
		utils = new UtilHelpers();				
	}

	@Test()
	public void verifyBookIsGettingSearch(){
		searchPage.searchBook("Ethan Frome");	
		String header = searchPage.getSearchedBookHeader();
		Assert.assertEquals(header, "Books: Ethan Frome (sorted by popularity)", "Header of searched book not matched");
		//ToDo After searching the book we need to verify, according to the search query result is getting display
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
