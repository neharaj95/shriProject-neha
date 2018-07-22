package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Welcome {
	@BeforeMethod
	public void setupTest() {
		System.out.println("134545");                     
		
	}
  @Test
  public void f3() {
	  System.out.println("hey");
  }
  
  @AfterMethod
  public void quitTest()
{
	  System.out.println("2");
	  }

}
