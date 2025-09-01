package test_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.AdminUsers_Page;
import pages.Login_Page;
import utilities.Excel_Utility;

public class AdminUsers_Test extends Base_Class {
	@Test
	public void verifyUserisAbletoClickOnMoreinfoinAdminusersofHomePage() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
		AdminUsers_Page adminusersPage=new AdminUsers_Page(driver);
		adminusersPage.clickAdminUsersButton();
		adminusersPage.clickNewButton();
		adminusersPage.enterUsernameField();
		adminusersPage.enterPasswordfield();
		adminusersPage.enterUsertypefield();
		adminusersPage.selectAdminfromUserType();
		adminusersPage.clickSaveButton();
		}
	@Test
	public void verifyUserisAbletoSearchNewUserinAdminUsers() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
		AdminUsers_Page adminusersPage=new AdminUsers_Page(driver);
		adminusersPage.clickAdminUsersButton();
		adminusersPage.clickSearchButton();
		adminusersPage.enterUsernamefieldDisplayedintheSearchpage();
		adminusersPage.enterUsertypeinSearchPage();
		adminusersPage.clickSearchButtondisplayedintheSearchPage();
		adminusersPage.clickSearchButton();
		
		
	}
	
	}


