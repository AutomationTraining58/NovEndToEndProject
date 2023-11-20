package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	//String browser="chrome";
	WebDriver driver;
	
	@Test
	public WebDriver applicationLogin() throws IOException
	{
		
		FileInputStream fis = new FileInputStream("C:\\TestingProjects\\OctEndToEndFramework\\resources\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
			  	
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			WebDriverManager.edgedriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			
			driver= new FirefoxDriver();
			WebDriverManager.firefoxdriver().setup();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		

		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
		// we have to drive it from external file
		// properties file
	    //   .properties
		
		return driver;
		
	}
	

}
