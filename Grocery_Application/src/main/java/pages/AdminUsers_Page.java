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
	@FindBy(xpath="//select[@id='ut']") private WebElement searchuserTypeField;
	@FindBy(xpath="//button[@value='sr']") private WebElement searchUserbutton;
	
	
	public void clickAdminUsersButton()
	{
		moreInfoButton.click();	
	}
	public void clickNewButton()
	{
		newButton.click();
	}
	public void enterUsernameField(String username)
	{
		usernamefield.sendKeys(username);
	}
	public void enterPasswordfield(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void selectAdminfromUserType()
	{
		Select select=new Select(userTypeField);
		select.selectByIndex(2);
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
	
	public void selectAdminfromUserTypeinSearchPage()
	{
		Select select=new Select(searchuserTypeField);
		select.selectByIndex(2);
	}
	public void clickSearchButtondisplayedintheSearchPage()
	{
		searchUserbutton.click();
	}
	
}
