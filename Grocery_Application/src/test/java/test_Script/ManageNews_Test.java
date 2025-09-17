package test_Script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.AdminUsers_Page;
import pages.Home_Page;
import pages.Login_Page;
import pages.ManageNews_Page;
//import utilities.ExcelUtility;
import utilities.Excel_Utility;

public class ManageNews_Test extends Base_Class {
	public Home_Page homepage;
	public AdminUsers_Page adminUsers_Page;
	@Test
	public void verifyUserisAbleToAddNewTitle() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickSigninButton();
		
		ManageNews_Page managenews=new ManageNews_Page(driver);
		
		managenews.clickNewButton().newsReadbyExcel();
		//String newsDetails=Excel_Utility.getStringData(1, 0, "ManageNews");
		//managenews.enterDetailsonTextNewsBox(newsDetails);
		//managenews.clickSaveButton();
		
		String expected="Manage News";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is able to add new title");
		
		
		
		
	}
	@Test
	public void verifyUserisAbleToSearchAddedTitleonSearchbox() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username).enterPasswordonPasswordField(password);
		homepage=loginpage.clickSigninButton();
		
		ManageNews_Page managenews=new ManageNews_Page(driver);
		
		managenews.clickSearchButton().searchTitleNewsbyExcelsheet();
		//String newsDetails=ExcelUtility.getStringData(1, 0, "ManageNews");
		//managenews.enterTitleNewsonSearchPage(newsDetails);
		//managenews.clickSearchTitleButton();
		//managenews.clickResetButton();
		
		String expected="Manage News";
		String actual=loginpage.getTitleText();
		Assert.assertEquals(actual,expected,"user is not able to add Title on search box");
	}
	

}
