package testscripts;

import org.testng.annotations.Test;
import org.testng.Assert;
import pages.LoginPage;
import pages.ManageExpenceDeletePage;


public class ManageExpenseDeleteTest extends Base{
  @Test
  public void deleteProductPage(){
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
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

