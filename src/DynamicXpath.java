import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//diff b/w deleteAllcookie and deletecookie
		//driver.get("https://www.ebay.com/");
		//Thread.sleep(3000);
		//don't use absolute path : performance issue, changed any time , not reliable 
		//name/div[2]/div[11]/add
		// create customize xpath
		// start with double slash then tag name (like input tag) then name of class or some other thing in bracket
		//driver.findElement(By.xpath("//input[class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		//driver.findElement(By.xpath("//div[contains(@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading')]")).sendKeys("java");
		// use contains : id is given but some time page refreshed id is change9dynamic id)
		//driver.findElement(By.xpath("//div[contains(@class,'gh-tb ui-autocomplete-input ui-autocomplete-loading')]")).sendKeys("java");
	    //		driver.findElement(By.xpath("//input[@name='nameofinputbox']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[contains(@id, 'nameofinputbox')]")).sendKeys("java");
		
		//driver.findElement(By.xpath("//input[starts-with(@id, 'idnameofinputbox')]")).sendKeys("java");
		//starts_with(): first word starts with
		
		// id : test_last_7869_test2_t nd 7869 alwaz change when page is refreshed nd rest pattern is same
		//driver.findElement(By.xpath("//input[ends-with(@id, 'test2_t')]")).sendKeys("java");
		//---------------
		//input[@type='submit']
		//input[@type='submit' and @value='login']
		//a[text()='features']
		//a[contains(text(),'features')]
		//button[@type='button' and @class='btn']
		//button[contains(text(),'sign up')]
		//a[text()='Alerts']
		//button[@type='button' and @class='abc']
		//a[(text()='bootstrap')]
		// "//div[@class='dropdown-menu' and @aria-labelledb-'dropdownMenuButton']//a"
		
		//-------------
		
		// for link : check for tag nd it will most of the time <a> that is anchor tag, text is a function and what is written in front of text that will 2nd parameter
		//driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).sendKeys("java");
		
		//what is driver.findElements
		//total links: links are represented with <a> tag
		//List <WebElement> ele =driver.findElements(By.tagName("a"));
		//System.out.println(ele.size());
		
		//for(int i=0;i<ele.size();i++)
		//{
			//ele.get(i);
			//System.out.println(ele.get(i).getText());
		//}
		
		//total input fields: input fields are represented with input tag
		//List <WebElement> inp =driver.findElements(By.tagName("input"));
		
		//total buttons: buttons are represented with 
		//List <WebElement> butns =driver.findElements(By.tagName(""));
		//List<WebElement> buttoncount = driver.findElements(By.xpath("//input[@class='buttonSecondary smallButton']"));
		
		//how to move to other URL
		//diff b/w get and navigate to url 
		driver.get("https://www.google.com/");
		driver.navigate().to("https://amazon.com");//to launch external URl
		//Thread.sleep(3000);
		//driver.navigate().back();//To move back to page
		//Thread.sleep(3000);
		//driver.navigate().forward();//To move forward/next page
		//driver.navigate().refresh();//To refresh the page
		//Take screenshot
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println("done");
		FileUtils.copyFile(src, new File("/Users/neha/eclipse-workspace/Shriresume/src/DynamicXpath.png"));
		System.out.println("not ");
		
		
	
		
	}

}
