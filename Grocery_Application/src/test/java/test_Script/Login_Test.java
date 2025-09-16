package test_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Excel_Utility;
//import pages.Login_Page;

public class Login_Test extends Base_Class {
	public Home_Page homepage;
	@Test(priority=1,description="sucessful user login with valid credentials",groups= {"smoke"},retryAnalyzer=retryAnalyzer.Retry.class)
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickSigninButton();
		
		boolean dashboardDisplay=loginpage.isDashboardDisplayed();
		Assert.assertTrue(dashboardDisplay,"user couldn't login with valid credential");
		
		
	}
	@Test(priority=2,description="user login with invalid username and valid password")
	public void verifyInvalidUsernamewithValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(2, 0,"LoginPage");
		String password=Excel_Utility.getStringData(2, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password).clickSigninButton();
		
		String expected="7rmart supermarket";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is able to login with invalid username");
	}
	@Test(priority=3,description="user login with valid username and invalid password")
	public void verifyvalidUsernamewithInValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(3, 0,"LoginPage");
		String password=Excel_Utility.getStringData(3, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password).clickSigninButton();
		
		String expected="7rmart supermarket";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is able to login with invalid password");
		
}
	@Test(priority=4,description="user login with invalid username and invalid password",groups= {"smoke"},dataProvider="loginProvider")
	public void verifyInvalidUsernamewithInValidPassword(String username,String password) throws IOException
	{
		//String username=Excel_Utility.getStringData(4, 0,"LoginPage");
		//String password=Excel_Utility.getStringData(4, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password).clickSigninButton();
		
		String expected="7rmart supermarket";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is able to login with invalid username and invalid password");
	
		
}
	@DataProvider(name = "loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException {

		return new Object[][] { new Object[] { "admin", "admin22" }, new Object[] { "admin123", "123" },
				// new Object[] {ExcelUtility.getStringData(3,
				// 0,"Login"),ExcelUtility.getStringData(3,1 ,"Login")}
		};
	}
}
