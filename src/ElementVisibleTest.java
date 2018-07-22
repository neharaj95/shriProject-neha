import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		/*driver.get("https://shriresume.com/auth/login");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		//1. isDisplayed() method :applicable for all the elements
		boolean b1 = driver.findElement(By.xpath("//*[@id=\'new_user\']/div[3]/input")).isDisplayed();//for submit button
		//if submit button is available on page then it will return true
		System.out.println(b1);// if present return true else false*/
		
		//2. isEnabled() method //element is present but disabled then we use it: primarily used for buttons
		// to verify if the element is enabled or disabled
		//method is used to verify presence of a webelement within webpage. returns true if the specified 
		// web elemnt is present else false
		driver.get("https://www.freecrm.com/register/");
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);// if enabled return true else false
		
		// select agree to checkbox then button 
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);// if enabled return true else false
		
		// 3 isSelected() method : only applicable for check box , drop down , radio button
		//if the element is selected or not
		//driver.findElement(By.name("agreeTerms")).isSelected();
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);// if enabled return true else false that is true here 
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);// if enabled return true else false that is true here 
		
		
	}

}
