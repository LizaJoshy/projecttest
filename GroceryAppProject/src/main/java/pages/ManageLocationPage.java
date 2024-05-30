package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;


public class ManageLocationPage {
	WebDriver driver;
	public ManageLocationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Manage Location'] ")WebElement managelocationfield;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newfield;
	@FindBy(xpath="//select[@id='country_id']")WebElement countryfield;
	@FindBy(xpath="//select[@id='st_id']")WebElement statefield;
	@FindBy(xpath="//input[@placeholder='Enter the Location']")WebElement location;
	@FindBy(xpath="//input[@placeholder='Enter the Delivery Charge']")WebElement deliverycharge;
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertdisplaying;
	public void clickingManageLocation()
	{
		managelocationfield.click();
	}
	public void clickingNewField()
	{
		newfield.click();
	}
	public void selectingCountry(String countryname)
	{
		//Select select=new Select(countryfield);
		//select.selectByVisibleText(countryname);
		PageUtility p=new PageUtility();
		p.selection(countryfield,countryname);

	}
	public void selectingstate(String statename)
	{
		Select select=new Select(statefield);
		select.selectByVisibleText(statename);
	}
	public void enteringLocation(String locations)
	{
		location.sendKeys(locations);
	}
	public void enteringDeliveryCharge(String charge)
	{
		deliverycharge.sendKeys(charge);
	}
	public void clickingSaveButton()
	{
	
		save.click();
	}
	public boolean alertDisplay()
	{
	 return alertdisplaying.isDisplayed();
	}
}

