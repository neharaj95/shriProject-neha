import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("neharaj");
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		//
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		//Method : 1
		//*[@id="vContactsForm"]/table/tbody/tr[3]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]/a
		//*[@id="vContactsForm"]/table/tbody/tr[5]/td[2]/a
		////*[@id="vContactsForm"]/table/tbody/tr[5]/td[3]
		////*[@id="vContactsForm"]/table/tbody/tr[3]/td[2]
		//   //*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]
		/*String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		for(int i=4;i<=6;i++) 
		{
			String name = driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText();
			System.out.println(name);
			if(name.contains("dfdf jnj")) 
			{
			driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();	
			}
		}*/
		
		
		
        driver.findElement(By.xpath("//a[contains(text(),'dfdf jnj')]/parent::td//preceding-sibling::td//input[@name=\"contact_id\"]")).click();
	}

}


//method 2 : very useful ,genric ,fast only make xpath by yourself 
//not require any for loop like to check 1000 of rows every time
// "//a[contains(text(),'test test')]/parent::td//preceding-sibling::td//input[@name="contact_id"]"
// "//a[contains(text(),'n r')]/parent::td//preceding-sibling::td//input[@name="contact_id"]"
//this input is of preceding element that is td here


