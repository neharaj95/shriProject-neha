import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(2000);
		Set <String> handler=driver.getWindowHandles();
		
		//to handle window : windowhandler()
		
		Iterator<String> itr=handler.iterator();//for loop store value on basis of index
		//but iterator not work on basis of index but on string
		String parentwindowhandler=itr.next();//pointing to 1st window that is main
		System.out.println("parent window id:"+parentwindowhandler);
		
		
		Thread.sleep(2000);
		String chldwindw=itr.next();// moved to 2nd window that is pop up
		System.out.println("child window id:"+chldwindw);
		driver.switchTo().window(chldwindw);
		//System.out.println("child window url");
		System.out.println(driver.getTitle());//gettitle of pop up
		driver.close();//close pop up
		//for 2nd pop up
		//String secwindow=itr.next();
		//System.out.println("child window id:"+secwindow);
		//driver.switchTo().window(secwindow);
		//System.out.println("2nd window title"+driver.getTitle());//title of 2nd window
		//driver.close();
		driver.switchTo().window(parentwindowhandler);// move to parent window that is main
		System.out.println("parent window title"+driver.getTitle());//title of main window
		//upload file / attachment
		driver.get("https://html.com/input-type-file/");
		//check for type=file should be present
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("/users/neha/Desktop/neha.doc");

	}

}
