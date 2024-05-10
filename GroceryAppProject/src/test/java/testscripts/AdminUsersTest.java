package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersTest extends Base {
  @Test
  public void adminUsers() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  AdminUsersPage adminuserspage= new AdminUsersPage(driver);
	  adminuserspage.clickingAdminUsers();
	  adminuserspage.clickingNewField();
	  adminuserspage.enteringUsername();
	  adminuserspage.enteringPassword();
	  adminuserspage.selectingUserTypeField();
	  adminuserspage.clickingSave();
	  adminuserspage.alertMessageDisplayAfterSaving();
	  boolean isMessageDisplayedAfterCreatingadminuserspage=adminuserspage.alertMessageDisplayAfterSaving();
	  Assert.assertTrue(isMessageDisplayedAfterCreatingadminuserspage,"not displayed");
  }
}
