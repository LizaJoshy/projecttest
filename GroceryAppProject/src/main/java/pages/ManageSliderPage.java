package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class ManageSliderPage {
	WebDriver driver;
	public ManageSliderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Manage Slider']")WebElement manageslider;
	@FindBy(xpath="//a[@onclick='click_button(1)']")WebElement newfield;
	@FindBy(xpath="//input[@name='main_img']")WebElement choosefield;
	@FindBy(xpath="//input[@placeholder='Link']")WebElement linkfield;
	@FindBy(xpath="//button[@name='create']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public void clickingManageSlider()
	{
		manageslider.click();
	}
	public void clickingNewField()
	{
		newfield.click();
	}
	public void chooseFileField()
	{
		choosefield.sendKeys("C:\\Users\\lizaj\\Downloads\\apple.jpeg");
	}
	public void clickingLinkField()
	{
		linkfield.sendKeys("https://groceryapp.uniqassosiates.com/admin/Slider/add");
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
	
	



