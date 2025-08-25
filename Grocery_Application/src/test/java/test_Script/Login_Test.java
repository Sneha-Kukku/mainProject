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
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		String username=Excel_Utility.getStringData(1, 0,"LoginPage");
		String password=Excel_Utility.getStringData(1, 1,"LoginPage");
		
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		//WebElement usernamefield=driver.findElement(By.name("username"));
		//usernamefield.sendKeys("admin");
		//WebElement passwordfield=driver.findElement(By.name("password"));
		//passwordfield.sendKeys("admin");
		//WebElement checkBox=driver.findElement(By.id("remember"));
		//checkBox.click();
		//WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		//signin.click();
	}
	@Test
	public void verifyInvalidUsernamewithValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(2, 0,"LoginPage");
		String password=Excel_Utility.getStringData(2, 1,"LoginPage");
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@name='username']"));
		//usernamefield.sendKeys("adm1223");
		//WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
		//passwordfield.sendKeys("admin");
		//WebElement checkBox=driver.findElement(By.id("remember"));
		//checkBox.click();
		//WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		//signin.click();
	}
	@Test
	public void verifyvalidUsernamewithInValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(3, 0,"LoginPage");
		String password=Excel_Utility.getStringData(3, 1,"LoginPage");
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@name='username']"));
		//usernamefield.sendKeys("admin");
		//WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
		//passwordfield.sendKeys("admin1334");
		//WebElement checkBox=driver.findElement(By.id("remember"));
		//checkBox.click();
		//WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		//signin.click();
}
	@Test
	public void verifyInvalidUsernamewithInValidPassword() throws IOException
	{
		String username=Excel_Utility.getStringData(4, 0,"LoginPage");
		String password=Excel_Utility.getStringData(4, 1,"LoginPage");
		Login_Page loginpage=new Login_Page(driver);
		loginpage.enterUsernameonUserField(username);
		loginpage.enterPasswordonPasswordField(password);
		loginpage.clickSigninButton();
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@name='username']"));
		//usernamefield.sendKeys("adm1223");
		//WebElement passwordfield=driver.findElement(By.xpath("//input[@name='password']"));
		//passwordfield.sendKeys("admin133334");
		//WebElement checkBox=driver.findElement(By.id("remember"));
		//checkBox.click();
		//WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		//signin.click();
}
}
