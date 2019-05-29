package neha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Duplicate {
	
	public void duplicate(WebDriver driver) throws InterruptedException
	{
	//check title Dashboard
	String actual_title=driver.getTitle();
	System.out.println("Title is: "+actual_title);
	//count no. of resume
	List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul/li"));
    int total_resume=allElements.size();
	System.out.println("Total Resume: "+total_resume);
	//click on setting icon
	driver.findElement(By.xpath("//body[contains(@class,'setting_icon')]")).click();
	//click on duplicate
	List<WebElement> setting_Elements = driver.findElements(By.cssSelector("li.resumesshow:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(4)>div:nth-child(2)>ul:nth-child(2)>li"));
	 int total_icons=setting_Elements.size();
	 System.out.println("Total Icon: "+total_icons);
	 for(int x=1;x<=total_icons-2;x++)
	 {
	 Actions actions = new Actions(driver);
	 actions.moveToElement((WebElement) setting_Elements);
	 actions.sendKeys();
	 actions.build().perform();
	 setting_Elements.get(x+1).click();
	 Thread.sleep(3000);
	 
	 }
	//count current resume
	 List<WebElement> Elements_after_dup = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul/li"));
	 int resume_after_dup=Elements_after_dup.size();
	 System.out.println("Total Resume: "+resume_after_dup);
	 int final_resume=resume_after_dup+1;
	 if(total_resume==final_resume)
	 {
		 System.out.println("Duplicate done");
	 }
	 

}
}