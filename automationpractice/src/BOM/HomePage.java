package BOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage {
	
	public void SignIn() {

		baseClass.getwebDriver().findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

	}
	
	public void clickonContactus() {
		baseClass.getwebDriver().findElement(By.id("contact-link")).click();
	}
	
	public int getHomepageproductscount() {
	List<WebElement> itemList=	baseClass.getwebDriver().findElements(By.xpath("//*[@class='product-container']"));
	
	return 	itemList.size();

	}

}
