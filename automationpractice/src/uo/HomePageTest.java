package uo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BOM.HomePage;
import BOM.baseClass;

public class HomePageTest {
	
	@BeforeTest
	public void setUp() {
		
	baseClass BC = new baseClass();
	BC.setUp();

	}
	
	@Test
	public void CheckHomaPageItemCount() {
		HomePage hp = new HomePage();
		assertEquals(hp.getHomepageproductscount(), 14 );
		
	}
	
	@AfterTest
	public void tearDown() {
		baseClass.getwebDriver().close();
	}

}
