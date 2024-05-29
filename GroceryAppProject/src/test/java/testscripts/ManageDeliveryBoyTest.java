package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import utilities.ExcelUtility;

public class ManageDeliveryBoyTest extends Base {
  @Test
  public void manageDeliveryBoySearching () throws IOException{
	  String usernameValue = ExcelUtility.getStringData(1,0,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 1,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	 String searchdata=ExcelUtility.getStringData(1,0,"ManageDeliveryBoy");

	  ManageDeliveryBoyPage managedeliveryboypage=new ManageDeliveryBoyPage(driver);
	  managedeliveryboypage.clickingManageDeliveryBoy();
	  managedeliveryboypage.clickingSearchDeliveryBoy();
	  managedeliveryboypage.searchingDeliveryBoyByName(searchdata);
	  managedeliveryboypage.clickingSearchButton();
	  boolean istabledisplayedbyclickingsearch=managedeliveryboypage.tableDisplay();
	  Assert.assertTrue(istabledisplayedbyclickingsearch,"not displayed");
	 // managedeliveryboypage.tableDisplay();
  }
}
