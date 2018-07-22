import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjRepositry {
	
	static WebDriver driver;//global define

	public static void main(String[] args) throws IOException {
		
		//driver.manage().window().maximize();
		
		
		
		
//it is used to enter data in key nd value form
		// some values like name we are using again nd again
		Properties prop = new Properties();// obj of properties class
		FileInputStream ips= new FileInputStream("/Users/neha/eclipse-workspace/Shriresume/src/Config.properties");
	// path of config.properties (just right click over there that is file)
		prop.load(ips);
		System.out.println(prop.getProperty("name"));//same name (key) write here 
		System.out.println(prop.getProperty("age"));
		String urlstore = prop.getProperty("URL");
		System.out.println(urlstore);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		/*else if(browser.equals("FF")) 
		{
			System.setProperty("webdriver.chrome.driver","/Applications/firefoxdriver");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}*/
		
		driver.get(urlstore);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("name"));
	}

}
