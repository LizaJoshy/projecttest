package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContentPage;

public class ManageContentTest extends Base{
  @Test
  public void manageContent() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  ManageContentPage managecontentpage= new ManageContentPage(driver);
	  managecontentpage.clickingManageContent();
	  managecontentpage.clickingManageNews();
	  managecontentpage.clickingNewField();
	  managecontentpage.enteringNews();
	  managecontentpage.clickingSave();
	  managecontentpage.alertMessageDisplayAfterSaving();
	  boolean isMessageDisplayedAfterCreatingmanagecontentpage=managecontentpage.alertMessageDisplayAfterSaving();
	  Assert.assertTrue(isMessageDisplayedAfterCreatingmanagecontentpage,"not displayed");
	  
  }
}
