package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsers_Page {
	public WebDriver driver;
	public AdminUsers_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") private WebElement moreInfoButton;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newButton;
	@FindBy(id="username")private WebElement usernamefield;
	@FindBy(id="password") private WebElement passwordField;
	@FindBy(id="user_type") private WebElement userTypeField;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger' and @name='Create']") private WebElement saveButton;
	
	@FindBy(xpath="//a[@onclick='click_button(2)']") private WebElement searchButton;
	@FindBy(id="un") private WebElement userNameButton;
	@FindBy(id="ut") private WebElement searchuserTypeField;
	@FindBy(xpath="//button[@value='sr']") private WebElement searchUserbutton;
	
	
	public void clickAdminUsersButton()
	{
		moreInfoButton.click();	
	}
	public void clickNewButton()
	{
		newButton.click();
	}
	public void enterUsernameField()
	{
		usernamefield.sendKeys("anakha");
	}
	public void enterPasswordfield()
	{
		passwordField.sendKeys("anakha@123");
	}
	public void enterUsertypefield()
	{
		userTypeField.click();
	}
	public void selectAdminfromUserType()
	{
		Select select=new Select(userTypeField);
		select.selectByValue("admin");
	}
	public void clickSaveButton()
	{
		saveButton.click();
	}
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void enterUsernamefieldDisplayedintheSearchpage()
	{
		userNameButton.sendKeys("anakha");	
	}
	public void enterUsertypeinSearchPage()
	{
		searchuserTypeField.sendKeys("Admin");
	}
	public void selectAdminfromUserTypeinSearchPage()
	{
		Select select=new Select(userTypeField);
		select.selectByValue("Admin");
	}
	public void clickSearchButtondisplayedintheSearchPage()
	{
		searchUserbutton.click();
	}
	
}
