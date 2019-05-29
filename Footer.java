package neha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Footer {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\New_folder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://shriresume.com/resume-format");
		//driver.navigate().to("http://192.168.1.187:3002/resume-format");
		driver.manage().window().maximize(); 
		
		
					
					 //JavascriptExecutor jse8 = (JavascriptExecutor)driver;
					 //jse8.executeScript("scroll(0, 4610);");
					new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".footer.column.clearfix"))).perform();
					
					List<WebElement> allEle=driver.findElements(By.xpath("/html/body/div[13]/div/div[1]/ul/li/a"));
					int TotLists=allEle.size();
					System.out.println("Total ele is" +TotLists);
					for(int i=0;i<TotLists;i++)
					{
						String s=allEle.get(i).getText();
						System.out.println("Total elem is" + s);
						allEle.get(i).click();
						driver.navigate().back();
						allEle=driver.findElements(By.xpath("/html/body/div[13]/div/div[1]/ul/li/a"));
					}
					
					List<WebElement> allElemnt=driver.findElements(By.xpath("/html/body/div[13]/div/div[2]/ul/li/a"));
					int TotFooter=allElemnt.size();
					System.out.println("Total elements is" +TotFooter);
					for(int x=0;x<TotFooter;x++)
					{

						String s=allElemnt.get(x).getText();
						System.out.println("Total elem is" +s);
						allElemnt.get(x).click();
						driver.navigate().back();
						if(s.equals("FAQ"))
						{
						driver.get("https://shriresume.com/resume-format");
						new Actions(driver).moveToElement(driver.findElement(By.cssSelector(".footer.column.clearfix"))).perform();
						}
						allElemnt=driver.findElements(By.xpath("/html/body/div[13]/div/div[2]/ul/li/a"));
					}

				}

			}

