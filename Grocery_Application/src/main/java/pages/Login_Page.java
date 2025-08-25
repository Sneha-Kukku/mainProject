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
	
	
	public void enterUsernameonUserField(String username)
	{
		
		usernamefield.sendKeys(username);
	}
	public void enterPasswordonPasswordField(String password)
	{
		passwordfield.sendKeys(password);

}
	public void clickSigninButton()
	{
		signin.click();
	}
	}
