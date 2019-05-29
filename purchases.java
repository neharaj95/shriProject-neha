//sign up to purchase page
package neha;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class purchases {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\New_folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://shriresume.com");
		//driver.navigate().to("http://192.168.1.187:3002");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.className("org_br_btn"));
		click.click();
		  

		WebElement email = driver.findElement(By.xpath("//*[@id='user_email']"));
		email.sendKeys("nehul.raj95@gmail.com");
		WebElement password = driver.findElement(By.id("user_password"));
		password.sendKeys("123456");
		WebElement submit = driver.findElement(By.name("commit"));
		submit.click();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Resume Services")).click();
		  //Blessings
		System.out.println("Error found:1");
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
	    jse8.executeScript("scroll(0, 710);");
	    
	    /*driver.findElement(By.id("//a[@href='/purchases/type/blessing']")).click();
		  driver.findElement(By.xpath("//img[@src='/assets/proceed_checkout_big.png']")).click();
		  WebElement iFrame9=driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']"));
			 driver.switchTo().frame(iFrame9);*/
		  //Grammar
		  driver.findElement(By.xpath("//a[@href='/purchases/type/grammar']")).click();
		  

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
