package neha;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phoneno {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.navigate().to("https://shriresume.com/");
		  driver.findElement(By.className("org_br_btn")).click();
		  WebElement email = driver.findElement(By.id("user_email"));
		  email.sendKeys("neha@madhulata.com");
		  WebElement password = driver.findElement(By.id("user_password"));
		  password.sendKeys("password");
		  WebElement submit = driver.findElement(By.name("commit"));
		  submit.click();
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//img[@src='/assets/userimgsma.png']")).click();
		  driver.findElement(By.id("change_phone")).click();
		  
		  String MainWindow1=driver.getWindowHandle();
		  System.out.println("error62: ");
			 Set<String> s2 = driver.getWindowHandles();
			 System.out.println("error62: ");
			 Iterator<String> i2=s2.iterator();
			 System.out.println("error62: ");
			 while(i2.hasNext())
			{System.out.println("error62: ");
				 String ChildWindow1=i2.next();
				 {System.out.println("error62: ");
				 if(!MainWindow1.equalsIgnoreCase(ChildWindow1));
				 Thread.sleep(3000);
				 driver.findElement(By.cssSelector(".form_item.emailnw"));
				 System.out.println("error62: ");
				 driver.findElement(By.xpath("//*[@id='phone_shri_new_phone']")).sendKeys("8054426846");
				 System.out.println("error621: ");
				 driver.findElement(By.id("phone_shri_conf_phone")).sendKeys("8054426846");
				 driver.findElement(By.id("phone_current_shri_pwd")).sendKeys("password");
				 System.out.println("error622: ");
				 driver.findElement(By.id("set_conf_change_phone")).click();
				 System.out.println("error623: ");
				 Thread.sleep(3000);
				 //driver.findElement(By.cssSelector("orange_button.crossbtn")).click();
				
				 driver.switchTo().window(MainWindow1);
				 
				 }
			}

			 String MainWindow2=driver.getWindowHandle();
			  System.out.println("error62: ");
				 Set<String> s3 = driver.getWindowHandles();
				 System.out.println("error62: ");
				 Iterator<String> i3=s3.iterator();
				 System.out.println("error62: ");
				 while(i3.hasNext())
				{System.out.println("error62: ");
					 String ChildWindow2=i3.next();
					 {System.out.println("error62: ");
					 if(!MainWindow2.equalsIgnoreCase(ChildWindow2));
					 System.out.println("error625: ");
					 Thread.sleep(3000);
					 driver.findElement(By.className("inner_content"));
					 System.out.println("error6255: ");
					 
					 driver.findElement(By.xpath("//a[contains(@class,'orange_button crossbtn')]")).click();
					 System.out.println("error626: ");
					 
					 driver.switchTo().window(MainWindow2);
					 
					 }
				}
	}

	

}
