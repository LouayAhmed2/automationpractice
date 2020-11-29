package uo;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BOM.ContactUs;
import BOM.HomePage;
import BOM.SearchClass;
import BOM.baseClass;

public class SearchTest {
	@BeforeTest
	public void setUp() {
		
	baseClass BC = new baseClass();
	BC.setUp();

	}
	
	@Test
	public void testsearch() throws InterruptedException {
		SearchClass SC = new SearchClass();
		SC.search();
		
		List<WebElement> itemList = SC.getinstock();
		for(WebElement item :itemList) {
			assertEquals(item.getText(), "In stock");
		}
		
		
	}	
	
	
	@AfterTest
	public void tearDown() {
		baseClass.getwebDriver().close();
	}
}
