package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageExpensePage;

public class ManageExpenseTest extends Base{
  @Test
  public void manageExpenseCategory() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	
	  ManageExpensePage manageexpensepage=new ManageExpensePage(driver);
	  manageexpensepage.clickingManageExpenseField();
	  manageexpensepage.clickingExpenseCategory();
	  manageexpensepage.clickingNew();
	  manageexpensepage.addTitle();
	  manageexpensepage.clickingSaveButton();
	  boolean isMessageDisplayedAfterCreatingExpense=manageexpensepage.alertDisplaying();
	  Assert.assertTrue(isMessageDisplayedAfterCreatingExpense ,"not displayed");
  }
}
