package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	//sequence is very impt like...
	//@BeforeSuite-1
	//@BeforeTest-2
	//@BeforeClass-3
	
	//@BeforeMethod--4
	//@Test
	//@AfterMethod
	
	//@BeforeMethod
	//@Test
	//@AfterMethod
	
	//@AfterClass--5
	//@AfterTest
	
	
//Pre-conditions annotations
	@BeforeSuite
	public void setUp() {
		System.out.println("1");
		
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("2");
	}
	@BeforeClass
	public void login() {
		System.out.println("3");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("4");
	}
	
	//Test cases ---start with @Test
	@Test
	public void testMain() {
		System.out.println("5");
	}
	@Test
	public void testMain2() {
		System.out.println("5.1");
	}
	//Post- conditions ----start with After
	@AfterMethod
	public void logOut() {
		System.out.println("6");
	}
	@AfterTest
		public void delCookies() {
		System.out.println("7");	
		}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("8");
	}
//	@AfterSuite
//	public void testReport() {
//		System.out.println("9");
//	}
	
}
