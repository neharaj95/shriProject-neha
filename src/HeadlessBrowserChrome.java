import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserChrome {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		//window size should be = 1400 800 ----impt
		//
		options.addArguments("headless");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.freecrm.com/index.html");
		System.out.println("corect");
		driver.findElement(By.name("username")).sendKeys("neharaj");
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("corect2");
		driver.getTitle();
		System.out.println("corect3"+driver.getTitle());

	}

}
