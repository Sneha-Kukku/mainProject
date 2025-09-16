package test_Script;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.AdminUsers_Page;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Excel_Utility;
import utilities.RandomDataUtility;

public class AdminUsers_Test extends Base_Class {
	public Home_Page homepage;
	public AdminUsers_Page adminusersPage;
	@Test
	public void verifyUserisAbleToAddNewUser() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickSigninButton();
		
		
		adminusersPage=homepage.clickAdminUsersButton();
		adminusersPage.clickNewButton();
		
		String adminusername=Excel_Utility.getStringData(1, 0,"AdminUsersPage");
		String adminpassword=Excel_Utility.getStringData(1, 1,"AdminUsersPage");
		
		RandomDataUtility random=new RandomDataUtility();
		String adminUsername=random.createRandomUserName();
		String adminPassword=random.createRandomPassword();
		adminusersPage.enterUsernameField(adminUsername).enterPasswordfield(adminPassword).selectAdminfromUserType().clickSaveButton();
		
		String expected="Admin Users";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is not able to add new user");
		}
	@Test
	public void verifyUserisAbletoSearchNewUserinAdminUsers() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickSigninButton();
		
		AdminUsers_Page adminusersPage=new AdminUsers_Page(driver);
		adminusersPage.clickSearchButton();
		String adminusername=Excel_Utility.getStringData(1, 0,"AdminUsersPage");
		String adminpassword=Excel_Utility.getStringData(1, 1,"AdminUsersPage");
		adminusersPage.enterUsernamefieldDisplayedintheSearchpage(adminusername).selectAdminfromUserTypeinSearchPage().clickSearchButtondisplayedintheSearchPage();
		
		String expected="Admin Users";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is not able to search new user in AdminUsers");
		
		
		
	}
	
	}


