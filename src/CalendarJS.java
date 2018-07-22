import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalendarJS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shriresume.com");
		WebElement click = driver.findElement(By.className("org_br_btn"));
		click.click();
		WebElement email = driver.findElement(By.xpath("//*[@id='user_email']"));
		email.sendKeys("neha@madhulata.com");
		WebElement password = driver.findElement(By.id("user_password"));
		password.sendKeys("password");
		WebElement submit = driver.findElement(By.name("commit"));
		submit.click();
		
		driver.findElement(By.className("orange_button")).click();
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("scroll(0, 500);");
		driver.findElement(By.id("left_menu"));
		driver.findElement(By.xpath("//*[@id='left_menu']/ul/li[16]")).click();
		//driver.findElement(By.xpath("//body[contains(@class,'ajax_submit_link personal_information')]")).click();
	    String dateVal = "30-12-2024";
		WebElement date = driver.findElement(By.id("resume_personal_information_attributes_passport_expiry"));
	    selectDateByJS(driver,date,dateVal);
	    
	}
       public static void selectDateByJS(WebDriver driver,WebElement element , String dateVal) 
       {
    	   JavascriptExecutor js = ((JavascriptExecutor)driver);
    	   js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
    	   
    	  
    	   
       }
}




