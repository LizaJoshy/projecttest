package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageDeliveryBoyPage;

public class ManageDeliveryBoyTest extends Base {
  @Test
  public void manageDeliveryBoySearching (){
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  String name="test";
	  ManageDeliveryBoyPage managedeliveryboypage=new ManageDeliveryBoyPage(driver);
	  managedeliveryboypage.clickingManageDeliveryBoy();
	  managedeliveryboypage.clickingSearchDeliveryBoy();
	  managedeliveryboypage.searchingDeliveryBoyByName(name);
	  managedeliveryboypage.clickingSearchButton();
	  boolean istabledisplayedbyclickingsearch=managedeliveryboypage.tableDisplay();
	  Assert.assertTrue(istabledisplayedbyclickingsearch,"not displayed");
	 // managedeliveryboypage.tableDisplay();
  }
}
