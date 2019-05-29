package neha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Purchase {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.navigate().to("https://shriresume.com/");
		  driver.manage().window().maximize();
		  //driver.get("https://shriresume.com");
		  
		  driver.findElement(By.id("menu-button"));
		  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/ul/li[4]/a")).click();
		  System.out.println("Error found:1");
		  JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		  jse8.executeScript("scroll(0, 810);");
		  //Grammar
		  driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div[3]/div[5]/div/a[2]")).click();
          //driver.findElement(By.xpath("//a[@href='/purchases/type/grammar']")).click();
		  driver.findElement(By.xpath("//img[@src='/assets/proceed_checkout_big.png']")).click();
		 
		
		  
	}

}
