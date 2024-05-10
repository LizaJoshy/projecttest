package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	WebDriver driver;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Admin Users']")WebElement adminusers;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newfield;
	@FindBy(xpath="//input[@name='username']")WebElement usernamefield;
	@FindBy(xpath="//input[@name='password']")WebElement passwordfield;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertypefield;
	@FindBy(xpath="//button[@name='Create']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public void clickingAdminUsers()
	{
		adminusers.click();
	}
	public void clickingNewField()
	{
		newfield.click();
	}
	public void enteringUsername()
	{
		usernamefield.sendKeys("liyana");
	}
	public void enteringPassword()
	{
		passwordfield.sendKeys("123");
	}
	public void selectingUserTypeField()
	{
		Select select=new Select(usertypefield);
		select.selectByVisibleText("Staff");

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
	
	






