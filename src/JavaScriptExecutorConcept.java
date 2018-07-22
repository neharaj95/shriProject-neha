import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://shriresume.com/auth/login");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user_email")).sendKeys("neha@madhulata.com");
		driver.findElement(By.id("user_password")).sendKeys("password");
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input"));
		System.out.println(driver.getTitle());
		flash(loginbtn, driver);
		drawborder(loginbtn, driver);// draw border
		// once border is drawn take screenshot of error/bug
		//write code of screenshot
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("done");
		FileUtils.copyFile(src, new File("/Users/neha/eclipse-workspace/Shriresume/src/bug.png"));
		System.out.println("not ");
		//generate alert
	//	generateAlert(driver, "There is an issue with this page/button/textfield");
		//click on any element by javascript executor----any element can clickable
		// click() func can be used , javascript also can be used
		clickEleByJs(loginbtn, driver);
		//refresh the browser also by using javascript
		driver.navigate().refresh();
		System.out.println("refreshed");
		refreshBrowser(driver);
		//page title by js
		System.out.println(getTitle(driver));
		//get inner text
		System.out.println(getPageInnerText(driver));
	    	//scroll down
		//scrollPageDown(driver);
		
		WebElement link = driver.findElement(By.xpath("//*[@id=\"othe_hel_resces\"]/ul/li[1]/a/strong"));
		scrollIntoView(link,  driver);
		
		

	}
	public static void flash(WebElement element , WebDriver driver)
	{
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		String backgroundcolr = element.getCssValue("backgroundColor");
		
		for(int i=0;i<15;i++)
		{
			System.out.println("color");
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(backgroundcolr,element,driver);
		}
	}

	public static void changeColor(String color,WebElement element ,WebDriver driver)
	{
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	}
	public static void drawborder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	public static void generateAlert(WebDriver driver , String message)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	public static void clickEleByJs(WebElement element,WebDriver driver) 
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);
	}
	public static void refreshBrowser(WebDriver driver)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");// 0 means first history
	}
	public static String getTitle(WebDriver driver) 
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
		
	}
	public static String getPageInnerText(WebDriver driver) 
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String pagetext = js.executeScript("return document.documentElement.innerText").toString();
		return pagetext;
	}
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollIntoView(WebElement element, WebDriver driver) 
	{
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
