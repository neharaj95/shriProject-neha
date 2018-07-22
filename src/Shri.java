import org.openqa.selenium.chrome.ChromeDriver;

public class Shri {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://shriresume.com/resume-format");
		//driver.get("https://shriresume.com");
		 driver.manage().window().maximize();
		

	}

}
