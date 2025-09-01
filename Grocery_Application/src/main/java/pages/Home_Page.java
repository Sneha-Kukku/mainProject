package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
	public Home_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") private WebElement adminButton;
	@FindBy(xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']") private WebElement logoutButton;
	
	
	
	public void clickAdminButton()
	{
		adminButton.click();
	}
	public void clickLogoutButton()
	{
		logoutButton.click();
	}

}
