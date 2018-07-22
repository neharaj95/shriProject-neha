import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarHandle {

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
		
		String date = "32-May-2018";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select  = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1  = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		Thread.sleep(3000);

		//Select select2  = new Select(driver.findElement(By.name("")));
		//select.selectByVisibleText(month);
		
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]           
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]
		//driver.switchTo().frame("leftpanel");
		//driver.switchTo().frame("mainpanel");
		String beforeXpath= "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";
		boolean flag=false;
		final int totalWeekDays=7;
		String dayVal=null;
		for(int rowNum=2;rowNum<=7;rowNum++) {
			for(int colNum=1;colNum<=totalWeekDays;colNum++)
		{
			try {	
		    dayVal= driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
			}catch(NoSuchElementException e) {
				 System.out.println("Please enter valid date");
				 flag = false;
				 break;
			}
		    System.out.println(dayVal);
		    if(dayVal.equals(day)) 
		    {
		    	driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
		    	flag = true;
		    	break;
		    }
		}
		if(flag)
		{
		break;	
		}
		}
		

		
		
	}

}
