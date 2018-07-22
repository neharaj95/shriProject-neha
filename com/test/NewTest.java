package com.test;

import org.testng.annotations.Test;

public class NewTest {
	//WebDriver driver;
	
	@BeforeMethod
	public setupTest() {
		System.out.println("1");                     
		
	}
  @Test
  public void f() {
	  System.out.println("hey");
  }
  
  @AfterMethod
  public quitTest()
{
	  System.out.println("2");
	  }
}
