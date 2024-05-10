package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	
  @Test
  public void verifyUserIsAbleToLoginUsingValidCredentials() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
  }
  @Test
  public void verifyUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() {
	  String usernamevalue="admin";
	  String passwordvalue="admin123";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean invalidData=loginpage.alertCheck();
	  Assert.assertTrue(invalidData, "able to login");
  }
  @Test
  public void verifyUserIsAbleToLoginUsingInValidUsernameAndValidPassword() {
	  String usernamevalue="admin12";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean invalidData=loginpage.alertCheck();
	  Assert.assertTrue(invalidData, "able to login");
	   }
  @Test
  public void verifyUserIsAbleToLoginUsingInValidUsernameAndInvalidPassword() {
	  String usernamevalue="admin123";
	  String passwordvalue="admin2435";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean invalidData=loginpage.alertCheck();
	  Assert.assertTrue(invalidData, "able to login");
  }
}
