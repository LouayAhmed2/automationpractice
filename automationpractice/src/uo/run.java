package uo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BOM.HomePage;
import BOM.LoginPage;
import BOM.baseClass;

public class run {

	WebDriver drive;

	@BeforeTest
	public void setUp() {
		
	baseClass BC = new baseClass();
	BC.setUp();
	drive = BC.getwebDriver();

	}

	@Test(priority = 1)
	public void main() {

		HomePage Hp = new HomePage();
		Hp.SignIn();
		LoginPage LP = new LoginPage();

		LP.Login("test@gmail.com","");

		String missingpasserror = LP.getErrorMessage();
		assertEquals(missingpasserror, "Password is required.");

	}
	@Test(priority = 2 )
	public void wrongpass() {
		HomePage Hp = new HomePage();
		Hp.SignIn();
		
		LoginPage LP = new LoginPage();
		LP.Login("test@gmail.com","sdasdasd");
		String missingpasserror = LP.getErrorMessage();
		assertEquals(missingpasserror, "Authentication failed.");

	}

	@AfterTest
	public void tearDown() {
		drive.close();
	}

}
