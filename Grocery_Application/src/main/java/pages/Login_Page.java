package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}
	@FindBy(name="username") private WebElement usernamefield;
	@FindBy(name="password") private WebElement passwordfield;
	@FindBy(xpath="//button[@type='submit']") private WebElement signin;
	
	@FindBy(xpath = "//p[text()='Dashboard']") private WebElement dashboard;
	@FindBy(xpath = "//b[text()='7rmart supermarket']") private WebElement loginTitle;
	
	
	public Login_Page enterUsernameonUserField(String username)
	{
		
		usernamefield.sendKeys(username);
		return this;
	}
	public Login_Page enterPasswordonPasswordField(String password)
	{
		passwordfield.sendKeys(password);
		return this;

}
	public Home_Page clickSigninButton()
	{
		signin.click();
		return new Home_Page(driver);
	}
	public boolean isDashboardDisplayed()
	{
		return dashboard.isDisplayed();
	}
	public String getTitleText()
	{
		return loginTitle.getText();
	}
	}
