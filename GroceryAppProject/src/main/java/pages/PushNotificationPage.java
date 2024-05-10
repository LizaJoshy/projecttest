package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationPage {
	WebDriver driver;
	public PushNotificationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Push Notifications']")WebElement pushnotification;
	@FindBy(xpath="//input[@placeholder='Enter Title']")WebElement titlefield;
	@FindBy(xpath="//input[@placeholder='Enter Description']")WebElement descriptionfield;
	@FindBy(xpath="//button[@type='submit']")WebElement sendbutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement successalert;
	public void clickingPushNotification()
	{
		pushnotification.click();
	}
	public void enterTitleInTitleField()
	{
		titlefield.sendKeys("st xaviers");
	}
	public void enterDescriptionInDescriptionField()
	{
		descriptionfield.sendKeys("welcomes you");
	}
	public void clickingSendButton()
	{
		sendbutton.click();
	}
	public boolean alertDisplay()
	{
	 return successalert.isDisplayed();
	}
}
	

