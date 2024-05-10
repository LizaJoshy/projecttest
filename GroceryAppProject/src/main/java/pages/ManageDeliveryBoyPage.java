package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {
	WebDriver driver;
	public ManageDeliveryBoyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Manage Delivery Boy']")WebElement managedeliveryboy;
	@FindBy(xpath="//a[@href='javascript:void(0)']")WebElement searchdeliveryboy;
	@FindBy(xpath="//input[@placeholder='Name']")WebElement searchdeliveryboybyname;
	@FindBy(xpath="//button[@type='submit']")WebElement searchclick;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']")WebElement tabledisplay;
	public void clickingManageDeliveryBoy()
	{
		managedeliveryboy.click();
	}
	public void clickingSearchDeliveryBoy()
	{
		searchdeliveryboy.click();
	}
	public void searchingDeliveryBoyByName(String name)
	{
		searchdeliveryboybyname.sendKeys(name);	
		
	}
	public void clickingSearchButton()
	{
		searchclick.click();
	}

	public boolean tableDisplay()
	{
	 return tabledisplay.isDisplayed();
	}
}
	//table method
	//public boolean searchButtonEnable()
	//{
		//return searchclick.isEnabled();
	//}

