package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
//import pages.ManageExpensePage;
import pages.ManageLocationPage;
import utilities.ExcelUtility;

public class ManageLocationTest extends Base{
  @Test
  public void managelocation() throws IOException {
	  String usernameValue = ExcelUtility.getStringData(1,0,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 1,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  String country= ExcelUtility.getStringData(1,0,"Location");
		String state = ExcelUtility.getStringData(1, 1,"Location");
		 String location = ExcelUtility.getStringData(1,2,"Location");
			String charge = ExcelUtility.getIntegerData(1, 3,"Location");
	  ManageLocationPage managelocationpage=new ManageLocationPage(driver);
	  managelocationpage.clickingManageLocation();
	  managelocationpage.clickingNewField();
	  managelocationpage.selectingCountry(country);
	  managelocationpage.selectingstate(state);
	  managelocationpage.enteringLocation(location);
	  managelocationpage.enteringDeliveryCharge(charge);
	  managelocationpage.clickingSaveButton(); 
	  boolean isMessageDisplayedAfterLocation=managelocationpage.alertDisplay();
	  Assert.assertTrue(isMessageDisplayedAfterLocation,"Not displayed");
  }

	  
  }

