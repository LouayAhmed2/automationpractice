package BOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseClass {

	static WebDriver drive;
	
	public void setUp() {
		drive = new ChromeDriver();
		drive.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		drive.manage().window().maximize();

	}
	
	public static WebDriver getwebDriver() {
		return drive;		
	}
	
	
	@AfterTest
	public void tearDown() {
		baseClass.getwebDriver().quit();
	}
}
