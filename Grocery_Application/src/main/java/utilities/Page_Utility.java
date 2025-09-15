package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Page_Utility {
	public void selectDropdownWithValue(WebElement dropdown, String Admin)
	{

		Select object = new Select(dropdown);
		object.selectByValue(Admin);
		}
	public void selectByIndex(WebElement dropdown, int index) 
	{
		Select dropdn = new Select(dropdown);
		dropdn.selectByIndex(index);
	}
	public void selectByText(WebElement dropdown, String admin) 
	{
		Select drop = new Select(dropdown);
		drop.selectByVisibleText(admin);
	}
//	public void darganddrop(WebElement drag, WebElement destination) {
//		WebDriver driver = null ;
//		Actions action = new Actions(driver);
//		action.moveToElement(drag);
//		action.doubleClick(drag).perform();
//		action.dragAndDrop(drag, destination).build().perform();
//}
	
}
