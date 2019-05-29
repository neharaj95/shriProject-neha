package neha;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.UserAndPassword;

public class VisitAllLinks {

	static List<String> linkAlreadyVisited = new ArrayList<String>();
	static List<String> notAllowtoVisit=new ArrayList<String>();
	
    WebDriver driver;
    
    public VisitAllLinks(WebDriver driver){
    	this.driver=driver;
    }
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://shriresume.com");
		driver.get("http://play.ecombazar.com");
		//driver.switchTo().alert();
//		Alert Windowalert = driver.switchTo().alert() ;
//		Windowalert.authenticateUsing(new UserAndPassword("admin","ravi"));
//		
//		driver.switchTo().defaultContent() ;
		
		
		VisitAllLinks.notAllowtoVisit.add("https://shriresume.com/auth/auth/facebook");
		VisitAllLinks.notAllowtoVisit.add("https://shriresume.com/auth/auth/linkedin");
		VisitAllLinks.notAllowtoVisit.add("https://shriresume.com/auth/auth/google_oauth2");
		VisitAllLinks.notAllowtoVisit.add("#");
		new VisitAllLinks(driver).linkTest();
		
		//int[] anArray;
		//anArray= new int[20];
		//anArray[0] = 100;
		
				
	}
	
    public void linkTest() {
        // loop over all the a elements in the page
        for(WebElement link : driver.findElements(By.tagName("a"))) {
            // Check if link is displayed and not previously visited
        	 System.out.println(link.getAttribute("href").trim().toString());
            if (link.isDisplayed() && link.isEnabled() && !notAllowtoVisit.contains(link.getAttribute("href"))
                        && !linkAlreadyVisited.contains(link.getAttribute("href"))) {
                // add link to list of links already visited
                linkAlreadyVisited.add(link.getAttribute("href"));
                System.out.println(link.getText());
                // click on the link. This opens a new page
                try{
                	//WebDriverWait wait = new WebDriverWait(driver, 5);
                	//wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(""));
                	
                    link.click();
                
                }catch(Exception e){
                	System.out.println("Broken link:"+link.getAttribute("href"));
                }
                // call recursiveLinkTest on the new page
                new VisitAllLinks(driver).linkTest();
            }
        }
        driver.navigate().back();
    }
	
		
}


