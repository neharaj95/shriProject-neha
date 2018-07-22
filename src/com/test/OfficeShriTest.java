package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OfficeShriTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
	}
	@Test
	public void logInPage() throws InterruptedException{
		driver.navigate().to("https://office.shriresume.com/user");
		System.out.println("Title is" + driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("awijeet@me.com");
		driver.findElement(By.id("password")).sendKeys("password");
		WebElement ele =driver.findElement(By.xpath("//button[contains(@class,'btn btn-success')]"));
		ele.click();
		
		//driver.findElement(By.name("Login")).click();
		Thread.sleep(4000);
		String exp = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div[4]/h1")).getText();
		//String str= "Dashboard";
		Assert.assertEquals(exp,"Dashboard");
		//----- Lists verification------
//		WebElement eleLists= driver.findElement(By.xpath("//div[contains(@class,'logo_box'/ul/li[2]/a)]"));
//		eleLists.click();
//		Thread.sleep(3000);
		//System.out.println("Lists are " +eleLists.getText());
		driver.findElement(By.xpath("//ul/li[2]/a")).click();
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);
		System.out.println("true");
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[contains(@class,'inner-drop_list')]"));
		driver.findElement(By.xpath("//input[@type='radio']"));
		driver.findElement(By.xpath("//span[contains(@class,'fillor')]/a")).click();
		Thread.sleep(3000);
		System.out.println("true2");
		Thread.sleep(3000);
		
	}
   
	@AfterMethod
	public void CloseBrowser(){
		driver.quit();
		
		
	}

}
