import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessConcept {

	public static void main(String[] args) throws InterruptedException {
		//test w/o opening browser: headless concept , htmlunit
		// browser is not launched : testing is happening behind the scene
		//execution of test cases is very fast
		//so improve the performance
		//limitations: not suitable for action class like mouse movement,double click, drag and drop
		// also called : ghost driver and headless browser
		//PhantomJS --javasript
		
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		//ChromeDriver driver=new ChromeDriver();
		//
		//htmlunitdriver is not available in seleniun 3.x version
		//to use this concept , we need to download htmlunitdriver jar file
		//search "htmlunitdriver jar driver download (github site)
		// add external jar that is htmlunitdriver
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 System.out.println("done1");
		 
		driver.get("https://shriresume.com/auth/login");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user_email")).sendKeys("neha@madhulata.com");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();
		System.out.println(driver.getTitle());
		

	}

}
