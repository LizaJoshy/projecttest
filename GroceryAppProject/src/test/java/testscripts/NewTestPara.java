package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
//import utilities.ExcelUtility;

public class NewTestPara extends Base{
  @Test
  @Parameters({"Username","Password"})
  public void verifyUserIsAbleToLoginUsingValidCredentials(String User, String Pass) throws IOException {
	 // String usernameValue = ExcelUtility.getStringData(1,0,"Login");
		//String passwordValue = ExcelUtility.getStringData(1, 1,"Login");
	// String username1=username;
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(User);
	  loginpage.enterpasswordInPasswordField(Pass);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
  }
  }

