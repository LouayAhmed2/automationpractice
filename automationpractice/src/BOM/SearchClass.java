package BOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchClass {
	
	public void search() {
		baseClass.getwebDriver().findElement(By.id("search_query_top")).sendKeys("dress");
		baseClass.getwebDriver().findElement(By.name("submit_search")).click();
	}

	public List<WebElement> getinstock(){
		List<WebElement> itemList=	baseClass.getwebDriver().findElements(By.xpath("//*[@class='available-now']"));
		return itemList;

		
	}
}
