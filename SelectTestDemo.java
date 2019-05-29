package neha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTestDemo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\New_folder\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.navigate().to("https://shriresume.com");
		 WebElement click = driver.findElement(By.className("org_br_btn"));
		 click.click();
		 WebElement email = driver.findElement(By.id("user_email"));
		  email.sendKeys("neha@madhulata.com");
		  WebElement password = driver.findElement(By.id("user_password"));
		  password.sendKeys("123456");
		  WebElement submit = driver.findElement(By.name("commit"));
		  submit.click();
		  WebElement resume = driver.findElement(By.xpath("//a[@href='/resume-builder']")); 
			 resume.click();
			 WebElement tem = driver.findElement(By.className("template2"));
			 tem.click();
			 WebElement funcarea = driver.findElement(By.id("resume_functional_area_id"));
			 Select dropdown=new Select(funcarea);
			 Thread.sleep(3000);
			 dropdown.selectByIndex(1);
			 Thread.sleep(3000);
			 dropdown.selectByValue("Accounting");
			 //dropdown.getAllSelectedOptions().size();
			 System.out.println("size " + dropdown.getAllSelectedOptions().size());
			 //List<WebElement> al= funcarea.
			 
			 driver.quit();


	}

}
