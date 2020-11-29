package BOM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class LoginPage {

	public void Login(String username,String password) {

		baseClass.getwebDriver().findElement(By.id("email")).sendKeys(username);
		baseClass.getwebDriver().findElement(By.id("passwd")).sendKeys(password);
		baseClass.getwebDriver().findElement(By.name("SubmitLogin")).click();
	}
	
	
	public String getErrorMessage() {
	return baseClass.getwebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
	}
}
