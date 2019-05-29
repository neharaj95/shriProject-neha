package neha;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sorting {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  //driver.navigate().to("http://192.168.1.119:3000/");
		  driver.navigate().to("https://shriresume.com/how-it-works");
		  driver.manage().window().maximize();
		  
		  List<WebElement> single=driver.findElements(By.xpath("/html/body/div[22]/div/div[1]/ul/li"));
		  List<String> elements = new LinkedList<String>();
		  int a=single.size();
		  System.out.println("no."+single.size());
		  String str;
		   for (int i=0;i<a;i++)
		   {
			   str= single.get(i).getText();
			   //System.out.println("list are "+ str);
			   
		    
	}
		   for (WebElement e : single)
		   {
			   elements.add(e.getText());
		   }
		   
		   
		   Collections.sort(elements);
		   
		   System.out.println(" list are "+ elements);
		  
		   

}
}
