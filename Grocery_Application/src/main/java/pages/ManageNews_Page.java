package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Excel_Utility;

public class ManageNews_Page {
	public WebDriver driver;
	public ManageNews_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']") private WebElement newButton;
	@FindBy(xpath="//textarea[@id='news']") private WebElement textNewsBox;
	@FindBy(xpath = "//button[@name='create']") private WebElement saveButton;
	
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") private WebElement searchButton;
	@FindBy(xpath = "//input[@name='un']") private WebElement searchTitleButton;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") private WebElement titleButtonSearch;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']") private WebElement resetButton;
	
	@FindBy(xpath="//h1[@class='m-0 text-dark']") private WebElement manageNewsTitle;
	
	
	
	
	public ManageNews_Page clickNewButton()
	{
		newButton.click();
		return this;
	}
	public ManageNews_Page newsReadbyExcel() throws IOException
	{
		String news=Excel_Utility.getStringData(1, 0,"ManageNews");
		
		textNewsBox.sendKeys(news);
		saveButton.click();
		return this;
		
	}
	public ManageNews_Page enterDetailsonTextNewsBox(String newsDetails)
	{
		textNewsBox.sendKeys(newsDetails);
		return this;
	}
	public ManageNews_Page clickSaveButton()
	{
		
		saveButton.click();
		return this;
	}
	
	
	public ManageNews_Page clickSearchButton()
	{
		searchButton.click();
		return this;
	}
	public ManageNews_Page searchTitleNewsbyExcelsheet() throws IOException
	{
		String news12=Excel_Utility.getStringData(1, 0,"ManageNews");
		searchTitleButton.sendKeys(news12);
		titleButtonSearch.click();
		return this;
		
	}
	public ManageNews_Page clickSearchTitleButton()
	{
		titleButtonSearch.click();
		return this;
	}
	public ManageNews_Page clickResetButton()
	{
		resetButton.click();
		return this;
	}
	public String getTitleText()
	{
		return manageNewsTitle.getText();
	}

}
