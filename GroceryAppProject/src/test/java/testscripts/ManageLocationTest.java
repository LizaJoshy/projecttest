package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
//import pages.ManageExpensePage;
import pages.ManageLocationPage;

public class ManageLocationTest extends Base{
  @Test
  public void managelocation() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  ManageLocationPage managelocationpage=new ManageLocationPage(driver);
	  managelocationpage.clickingManageLocation();
	  managelocationpage.clickingNewField();
	  managelocationpage.selectingCountry();
	  managelocationpage.selectingstate();
	  managelocationpage.enteringLocation();
	  managelocationpage.enteringDeliveryCharge();
	  managelocationpage.clickingSaveButton(); 
	  boolean isMessageDisplayedAfterLocation=managelocationpage.alertDisplay();
	  Assert.assertTrue(isMessageDisplayedAfterLocation,"Not displayed");
  }

	  
  }

