package neha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResumeFormat {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://shriresume.com/resume-format");
		//driver.navigate().to("http://192.168.1.187:3002/resume-format");
		
		List <WebElement> ele=driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/div[2]/ul/li/a"));
		int totele=ele.size();
		System.out.println("Total link is:"+ totele);
		
		for(int i=0; i<totele;i++)
		{
			
		  String s=ele.get(i).getText();
		  System.out.println("Total link name:"+ s);
		  ele.get(i).click();
		   Thread.sleep(4000);
		   ele=driver.findElements(By.xpath("/html/body/div[4]/div/div[2]/div[2]/ul/li/a"));
			
		   
		}
		

	}

	}

