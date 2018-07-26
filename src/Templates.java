package neha;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Templates {
	 
	public WebDriver driver;
	
	public Templates(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://shriresume.com/resume-format");
		driver.manage().window().maximize();
		 
		List<WebElement> allEle = driver.findElements(By.xpath("/html/body/div[7]/div/div/div/ul/li"));
		int TotLists = allEle.size();
		System.out.println("Total ele is " + TotLists);
		for (int i = 0; i < 8; i++) {

			String s = allEle.get(i).getText();
			System.out.println("Total eleme is " + s);
			List<WebElement> allEleLists = driver.findElements(By.xpath("/html/body/div[7]/div/div/div/ul/li["+(i+1)+"]/div[2]/a"));
			int TotList = allEleLists.size();
			System.out.println("Total subele is " + TotList);

			if (i >= 2) {
				driver.findElement(By.xpath("/html/body/div[7]/div/div/a[2]")).click();
				Thread.sleep(3000);

			}
			new Templates(driver).DownloadTemplate(allEleLists,i);
			allEle = driver.findElements(By.xpath("/html/body/div[7]/div/div/div/ul/li"));

		}

	}
             
	private void DownloadTemplate(List<WebElement> allEleLists,int i) throws InterruptedException {
			for (int y = 0; y < 2; y++) {
			System.out.println("yzyzyzyzyzyz");
			String s3 = allEleLists.get(y).getText();
			System.out.println("Total eleme is " + s3);
			System.out.println("yzyzyzyzyzyz1");
			allEleLists.get(y).click();
			System.out.println("yzyzyzyzyzyz2");
			Thread.sleep(3000);
			driver.findElement(By.id("checkboxclick")).click();
			//WebElement ele= driver.findElement(By.xpath("//input[contains(@id, 'checkboxclick']"));
			//ele.click();
			System.out.println("yzyzyzyzyzyz3");
			driver.findElement(By.cssSelector(".orange_button.donwldlink"))
					.click();
			driver.navigate().back();
			if (i >= 2) {
				for(int j=2;j<i;j++){
				driver.findElement(By.xpath("/html/body/div[7]/div/div/a[2]")).click();
				Thread.sleep(3000);
				}
			}
			allEleLists = driver.findElements(By.xpath("/html/body/div[7]/div/div/div/ul/li["+(i+1)+"]/div[2]/a"));

		}
	}
}


