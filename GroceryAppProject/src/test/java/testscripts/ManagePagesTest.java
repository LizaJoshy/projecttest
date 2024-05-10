package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePagesPage;

public class ManagePagesTest extends Base {
  @Test
  public void managePages() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  ManagePagesPage managepagespage= new ManagePagesPage(driver);
	  managepagespage.clickingManageContent();
	  managepagespage.clickingManagePages();
	  managepagespage.clickingNewField();
	  managepagespage.enteringTitle();
	  managepagespage.enteringDescription();
	  managepagespage.enteringPageName();
	  managepagespage.choosingFile();
	  managepagespage.clickingSave();
	  managepagespage.alertMessageDisplayAfterSaving();
	 
	  boolean isMessageDisplayedAfterCreatingmanagepagespage=managepagespage.alertMessageDisplayAfterSaving();
	  Assert.assertTrue(isMessageDisplayedAfterCreatingmanagepagespage,"not displayed");
	  
  }
}
