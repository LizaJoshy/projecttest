package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContentPage;
import utilities.ExcelUtility;

public class ManageContentTest extends Base{
  @Test (groups={"sanity"},retryAnalyzer = retry.Retry.class)
  public void manageContent() throws IOException {
	  String usernameValue = ExcelUtility.getStringData(1,0,"Login");
		String passwordValue = ExcelUtility.getStringData(1, 1,"Login");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernameValue);
	  loginpage.enterpasswordInPasswordField(passwordValue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  String newss = ExcelUtility.getStringData(1,0,"Content");
	  ManageContentPage managecontentpage= new ManageContentPage(driver);
	  managecontentpage.clickingManageContent();
	  managecontentpage.clickingManageNews();
	  managecontentpage.clickingNewField();
	  managecontentpage.enteringNews(newss);
	  managecontentpage.clickingSave();
	  managecontentpage.alertMessageDisplayAfterSaving();
	  boolean isMessageDisplayedAfterCreatingmanagecontentpage=managecontentpage.alertMessageDisplayAfterSaving();
	  Assert.assertTrue(isMessageDisplayedAfterCreatingmanagecontentpage,"not displayed");
	  
  }
}
