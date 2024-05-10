package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


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
	public void selectingCountry()
	{
		Select select=new Select(countryfield);
		select.selectByVisibleText("United Kingdom");

	}
	public void selectingstate()
	{
		Select select=new Select(statefield);
		select.selectByIndex(5);
	}
	public void enteringLocation()
	{
		location.sendKeys("munnar");
	}
	public void enteringDeliveryCharge()
	{
		deliverycharge.sendKeys("500");
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

