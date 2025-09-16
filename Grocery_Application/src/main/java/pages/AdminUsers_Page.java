package pages;

import java.lang.invoke.ConstantBootstraps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;
import utilities.Page_Utility;
import utilities.Wait_Utility;

public class AdminUsers_Page {
	public WebDriver driver;
	public AdminUsers_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement newButton;
	@FindBy(id="username")private WebElement usernamefield;
	@FindBy(id="password") private WebElement passwordField;
	@FindBy(id="user_type") private WebElement userTypeField;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-danger' and @name='Create']") private WebElement saveButton;
	
	@FindBy(xpath="//a[@onclick='click_button(2)']") private WebElement searchButton;
	@FindBy(id="un") private WebElement userNameButton;
	@FindBy(xpath="//select[@id='ut']") private WebElement searchuserTypeField;
	@FindBy(xpath="//button[@value='sr']") private WebElement searchUserbutton;
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']") private WebElement adminUsersTitle;
	@FindBy(xpath="//h3[@class='card-title']") private WebElement adminUsersInformationsTitle;
	
	
	public AdminUsers_Page clickNewButton()
	{
		newButton.click();
		return this;
	}
	public AdminUsers_Page enterUsernameField(String username)
	{
		usernamefield.sendKeys(username);
		return this;
	}
	public AdminUsers_Page enterPasswordfield(String password)
	{
		passwordField.sendKeys(password);
		return this;
	}
	
	public AdminUsers_Page selectAdminfromUserType()
	{
		Page_Utility page=new Page_Utility();
		page.selectDropdownWithValue(userTypeField,Constant.USERTYPEVALUE);
		return this;
		
	}
	public AdminUsers_Page clickSaveButton()
	{
		Wait_Utility wait=new Wait_Utility();
		wait.waitUntilElementToBeClickable(driver, saveButton);
		return this;
		//saveButton.click();
	}
	public AdminUsers_Page clickSearchButton()
	{
		searchButton.click();
		return this;
	}
	
	public AdminUsers_Page enterUsernamefieldDisplayedintheSearchpage(String name)
	{
		userNameButton.sendKeys(name);	
		return this;
	}
	
	public AdminUsers_Page selectAdminfromUserTypeinSearchPage()
	{
		Select select=new Select(searchuserTypeField);
		select.selectByIndex(2);
		return this;
	}
	public AdminUsers_Page clickSearchButtondisplayedintheSearchPage()
	{
		searchUserbutton.click();
		return this;
	}
	public String getTitleText()
	{
		return adminUsersTitle.getText();
	}
	public String getTitleTextofAdminUsersInformation()
	{
		return adminUsersInformationsTitle.getText();
	}
	
	
}
