import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Templates {
	public WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		new Templates().myFunc();

	}

	private void myFunc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		this.driver=driver;
		driver.navigate().to("https://shriresume.com/resume-format");
		driver.manage().window().maximize();
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("scroll(0, 610);");
		List<WebElement> allEle = driver.findElements(By
				.xpath("/html/body/div[7]/div/div/div/ul/li"));
		int TotLists = allEle.size();
		
		System.out.println("Total ele is " + TotLists);
		for (int i = 0; i < 8; i++) {

			String s = allEle.get(i).getText();
			System.out.println("Total eleme is " + s);
			List<WebElement> allEleLists = driver.findElements(By
					.xpath("/html/body/div[7]/div/div/div/ul/li["+(i+1)+"]/div[2]/a"));//avoid using hierarichal(absolute xpath) as div changes
			//driver.findElement(By.linkText("name of link not link url"));//
			int TotList = allEleLists.size();
			System.out.println("Total subele is " + TotList);

			if (i >= 2) {
				driver.findElement(By.xpath("/html/body/div[7]/div/div/a[2]")).click();
				Thread.sleep(3000);

			}
		    DownloadTemplate(allEleLists,i);
		    //driver.navigate().back();
		    allEle = driver.findElements(By.xpath("/html/body/div[7]/div/div/div/ul/li"));
			
			System.out.println(" after donld  " + allEle.size());
		}
	}

	public void DownloadTemplate(List<WebElement> allEleLists,int i) throws InterruptedException {
		for (int y = 0; y < 2; y++) {
			System.out.println("yzyzyzyzyzyz");
			String s3 = allEleLists.get(y).getText();
			System.out.println("Total eleme is " + s3);
			allEleLists.get(y).click();
			driver.findElement(By.xpath("//*[@id='checkboxclick']")).click();//this is relative xpath
			driver.findElement(By.cssSelector(".orange_button.donwldlink"))
					.click();
			driver.navigate().back();
			if (i >= 2) {
				for(int j=2;j<i;j++){
				driver.findElement(By.xpath("/html/body/div[7]/div/div/a[2]"))
						.click();
				Thread.sleep(3000);
				}
			}
			allEleLists = driver.findElements(By
					.xpath("/html/body/div[7]/div/div/div/ul/li["+(i+1)+"]/div[2]/a"));

		}
	}

	}


