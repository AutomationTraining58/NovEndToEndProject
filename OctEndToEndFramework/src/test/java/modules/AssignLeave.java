package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTest;

public class AssignLeave {
	
	WebDriver driver; // driver is having life
	
	
	AssignLeave() throws IOException
	{
		BaseTest bt = new BaseTest();
		 driver=bt.applicationLogin();
		
	}
	
	
	By button_assignLeave= By.xpath("//button[@title='Assign Leave']");  // locator
	
	
	
	
	@Test
	public void clickOnAssignLeaveButton()
	{
		
		
		driver.findElement(button_assignLeave).click();
	}
	
	
	
	
	

}
