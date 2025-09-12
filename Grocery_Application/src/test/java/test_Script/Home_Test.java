package test_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Excel_Utility;

public class Home_Test extends Base_Class {
	
	@Test
	
	public void verifyUserIsAbleToLogout() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
		Home_Page homepage=new Home_Page(driver);
		homepage.clickAdminButton();
		homepage.clickLogoutButton();
		
		String expected="Logout";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is able to logout");
	
	}

}
