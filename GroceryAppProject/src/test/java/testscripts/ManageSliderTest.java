package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageSliderPage;
import utilities.ExcelUtility;

public class ManageSliderTest extends Base{
  @Test
  public void manageSlider() throws IOException {
	  String usernameValue = ExcelUtility.getStringData(1,0,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 1,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  String filefield = ExcelUtility.getStringData(1,0,"manageslider");
		String linkfield = ExcelUtility.getStringData(1, 1,"manageslider");

	  ManageSliderPage managesliderpage= new ManageSliderPage(driver);
	  managesliderpage.clickingManageSlider();
	  managesliderpage.clickingNewField();
	  managesliderpage.chooseFileField(filefield);
	  managesliderpage.clickingLinkField(linkfield);
	  managesliderpage.clickingSave();
	  managesliderpage.alertMessageDisplayAfterSaving();
	  boolean isMessageDisplayedAfterCreatingmanagesliderpage=managesliderpage.alertMessageDisplayAfterSaving();
	  Assert.assertTrue(isMessageDisplayedAfterCreatingmanagesliderpage,"not displayed");
	  
  }
}
