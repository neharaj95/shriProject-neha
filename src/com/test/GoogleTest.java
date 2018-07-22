package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	// no main
	// by default is ka accessfier private hota hai ye driver sirf is claa m hi milega theek hai 
	// ye aapne sirf declare kiya hai iski value NULL hogi ..isko aapko memory assign
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://shriresume.com/");
	}
	//priority  defines the order which test u want to execute first
	@Test(priority=2)
	public void GoogleTitle() 
	{
		String title = driver.getTitle();
		System.out.println(title);
		Reporter.log("hi ");
	}
	@Test(priority=1)
	public void logoTest() 
	{
		boolean b=driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/a/img")).isDisplayed();
		
	}

	@AfterMethod
	public void tearDown() 
	{
	driver.quit();	
	}
}
