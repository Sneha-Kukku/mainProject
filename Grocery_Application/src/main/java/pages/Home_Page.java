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
	@FindBy(name="username") private WebElement usernamefield;
	@FindBy(name="password") private WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']") private WebElement siginin;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") private WebElement adminButton;
	@FindBy(xpath="//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']") private WebElement logoutButton;
	
	
	public void verifyValidUsername()
	{
		usernamefield.sendKeys("admin");
	}
	public void verifyValidPassword()
	{
		passwordfield.sendKeys("admin");
	}
	public void clickSignin()
	{
		siginin.click();
	}
	public void verifyAdminButton()
	{
		adminButton.click();
	}
	public void verifyLogoutButton()
	{
		logoutButton.click();
	}

}
