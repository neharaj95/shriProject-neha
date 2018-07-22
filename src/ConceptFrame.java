import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class ConceptFrame {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		//System.setProperty("webdriver.gecko.driver","/Applications/geckodriver");//for firefox browser
		//WebDriver is an interface 
		//ChromeDriver() is a class which is implementing webdriver
		//ChromeDriver driver=new ChromeDriver();//Till this code it will launch browser
		WebDriver driver= new SafariDriver();//allow remote automation from developer in safari browser in preferences
		driver.get("https://shriresume.com/resume-format");
		//driver.navigate().to("https://shriresume.com");
		 String title=driver.getTitle();// to get title of page that shows on tab
		System.out.println("title is "+title);
		//validation: expected and actual output
		if(title.equals("CV Maker - Create Resume Now"))
				{
			System.out.println("Correct title");
				}
		else 
		{
			System.out.println("Not Correct title");
		}
		
		System.out.println(driver.getCurrentUrl());//give current url
		//System.out.println(driver.getPageSource());// give full page source
		driver.quit();//it close the current window(browser)
		 driver.manage().window().maximize();
		 //driver.wait(40);
		 //select from dropdown list
		 Select selct= new Select(driver.findElement(By.id("")));
		 selct.selectByVisibleText("");
		 
		 
		 
		 driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 System.out.println("done1");
		 driver.findElement(By.id("jivo-iframe-container"));
		 //Thread.sleep(6000);
		 driver.findElement(By.id("jivo-iframe-container")).click();
		 System.out.println("done2");
		 driver.switchTo().frame("jivo_container");
		 System.out.println("done3");
		 driver.findElement(By.id("jivo_container")).click();
		 System.out.println("done333");
		 driver.findElement(By.id("jivo-iframe-container")).click();
		 System.out.println("done33");
		 driver.findElement(By.id("introduce-caption"));
		 System.out.println("done4");

	}

}
