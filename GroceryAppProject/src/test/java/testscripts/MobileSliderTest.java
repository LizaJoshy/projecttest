package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MobileSliderPage;
public class MobileSliderTest extends Base{
@Test
	public void mobileSlider()
	{
		 String usernamevalue="admin";
		  String passwordvalue="admin";
		  LoginPage loginpage=new LoginPage(driver);
		  loginpage.enterUserNameInUserNameField(usernamevalue);
		  loginpage.enterpasswordInPasswordField(passwordvalue);
		  loginpage.clickOnSignInButton();
		  boolean isHomePageLoaded=loginpage.dashBoardCheck();
		  Assert.assertTrue(isHomePageLoaded, "unable to login");
		  
		  MobileSliderPage mobilesliderpage= new MobileSliderPage(driver);
		  mobilesliderpage.clickingMobileSlider();
		  mobilesliderpage.clickingNewField();
		  mobilesliderpage.selectingField();
		  mobilesliderpage.clickingChooseFile();
		  mobilesliderpage.clickingSave();
		  boolean isMessageDisplayedAfterCreatingmobilesliderpage=mobilesliderpage.alertMessageDisplay();
		  Assert.assertTrue(isMessageDisplayedAfterCreatingmobilesliderpage,"not displayed");
		  
	}
  
}
