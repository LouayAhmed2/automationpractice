package BOM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	public void Choosesubjectheader() {
		new Select(baseClass.getwebDriver().findElement(By.id("id_contact"))).selectByVisibleText("Webmaster");
	}
	public void fillemailAddress() {

		baseClass.getwebDriver().findElement(By.id("email")).sendKeys("Test@gmail.com");
	}
	
	public void fillOrderRef() {

		baseClass.getwebDriver().findElement(By.id("id_order")).sendKeys("21212122");
	}
	
	public void fillMessage() {

		baseClass.getwebDriver().findElement(By.id("message")).sendKeys("send test message");
	}
	
	
	public void Submitmessage() {

		baseClass.getwebDriver().findElement(By.id("submitMessage")).click();
	}
	
	public String getVerfiyMessage() {
		return	baseClass.getwebDriver().findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
		}
	
}
