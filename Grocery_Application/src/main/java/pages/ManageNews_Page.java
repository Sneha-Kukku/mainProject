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
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']") private WebElement manageNewsPage;
	@FindBy(xpath ="//a[@class='btn btn-rounded btn-danger']") private WebElement newButton;
	@FindBy(xpath="//textarea[@id='news']") private WebElement textNewsBox;
	@FindBy(xpath = "//button[@name='create']") private WebElement saveButton;
	
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']") private WebElement searchButton;
	@FindBy(xpath = "//input[@name='un']") private WebElement searchTitleButton;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']") private WebElement titleButtonSearch;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']") private WebElement resetButton;
	
	
	public void clickManageNewsPage()
	{
		manageNewsPage.click();
	}
	
	public void clickNewButton()
	{
		newButton.click();
	}
	public void newsReadbyExcel() throws IOException
	{
		String news=Excel_Utility.getStringData(1, 0,"ManageNews");
		
		textNewsBox.sendKeys(news);
		saveButton.click();
		
	}
	public void enterDetailsonTextNewsBox(String newsDetails)
	{
		textNewsBox.sendKeys(newsDetails);
	}
	public void clickSaveButton()
	{
		
		saveButton.click();
	}
	
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	public void searchTitleNewsbyExcelsheet() throws IOException
	{
		String news12=Excel_Utility.getStringData(1, 0,"ManageNews");
		searchTitleButton.sendKeys(news12);
		titleButtonSearch.click();
		
	}
	public void clickSearchTitleButton()
	{
		titleButtonSearch.click();
	}
	public void clickResetButton()
	{
		resetButton.click();
	}

}
