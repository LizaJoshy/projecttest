package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class PageUtility {
	WebDriver driver;
	public void selection(WebElement element, String elementtext)
	{
		Select select=new Select(element);
		select.selectByVisibleText(elementtext);
	}
	public void actions(WebElement elementname,WebElement destination)
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(elementname).click();
		actions.doubleClick().click();
		actions.dragAndDrop(elementname, destination).build().perform();
		
	}
	public void javascriptExecutor()
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy(0,550)","");
		js.executeScript("window.ScrollBy(0,-550)","");
		
		
	}
}
