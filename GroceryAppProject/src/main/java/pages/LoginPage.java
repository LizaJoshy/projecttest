package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Username']")WebElement usernameField;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']")WebElement siginButton;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;

	public void enterUserNameInUserNameField(String username)
	{
		usernameField.sendKeys(username);
	}
	public void enterpasswordInPasswordField(String password)
	{
		passwordField.sendKeys(password);
	}
	public void clickOnSignInButton()
	{
		siginButton.click();
	}
	public boolean dashBoardCheck()
	{
		return dashboard.isDisplayed();	
	}
	public boolean alertCheck()
	{
		return alert.isDisplayed();	
	}

	}


