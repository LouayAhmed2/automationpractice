package uo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BOM.ContactUs;
import BOM.HomePage;
import BOM.baseClass;

public class ContactusTest extends baseClass {
	
	
	
	@Test
	public void testcontacttest() throws InterruptedException {
		HomePage hp = new HomePage();
		hp.clickonContactus();
		
		ContactUs CU = new ContactUs();
		
		CU.Choosesubjectheader();
		CU.fillemailAddress();
		CU.fillOrderRef();
		CU.fillMessage();
		CU.Submitmessage();
		String verfiymessage = CU.getVerfiyMessage();

		assertEquals(verfiymessage, "Your message has been successfully sent to our team.");

		
	}	
	


}
