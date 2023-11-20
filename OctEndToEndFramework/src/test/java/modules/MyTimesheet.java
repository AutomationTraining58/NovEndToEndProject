package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyTimesheet {
	
	
	// Page Object Model !!!
	
    WebDriver driver;  // driver is havibng life
	

	
	MyTimesheet() throws IOException
	{
		// this is the first method which will run
		BaseTest bt = new BaseTest();
		
	   driver=    bt.applicationLogin();
		
	}
	
	////button[@title='My Timesheet']
	
	By button_timesheetIcon = By.xpath("//button[@title='My Timesheet']");   // locators
	
	By  link_HelpButton      =By.xpath("//button[@title='Help']");           // locator
	
	
	
	@Test(priority=1)
	public void clickOnTimeSheetIcon() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(button_timesheetIcon).click();
		
	}
	
	
	@Test(priority=2)
	public void clickOnHelpButton() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(link_HelpButton).click();
	}
	
	
	

	

}
