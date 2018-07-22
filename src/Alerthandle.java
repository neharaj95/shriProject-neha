import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerthandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//diff b/w deleteAllcookie and deletecookie
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.name("proceed")).click();
		//Handle alert
		//Alert alrt = driver.switchTo().alert();//switch to alert box 
		//System.out.println(alrt.getText());//to print text on console of alert
		//Thread.sleep(5000);//static wait....whole script stop for 5 sec...avoid it
		//alrt.accept();//to click on ok
		//alrt.dismiss();// to cancel
		//dynamic xpath
		//eg:- "//input[@type='submit']"
		
		//driver.get("http://www.spicejet.com/");
		//Actions actn= new Actions(driver); 
		//actn.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("SpiceCash Topup")).click();
		
		//drag and drop
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Actions action= new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();//hover on element 
		//implicit wait-dynamic wait
		driver.get("https://www.ebay.in/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);//giving 40 sec to load the page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//after page is loaded fully but some element is not present yet(ele not found exception remove)  
		//not compulsory that if page is fully loaded means all element also loaded...if element found after 5 sec then rest time will be ignored
		
	}

}
