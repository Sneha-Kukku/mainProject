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
	@FindBy(xpath = "//button[text()='Sign In']") private WebElement loginButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") private WebElement moreInfoButton;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement manageNewsPage;

	
	
	public Home_Page clickAdminButton()
	{
		adminButton.click();
		return this;
	}
	public Login_Page clickLogoutButton()
	{
		logoutButton.click();
		return new Login_Page(driver);
	}
	public boolean userLoggedOut()
	{
		return loginButton.isDisplayed();
	}
	public AdminUsers_Page clickAdminUsersButton()
	{
		moreInfoButton.click();	
		return new AdminUsers_Page(driver);
	}
	public ManageNews_Page clickManageNewsPage()
	{
		manageNewsPage.click();
		return new ManageNews_Page(driver);
	}

}
