package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	/*@DataProvider(name="credentials")
	 public Object[][] testData()
	  {
		  Object[][] input =new Object[2][2];
		  input[0][0]="admin";
		  input[0][1]="admin";
		  input[1][0]="admin1";
		  input[1][1]="admin2";
return input;
	  }*/
  @Test//(dataProvider="credentials"),Groups={"sanity"}
  public void verifyUserIsAbleToLoginUsingValidCredentials() throws IOException {
	  String usernameValue = ExcelUtility.getStringData(1,0,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 1,"Login");
	// String username1=username;
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
  }
  @Test//(description ="verify the user is not able to login with valid username and invalid password" )
  public void verifyUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException {
	  String usernameValue = ExcelUtility.getStringData(1,2,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 3,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean invalidData=loginpage.alertCheck();
	  Assert.assertTrue(invalidData, "able to login");
  }
  @Test (groups={"sanity"})
  public void verifyUserIsAbleToLoginUsingInValidUsernameAndValidPassword() throws IOException {
	  String usernameValue = ExcelUtility.getStringData(1,4,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 5,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean invalidData=loginpage.alertCheck();
	  Assert.assertTrue(invalidData, "able to login");
	   }
  @Test
  @Parameters("browser")
  public void verifyUserIsAbleToLoginUsingInValidUsernameAndInvalidPassword() throws IOException {
	  String usernameValue = ExcelUtility.getStringData(1,6,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 7,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean invalidData=loginpage.alertCheck();
	  Assert.assertTrue(invalidData, "able to login");
  }
}
