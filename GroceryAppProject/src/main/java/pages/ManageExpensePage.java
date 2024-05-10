package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageExpensePage {
	WebDriver driver;
	public ManageExpensePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=" //i[@class='nav-icon fas fa-money-bill-alt']")WebElement manageexpensefield;
	@FindBy(xpath="//p[text()='Expense Category']")WebElement expensecategory;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newfield;
	@FindBy(xpath="//input[@id='name']")WebElement titlefield;
	@FindBy(xpath="//i[@class='fa fa-save']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	
	public void clickingManageExpenseField()
	{
		manageexpensefield.click();
	}
	public void clickingExpenseCategory()
	{
		expensecategory.click();
	}
	public void clickingNew()
	{
		newfield.click();	
		
	}
	public void addTitle()
	{
		titlefield.sendKeys("lena");
	}
	public void clickingSaveButton()
	{
		savebutton.click();
	}
public boolean alertDisplaying()
{
	return alertmessage.isDisplayed();
}
	//public boolean tableDisplay()
	//{
	// return tabledisplay.isDisplayed();
	//}
}



