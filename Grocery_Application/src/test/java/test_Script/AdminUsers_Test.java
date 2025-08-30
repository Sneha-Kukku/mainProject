package test_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.AdminUsers_Page;

public class AdminUsers_Test extends Base_Class {
	@Test
	public void verifyUserisAbletoClickOnMoreinfoinAdminusersofHomePage()
	{
		AdminUsers_Page adminusersPage=new AdminUsers_Page(driver);
		adminusersPage.verifyValidUsername();
		adminusersPage.verifyValidPassword();
		adminusersPage.clickSignin();
		adminusersPage.verifyAdminUsersButton();
		/*WebElement usernamefield=driver.findElement(By.name("username"));
		usernamefield.sendKeys("admin");
		WebElement passwordfield=driver.findElement(By.name("password"));
		passwordfield.sendKeys("admin");
		//WebElement checkBox=driver.findElement(By.id("remember"));
		//checkBox.click();
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement moreInfoButton=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		moreInfoButton.click();*/
	}
	@Test
	public void verifyUserIsAbleToClickSearchButtoninsideAdminUserstab()
	{
		AdminUsers_Page adminusersPage=new AdminUsers_Page(driver);
		adminusersPage.verifyValidUsername();
		adminusersPage.verifyValidPassword();
		adminusersPage.clickSignin();
		adminusersPage.verifyAdminUsersButton();
		adminusersPage.verifyUserisAbletoClickOnSearchiconinAdminUsers();
		
		
		/*WebElement usernamefield=driver.findElement(By.name("username"));
		usernamefield.sendKeys("admin");
		WebElement passwordfield=driver.findElement(By.name("password"));
		passwordfield.sendKeys("admin");
		//WebElement checkBox=driver.findElement(By.id("remember"));
		//checkBox.click();
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		WebElement moreInfoButton=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		moreInfoButton.click();
		
		WebElement searchButton=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		searchButton.click();*/
			}
	
	}


