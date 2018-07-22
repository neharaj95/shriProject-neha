import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlBootstrpDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> lists=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		Thread.sleep(2000);
		System.out.println(lists.size());
		
//		for(int i = 0;i<=lists.size();i++)
//		{
//		System.out.println(lists.get(i).getText());
//		if(lists.get(i).getText().contains("Angular"))
//			
//		{
//		   lists.get(i).click();
//		   break;
//		}
//	    }
		
		for(int z = 0;z<lists.size();z++)
		{
			System.out.println(lists.get(z).getText());
			lists.get(z).click();
			
		}
}
}
////List<WebElement> buttoncount = driver.findElements(By.xpath("//input[@class='buttonSecondary smallButton']"));
//"//div[@class='dropdown-menu' and @aria-labelledb-'dropdownMenuButton']//a"