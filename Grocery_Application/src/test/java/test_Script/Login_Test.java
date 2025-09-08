package test_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.Login_Page;
import utilities.Excel_Utility;
//import pages.Login_Page;

public class Login_Test extends Base_Class {
	@Test(priority=1,description="sucessful user login with valid credentials")
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
		
	}
	@Test(priority=2,description="user login with invalid username and valid password")
	public void verifyInvalidUsernamewithValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(2, 0,"LoginPage");
		String password=Excel_Utility.getStringData(2, 1,"LoginPage");
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
	}
	@Test(priority=3,description="user login with valid username and invalid password")
	public void verifyvalidUsernamewithInValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(3, 0,"LoginPage");
		String password=Excel_Utility.getStringData(3, 1,"LoginPage");
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
}
	@Test(priority=4,description="user login with invalid username and invalid password")
	public void verifyInvalidUsernamewithInValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(4, 0,"LoginPage");
		String password=Excel_Utility.getStringData(4, 1,"LoginPage");
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
}
}
