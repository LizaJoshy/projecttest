package pages;

//import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobileSliderPage {
	WebDriver driver;
	public MobileSliderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Mobile Slider']")WebElement mobileslider;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newfield;
	@FindBy(xpath="//select[@class='form-control selectpicker']")WebElement selectionfield;
	//Select select=new Select(selectionfield);
	//select.selectByVisibleText("Apple");
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	//StringSelection selection=new StringSelection("C:\\Users\\lizaj\\Downloads\\apple.jpeg");
	@FindBy(xpath="//button[@type='submit']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alertmessage;
	public void clickingMobileSlider()
	{
		mobileslider.click();
	}
	public void clickingNewField()
	{
		newfield.click();
	}
	public void selectingField()
	{
		Select select=new Select(selectionfield);
		select.selectByVisibleText("Apple");
		//selectionfield.click();
	}
	public void clickingChooseFile()
	{
		choosefile.sendKeys("C:\\Users\\lizaj\\Downloads\\apple.jpeg");
		//choosefile.click();
	}
	public void clickingSave()
	{
		save.click();
	}
	
	public boolean alertMessageDisplay()
	{
	 return alertmessage.isDisplayed();
	}
}
	
	

