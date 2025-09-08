package test_Script;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.Login_Page;
import pages.ManageNews_Page;
import utilities.ExcelUtility;
import utilities.Excel_Utility;

public class ManageNews_Test extends Base_Class {
	@Test
	public void verifyUserisAbleToAddNewTitle() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
		ManageNews_Page managenews=new ManageNews_Page(driver);
		managenews.clickManageNewsPage();
		managenews.clickNewButton();
		managenews.newsReadbyExcel();
		//String newsDetails=Excel_Utility.getStringData(1, 0, "ManageNews");
		//managenews.enterDetailsonTextNewsBox(newsDetails);
		//managenews.clickSaveButton();
		
		
	}
	@Test
	public void verifyUserisAbleToSearchAddedTitleonSearchbox() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		
		ManageNews_Page managenews=new ManageNews_Page(driver);
		managenews.clickManageNewsPage();
		managenews.clickSearchButton();
		managenews.searchTitleNewsbyExcelsheet();
		//String newsDetails=ExcelUtility.getStringData(1, 0, "ManageNews");
		//managenews.enterTitleNewsonSearchPage(newsDetails);
		//managenews.clickSearchTitleButton();
		//managenews.clickResetButton();
	}
	

}
