package neha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header {

public WebDriver driver;
	
	public Header(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\New_folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://shriresume.com/resume-format");
		//driver.navigate().to("http://192.168.1.187:3002/resume-format");
		driver.manage().window().maximize(); 
		List<WebElement> AllHeader =driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div[2]/ul/li"));
		int total=AllHeader.size();
		System.out.println("all links are " +total);
		
		for(int i=0;i<total;i++)
		{
			String s=AllHeader.get(i).getText();
			System.out.println("all links name are " +s);
			AllHeader.get(i).click();
			Thread.sleep(3000);
			AllHeader =driver.findElements(By.xpath("/html/body/div[3]/div/div[2]/div[2]/ul/li"));
		}
		
		driver.findElement(By.xpath("/html/body/div[2]/div/a")).click();
		
		}
	

	}


