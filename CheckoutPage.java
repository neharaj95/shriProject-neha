package neha;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\New_folder\\chromedriver_win32\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.navigate().to("https://shriresume.com");
		 driver.manage().window().maximize();
		 //Log In
		 WebElement click = driver.findElement(By.className("org_br_btn"));
		 click.click();
		 WebElement email = driver.findElement(By.id("user_email"));
		 email.sendKeys("nehulraj95@gmail.com");
		 WebElement password = driver.findElement(By.id("user_password"));
		 password.sendKeys("123456");
		 WebElement submit = driver.findElement(By.name("commit"));
		 submit.click();
		 // Sign UP
//		 driver.findElement(By.id("user_first_name")).sendKeys("N");
//		 driver.findElement(By.id("user_last_name")).sendKeys("R");
//		 List<WebElement> email1=driver.findElements(By.id("user_email"));
//		 email1.size();
//		 System.out.println("no."+email1.size());
//		 email1.get(1).sendKeys("r2sa4pu6f444ha@madhulata.com");
//		
//		 driver.findElement(By.xpath("//*[@id='user_mobile']")).sendKeys("8054426845");
//		 List<WebElement> pass=driver.findElements(By.id("user_password"));
//		 pass.size();
//		 System.out.println("no."+pass.size());
//		 pass.get(1).sendKeys("password");
//		 
//		 driver.findElement(By.id("user_password_confirmation")).sendKeys("password");
//		 List<WebElement> submit1=driver.findElements(By.name("commit"));
//		 submit1.size();
//		 System.out.println("no."+submit1.size());
//		 submit1.get(1).click();
		 driver.findElement(By.linkText("Resume Services")).click();
		 Thread.sleep(2000);
		 JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		 jse3.executeScript("scroll(0, 850);");
		 driver.findElement(By.xpath("//a[@href='/purchases/type/grammar']")).click();
		 WebElement membershipDays = driver.findElement(By.id("membership_days"));
		 Select dropdown6=new Select(membershipDays);
	     dropdown6.selectByIndex(2);
	     Thread.sleep(4000);
         
	     driver.findElement(By.xpath("//img[@src='/assets/proceed_checkout_big.png']")).click();
		  

		  String MainWindow=driver.getWindowHandle();
			 Set<String> s1 = driver.getWindowHandles();
			 Iterator<String> i1=s1.iterator();
			 while(i1.hasNext())
			{
				 String ChildWindow=i1.next();
				 {
				 if(!MainWindow.equalsIgnoreCase(ChildWindow));
				  

				 Thread.sleep(3000);
				 WebElement fr=driver.findElement(By.xpath("/html/body/div[3]/iframe"));
				  System.out.println("Error found:modal");
				 //allinks.get(x).click();	
				  driver.switchTo().frame(fr);
				 Thread.sleep(2000);
				 System.out.println("Error found window:");
				 driver.findElement(By.id("container"));
				 System.out.println("Error found window:1");
				 driver.findElement(By.xpath("//*[@id=\'modal\']"));
				 System.out.println("Error found window:2");
				 driver.findElement(By.id("contact")).clear();
				 driver.findElement(By.id("contact")).sendKeys("8054426845");
			     Thread.sleep(1000);
			     driver.findElement(By.id("email")).clear();
				 driver.findElement(By.id("email")).sendKeys("neha@madhulata.com");
				 System.out.println("Error found window:3");
				 driver.findElement(By.id("payment-options"));
				 System.out.println("Error found window:4");
				 driver.findElement(By.xpath("//*[@id=\'payment-options\']/div[2]")).click();
				 driver.findElement(By.id("form-netbanking"));
				 System.out.println("Error found window:5");
				 driver.findElement(By.xpath("//*[@id=\'netb-banks\']/div[2]"));
				 System.out.println("Error found window:6");
				 //WebElement rd= //
				 //driver.findElement(By.id("bank-radio-HDFC"));
				 //rd.click();
				 //driver.findElement(By.xpath("//*[@id=\'bank-radio-HDFC\']"));
				 

				 //List<WebElement>radioButton = driver.findElements(By.id("netb-banks"));
				 List<WebElement>radioButton = driver.findElements(By.xpath("//*[@id='netb-banks']"));
				 System.out.println(radioButton.size());
				 System.out.println("Error found window:612");
				 for(int i=0;i<radioButton.size();i++)
				 {
					 System.out.println("Error found window:613");
					 driver.findElement(By.id("bank-radio-SBIN")).isSelected();
					 System.out.println("Error found window:614select");
					 System.out.println(radioButton.get(i).getText());
					 radioButton.get(i).click();
					 
					 System.out.println("Error found window:614");
				 }
				 driver.findElement(By.id("footer")).click();
				 System.out.println("Error found window:Done");
				 /*System.out.println("Error found window:61");
				 driver.findElement(By.id("bank-radio-SBIN")).isSelected();
				 driver.findElement(By.id("bank-radio-SBIN")).click();
					 System.out.println("Error found window:712");
			
				 System.out.println("Error found window:7");*/
		         driver.switchTo().window(MainWindow);
			 

				 }

	     

		 
		
	}

 }
}
