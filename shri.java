package neha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shri {
public WebDriver driver;


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\New_folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://192.168.1.164:3000");
		//driver.get("https://shriresume.com");
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 WebElement click = driver.findElement(By.className("org_br_btn"));
		 click.click();
		 
		 shri obj= new shri();
		 obj.signup();
		 
	}

	public void signup(){
		
		driver.findElement(By.id("user_first_name")).sendKeys("N");
		 driver.findElement(By.id("user_last_name")).sendKeys("R");
		 List<WebElement> email=driver.findElements(By.id("user_email"));
		 email.size();
		 System.out.println("no."+email.size());
		 email.get(1).sendKeys("neha08241@madhulata.com");
		
		
		 List<WebElement> pass=driver.findElements(By.id("user_password"));
		 pass.size();
		 System.out.println("no."+pass.size());
		 pass.get(1).sendKeys("password");
		 
		 driver.findElement(By.id("user_password_confirmation")).sendKeys("password");
		 List<WebElement> submit=driver.findElements(By.name("commit"));
		 submit.size();
		 System.out.println("no."+submit.size());
		 submit.get(1).click();
		 
	}

		
		
	}

