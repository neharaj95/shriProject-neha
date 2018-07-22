import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDynamicSearchSuggestn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	   System.out.println("total number of lists are " +list.size());
	   System.out.println("total ");
	   for(int i=0;i<list.size();i++)
	   {
		   System.out.println(list.get(i).getText());
		   if(list.get(i).getText().contains("java tutorial"))
		   {
			   list.get(i).click();
			   break;
		   }
	   }
//descendant:  submenu
	}

}
