package test_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import automation_Core.Base_Class;
import pages.Home_Page;

public class Home_Test extends Base_Class {
	
	@Test
	
	public void verifyUserIsAbleToLogout()
	{
		Home_Page homepage=new Home_Page(driver);
		homepage.verifyValidUsername();
		homepage.verifyValidPassword();
		homepage.clickSignin();
		
		homepage.verifyAdminButton();
		homepage.verifyLogoutButton();
	
		//WebElement usernamefield=driver.findElement(By.name("username"));
		//usernamefield.sendKeys("admin");
		//WebElement passwordfield=driver.findElement(By.name("password"));
		//passwordfield.sendKeys("admin");
		//WebElement checkBox=driver.findElement(By.id("remember"));
		//checkBox.click();
		//WebElement siginin=driver.findElement(By.xpath("//button[@type='submit']"));
		//siginin.click();
		
		//WebElement adminButton=driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		//adminButton.click();
		//WebElement logoutButton=driver.findElement(By.xpath("//a[@class='dropdown-item' and @href='https://groceryapp.uniqassosiates.com/admin/logout']"));
		//logoutButton.click();
	}

}
