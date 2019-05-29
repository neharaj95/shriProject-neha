package neha;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Delete {

	public void delete(WebDriver driver){
	//count no. of resume
	 List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul/li"));
	 int total_resume=allElements.size();
	 System.out.println("Total Resume: "+total_resume);
	 
	//delete resume 
	 driver.findElement(By.xpath("//body[contains(@class,'setting_icon')]")).click();
	 List<WebElement> setting_Elements = driver.findElements(By.cssSelector("li.resumesshow:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(4)>div:nth-child(2)>ul:nth-child(2)>li"));
	 int total_icons=setting_Elements.size();
	 System.out.println("Total Icon: "+total_icons);
	 for(int x=0;x<=total_icons;x++)
	 {
	 Actions actions = new Actions(driver);
	 actions.moveToElement((WebElement) setting_Elements);
	 actions.sendKeys();
	 actions.build().perform();
	 setting_Elements.get(x+2).click();
	 //switch to pop up
	 Alert al=driver.switchTo().alert();
	 driver.findElement(By.id("delete_resume_text")).sendKeys("Delete");
	 al.accept();
	 driver.switchTo().defaultContent();
	 //To undo
	driver.findElement(By.cssSelector(".undobtn.btndelte.process_resume_dustbin"));
	 //To delete
	 driver.findElement(By.cssSelector(".undobtn.btndelte.process_resume_dustbin_delete"));
	 Alert al1=driver.switchTo().alert();
	 driver.findElement(By.id("p_delete_text")).sendKeys("Delete");
	 al1.accept();
	 driver.switchTo().defaultContent();
	  }
	//count no. of resume
	 List<WebElement> Elements_after_del = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul/li"));
	 int resume_after_del=Elements_after_del.size();
	 System.out.println("Total Resume: "+resume_after_del);
	 int final_resume=resume_after_del-1;
	 if(total_resume==final_resume)
	 {
		 System.out.println("Works fine");
	 }
	 
	}
}
