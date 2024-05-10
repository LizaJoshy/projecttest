package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageSliderPage;

public class ManageSliderTest extends Base{
  @Test
  public void manageSlider() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  ManageSliderPage managesliderpage= new ManageSliderPage(driver);
	  managesliderpage.clickingManageSlider();
	  managesliderpage.clickingNewField();
	  managesliderpage.chooseFileField();
	  managesliderpage.clickingLinkField();
	  managesliderpage.clickingSave();
	  managesliderpage.alertMessageDisplayAfterSaving();
	  boolean isMessageDisplayedAfterCreatingmanagesliderpage=managesliderpage.alertMessageDisplayAfterSaving();
	  Assert.assertTrue(isMessageDisplayedAfterCreatingmanagesliderpage,"not displayed");
	  
  }
}
