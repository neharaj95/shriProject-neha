import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Explicitly wait :for specific element or particular element, page is fully loaded doesn't mean all elements loaded 
				//error appear : element not found 
				// if timeout defined 20 sec , nd if element found after 5 sec then 15 sec ignored but in thread sleep script stop for 20sec
				driver.get("https://www.facebook.com");//w/o https it will show error: org.openqa.selenium.WebDriverException
				//unknown error: unhandled inspector error: {"code":-32000,"message":"Cannot navigate to invalid URL"}
				//it will alunch only browser
				clickOn(driver,driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")),20);// it will wait for element for 20 sec
				//driver.findElement(By.xpath("div[contains(@class,'uiButton uiButtonConfirm')]"));
				//driver.findElement(By.xpath("//input[id='u_0_8']")).click();

	}
	public static void clickOn(WebDriver driver, WebElement locator,int timeout) 
	{
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		
	}

}
