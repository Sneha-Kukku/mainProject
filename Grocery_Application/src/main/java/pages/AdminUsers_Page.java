package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUsers_Page {
	public WebDriver driver;
	public AdminUsers_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="username") private WebElement usernamefield;
	@FindBy(name="password") private WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']") private WebElement siginin;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") private WebElement moreInfoButton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") private WebElement searchButton;
	
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
	public void verifyAdminUsersButton()
	{
		moreInfoButton.click();	
	}
	public void verifyUserisAbletoClickOnSearchiconinAdminUsers()
	{
		searchButton.click();
	}
	
}
