package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewDemo {
	WebDriver driver;
	@BeforeMethod
	public void setupTest() {
		System.out.println("1"); 
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
  @Test
  public void f() throws InterruptedException {
	  System.out.println("hey");
	  driver.navigate().to("https://www.indiabix.com");
	  //WebElement str = driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/h2"));
	  String str = driver.getTitle();
	  String exp = "Aptitude Questions and Answers - IndiaBIX";
	  Assert.assertEquals(str, exp);
	  Thread.sleep(2000);
  }
  
  @AfterMethod
  public void quitTest()
{
	  System.out.println("2");
	  driver.quit();
	  }

}
