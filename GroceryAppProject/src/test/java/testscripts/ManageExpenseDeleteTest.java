package testscripts;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import pages.LoginPage;
import pages.ManageExpenceDeletePage;
import utilities.ExcelUtility;


public class ManageExpenseDeleteTest extends Base{
  @Test
  public void deleteProductPage() throws IOException{
	  String usernameValue = ExcelUtility.getStringData(1,0,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 1,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
		ManageExpenceDeletePage deletePro= new ManageExpenceDeletePage(driver);
	 deletePro.maangeExpenece();
	 deletePro.expenceCategory();
	 deletePro.deleteProduct();
	 deletePro.alertMessageSuccess();

	  }
	
  }

