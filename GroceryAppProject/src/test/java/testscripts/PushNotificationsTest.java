package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PushNotificationPage;

public class PushNotificationsTest extends Base {
  @Test
  public void PushNotificationsSending() {
	  String usernamevalue="admin";
	  String passwordvalue="admin";
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUserNameInUserNameField(usernamevalue);
	  loginpage.enterpasswordInPasswordField(passwordvalue);
	  loginpage.clickOnSignInButton();
	  boolean isHomePageLoaded=loginpage.dashBoardCheck();
	  Assert.assertTrue(isHomePageLoaded, "unable to login");
	  
	  PushNotificationPage pushnotificationpage=new PushNotificationPage(driver);
	  pushnotificationpage.clickingPushNotification();
	  pushnotificationpage.enterTitleInTitleField();
	  pushnotificationpage.enterDescriptionInDescriptionField();
	  pushnotificationpage.clickingSendButton();
	  boolean isMessageDisplayedAfterCreating=pushnotificationpage.alertDisplay();
	  Assert.assertTrue(isMessageDisplayedAfterCreating,"no message");
	  
	  
  }
}
