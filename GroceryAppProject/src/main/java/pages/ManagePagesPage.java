package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePagesPage {
	WebDriver driver;
	public ManagePagesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='nav-icon fas fa-edit']")WebElement managecontent;
	@FindBy(xpath="//p[text()='Manage Pages']")WebElement managepages;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newfield;
	@FindBy(xpath="//input[@placeholder='Enter the Title']")WebElement entertitle;
	@FindBy(xpath="//div[@contenteditable='true']")WebElement description;
	@FindBy(xpath="//input[@placeholder='Enter Page Name']")WebElement enterpagename;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public void clickingManageContent()
	{
		managecontent.click();
	}
	public void clickingManagePages()
	{
		managepages.click();
	}
	public void clickingNewField()
	{
		newfield.click();
	}
	public void enteringTitle()
	{
		entertitle.sendKeys("Liza Joshy");
	}
	public void enteringDescription()
	{
		description.sendKeys("Hi iam Liza Joshy");
	}
	public void enteringPageName()
	{
		enterpagename.sendKeys("obsqura");
	}
	public void choosingFile()
	{
		choosefile.sendKeys("C:\\Users\\lizaj\\Downloads\\apple.jpeg");
	}
	public void clickingSave()
	{
		save.click();
	}
	
	public boolean alertMessageDisplayAfterSaving()
	{
	 return alert.isDisplayed();
	}
}
	
	




