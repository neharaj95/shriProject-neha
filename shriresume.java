//Shriresume Sign in Page Automation Testing
//Create a resume
//Created By Neha
package neha;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class shriresume {

	public static void main(String[] args)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDriver\\New_folder\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  //driver.navigate().to("");
		  driver.navigate().to("https://abc.com");
		  //driver.navigate().to("");
		  driver.manage().window().maximize();
		  //driver.get("");
		  
		  WebElement click = driver.findElement(By.className("org_br_btn"));
		  click.click();
		 // driver.findElement(By.xpath("//html//body//div[4]//div//div[2]//div[1]//a[2]")).click();
		 //driver.findElements(By.tagName("a"));
		  WebElement email = driver.findElement(By.id("user_email"));
		  email.sendKeys("");
		  WebElement password = driver.findElement(By.id("user_password"));
		  password.sendKeys("");
		  WebElement submit = driver.findElement(By.name("commit"));
		  submit.click();
		 // Preview(driver);
		  //Allimage(driver);
		 //del(driver);
		 //duplicate(driver);
		 
		  
		  /*String MainWindow5=driver.getWindowHandle();
			 Set<String> s16 = driver.getWindowHandles();
			 Iterator<String> i17=s16.iterator();
			 while(i17.hasNext())
			{
				 String ChildWindow=i17.next();
				 {
				 if(!MainWindow5.equalsIgnoreCase(ChildWindow));
				  
				 Thread.sleep(3000);
				 driver.findElement(By.id("closebutton")).click();
			// driver.findElement(By.id("delete_resume_text")).sendKeys("Delete");
			 System.out.println("error62: ");
			 //driver.findElement(By.cssSelector(".orange_button.delete_resume_confirm_btn")).click();
			 Thread.sleep(2000);
			 //driver.findElement(By.cssSelector(".undobtn.btndelte.process_resume_dustbin_delete"));
			 //driver.findElement(By.id("p_delete_text")).sendKeys("Delete");
			// WebElement close_popup=driver.findElement(By.id("cboxClose"));
		     //close_popup.click();
		     driver.switchTo().window(MainWindow5);
			 
				 }
			}*/
		  
		 WebElement resume = driver.findElement(By.xpath("//a[@href='/resume-builder']")); 
		 resume.click();
		 WebElement tem = driver.findElement(By.className("template25"));
		 tem.click();
		 WebElement funcarea = driver.findElement(By.id("resume_functional_area_id"));
		 Select dropdown=new Select(funcarea);
		 dropdown.selectByIndex(1);
		 //dropdown.selectByVisibleText("accounting");
		 WebElement year = driver.findElement(By.id("resume_years"));
		 Select dropdown2 = new Select(year);
		 dropdown2.selectByIndex(2);
		 WebElement month = driver.findElement(By.id("resume_month"));
		 Select dropdown3 = new Select(month);
		 dropdown3.selectByIndex(1);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("scroll(0, 250);");
		 //dropdown4.selectByVisibleText("accountant");
		 //WebElement resname = driver.findElement(By.id("resume_name"));
		 //resname.sendKeys("[Test]");
		 //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 Thread.sleep(6000);
		 WebElement subfuncarea = driver.findElement(By.id("resume_sub_functional_area_id"));
		 Select dropdown4=new Select(subfuncarea);
	     dropdown4.selectByIndex(2);
	     //dropdown4.selectByVisibleText("accountant");
	     System.out.println("Error found: ");
	     JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		 jse2.executeScript("scroll(0, 300);");
		 System.out.println("Error found: ");
		 WebElement enterinfo1 = driver.findElement(By.name("button"));
		 enterinfo1.submit();
		 //Contact Information Page
		 WebElement prefix = driver.findElement(By.id("resume_contact_information_attributes_prefix"));
		 Select dropdown5=new Select(prefix);
		 dropdown5.selectByIndex(1);
		 WebElement fname = driver.findElement(By.id("resume_contact_information_attributes_first_name"));
		 fname.sendKeys("firstname");
		 WebElement lname = driver.findElement(By.id("resume_contact_information_attributes_last_name"));
		 lname.sendKeys("lastname");
		 WebElement add1 = driver.findElement(By.id("resume_contact_information_attributes_address1"));
		 add1.sendKeys("address 1");
		 WebElement add2 = driver.findElement(By.id("resume_contact_information_attributes_address2"));
		 add2.sendKeys("address 2");
		 WebElement country = driver.findElement(By.id("resume_contact_information_attributes_country"));
		 Select dropdown6=new Select(country);
	     dropdown6.selectByIndex(0);
	     Thread.sleep(6000);
	     WebElement state = driver.findElement(By.id("resume_contact_information_attributes_state"));
		 Select dropdown7=new Select(state);
	     dropdown7.selectByIndex(3);
	     WebElement city = driver.findElement(By.id("resume_contact_information_attributes_city"));
		 city.sendKeys("cityname");
		 WebElement pincode = driver.findElement(By.id("resume_contact_information_attributes_pin_code"));
		 pincode.sendKeys("110096");
		 //WebElement countrycode = driver.findElement(By.id("resume_contact_information_attributes_country_code"));
		 //countrycode.sendKeys("+91");
		 WebElement phoneno = driver.findElement(By.id("resume_contact_information_attributes_phonenumber"));
		 phoneno.sendKeys("8054426845");
		 WebElement emailid = driver.findElement(By.id("resume_contact_information_attributes_email"));
		 emailid.sendKeys("neha@madhulata.com");
		 WebElement linkedinid = driver.findElement(By.id("resume_contact_information_attributes_linkedin"));
		 linkedinid.sendKeys("https://www.linkedin.com/in/neha-raj-814a3298");
		 WebElement enterinfo2 = driver.findElement(By.name("button"));
		 enterinfo2.submit();
		 //Profile Page
		 WebElement profilename = driver.findElement(By.id("resume_profile_attributes_profile_name"));
		 profilename.sendKeys("profile name");
		 JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		 jse3.executeScript("scroll(0, 750);");
		 Thread.sleep(3000);
		 WebElement iFrame=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_profile_attributes_description']"));
		 driver.switchTo().frame(iFrame);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("This is Profile Description");
		 driver.switchTo().defaultContent();
		// WebElement check_text= driver.findElement(By.xpath("//div[contains(@class, 'checktext globalbutoncheck capitalizedalgo')]"));
		 //check_text.click();
		 WebElement enterinfo3 = driver.findElement(By.name("button"));
		 enterinfo3.submit();
		 //Career Highlight
		 JavascriptExecutor jse321 = (JavascriptExecutor)driver;
		 jse321.executeScript("scroll(0, 750);");
		 WebElement iFrame2=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_career_highlight_attributes_first_first_col']"));
		 driver.switchTo().frame(iFrame2);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("This is carrer highlight section");
		 driver.switchTo().defaultContent();
		 WebElement enterinfo4 = driver.findElement(By.name("button"));
		 enterinfo4.submit();
		 //Skills
		 WebElement iFrame3=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_skill_attributes_first_first_col']"));
		 driver.switchTo().frame(iFrame3);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Thsi is skill section");
		 driver.switchTo().defaultContent();
		 WebElement enterinfo5 = driver.findElement(By.name("button"));
		 enterinfo5.submit();
		 //Education Page
		 WebElement schoolname = driver.findElement(By.id("resume_educations_attributes_0_school_name"));
		 schoolname.sendKeys("school name 1");
		 WebElement board_affiliation = driver.findElement(By.id("resume_educations_attributes_0_board_affiliation"));
		 board_affiliation.sendKeys("board affiliation 1");
		 JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		 jse4.executeScript("scroll(0, 500);");
		 WebElement countryname = driver.findElement(By.id("resume_educations_attributes_0_country"));
		 Select dropdown8=new Select(countryname);
	     dropdown8.selectByIndex(0);
	     Thread.sleep(3000);
	     WebElement statename = driver.findElement(By.id("resume_educations_attributes_0_state"));
		 Select dropdown9=new Select(statename);
	     dropdown9.selectByIndex(5);
	     WebElement cityname = driver.findElement(By.id("resume_educations_attributes_0_city"));
	     cityname.sendKeys("cityname 1");
	     WebElement degreetype = driver.findElement(By.id("resume_educations_attributes_0_degree_type"));
		 Select dropdown10=new Select(degreetype);
	     dropdown10.selectByIndex(5);
	     WebElement fieldofstudy = driver.findElement(By.id("resume_educations_attributes_0_field_of_study"));
	     fieldofstudy.sendKeys(" field of study 1");
	     WebElement graduation_status = driver.findElement(By.id("resume_educations_attributes_0_graduation_status"));
		 Select dropdown11=new Select(graduation_status);
	     dropdown11.selectByIndex(1);
	     WebElement education_month = driver.findElement(By.id("resume_educations_attributes_0_date_2i"));
		 Select dropdown12=new Select(education_month);
	     dropdown12.selectByIndex(12);
	     WebElement education_year = driver.findElement(By.id("resume_educations_attributes_0_date_1i"));
		 Select dropdown13=new Select(education_year);
	     dropdown13.selectByIndex(13);
	     WebElement marks = driver.findElement(By.id("resume_educations_attributes_0_markes_in_precentage"));
	     marks.sendKeys("85");
	     WebElement division = driver.findElement(By.id("resume_educations_attributes_0_division"));
		 Select dropdown14=new Select(division);
	     dropdown14.selectByIndex(1);
	     
	     //driver.findElement(By.id(""));
	     
	     WebElement enterinfo6 = driver.findElement(By.name("button"));
		 enterinfo6.submit();
		 //Work Experience
		 JavascriptExecutor jse5 = (JavascriptExecutor)driver;
		 jse5.executeScript("scroll(0, 400);");
		 WebElement companyname = driver.findElement(By.id("resume_work_experiences_attributes_0_company_name"));
		 companyname.sendKeys(" Company name 1");
		 WebElement jobtitle = driver.findElement(By.id("resume_work_experiences_attributes_0_job_title"));
		 jobtitle.sendKeys("Job title 1");
		 WebElement workexp_country = driver.findElement(By.id("resume_work_experiences_attributes_0_country"));
		 Select dropdown15=new Select(workexp_country);
	     dropdown15.selectByIndex(0);
	     WebElement workexp_state = driver.findElement(By.id("resume_work_experiences_attributes_0_state"));
		 Select dropdown16=new Select(workexp_state);
	     dropdown16.selectByIndex(2);
	     WebElement workexp_city = driver.findElement(By.id("resume_work_experiences_attributes_0_city"));
	     workexp_city.sendKeys("City Name 1");
	     WebElement workexp_startdate = driver.findElement(By.id("resume_work_experiences_attributes_0_start_date_2i"));
		 Select dropdown17=new Select(workexp_startdate);
	     dropdown17.selectByIndex(7);
	     WebElement workexp_startyear = driver.findElement(By.id("resume_work_experiences_attributes_0_start_date_1i"));
		 Select dropdown18=new Select(workexp_startyear);
	     dropdown18.selectByIndex(17);
	     WebElement workexp_enddate = driver.findElement(By.id("resume_work_experiences_attributes_0_end_date_2i"));
		 Select dropdown19=new Select(workexp_enddate);
	     dropdown19.selectByIndex(7);
	     WebElement workexp_endyear = driver.findElement(By.id("resume_work_experiences_attributes_0_end_date_1i"));
		 Select dropdown20=new Select(workexp_endyear);
	     dropdown20.selectByIndex(23);
	     WebElement iFrame4=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_work_experiences_attributes_0_description']"));
		 driver.switchTo().frame(iFrame4);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Thsi is Work Exprience section");
		 driver.switchTo().defaultContent();
		 WebElement enterinfo7 = driver.findElement(By.name("button"));
		 enterinfo7.submit();
		 //Internship Page
		 JavascriptExecutor jse6 = (JavascriptExecutor)driver;
		 jse6.executeScript("scroll(0, 410);");
		 WebElement intern_comp_name = driver.findElement(By.id("resume_internships_attributes_0_name"));
		 intern_comp_name.sendKeys("Intern Company Name");
		 WebElement intern_position = driver.findElement(By.id("resume_internships_attributes_0_position"));
		 intern_position.sendKeys("Intern Position");
		 WebElement intern_country = driver.findElement(By.id("resume_internships_attributes_0_country"));
		 Select dropdown21=new Select(intern_country);
	     dropdown21.selectByIndex(0);
	     WebElement intern_city = driver.findElement(By.id("resume_internships_attributes_0_city"));
	     intern_city.sendKeys("Intern City Name");
	     WebElement intern_state = driver.findElement(By.id("resume_internships_attributes_0_state"));
		 Select dropdown22=new Select(intern_state);
	     dropdown22.selectByIndex(3);
	     WebElement intern_startmonth = driver.findElement(By.id("resume_internships_attributes_0_start_date_2i"));
		 Select dropdown23=new Select(intern_startmonth);
	     dropdown23.selectByIndex(1);
	     WebElement intern_startyear = driver.findElement(By.id("resume_internships_attributes_0_start_date_1i"));
		 Select dropdown24=new Select(intern_startyear);
	     dropdown24.selectByIndex(11);
	     WebElement intern_endmonth = driver.findElement(By.id("resume_internships_attributes_0_end_date_2i"));
		 Select dropdown25=new Select(intern_endmonth);
	     dropdown25.selectByIndex(2);
	     WebElement intern_endyear = driver.findElement(By.id("resume_internships_attributes_0_end_date_1i"));
		 Select dropdown26=new Select(intern_endyear);
	     dropdown26.selectByIndex(12);
	     WebElement iFrame5=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_internships_attributes_0_description']"));
		 driver.switchTo().frame(iFrame5);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Thsi is Internship section");
		 driver.switchTo().defaultContent();
		 WebElement enterinfo8 = driver.findElement(By.name("button"));
		 enterinfo8.submit();
		 //Training and certifications Section
		 System.out.println("Error found: ");
		 JavascriptExecutor jse7 = (JavascriptExecutor)driver;
		 jse7.executeScript("scroll(0, 410);");
		 WebElement typeoftraining = driver.findElement(By.id("resume_training_certifications_attributes_0_name"));
		 typeoftraining.sendKeys("Training Name");
		 WebElement bestowing_institution = driver.findElement(By.id("resume_training_certifications_attributes_0_institution"));
		 bestowing_institution.sendKeys("Training Institute Name");
		 WebElement training_status = driver.findElement(By.id("resume_training_certifications_attributes_0_training_status"));
		 Select dropdown27=new Select(training_status);
	     dropdown27.selectByIndex(1);
	     WebElement training_year = driver.findElement(By.id("resume_training_certifications_attributes_0_date_1i"));
		 Select dropdown28=new Select(training_year);
	     dropdown28.selectByIndex(18);
	     WebElement enterinfo9 = driver.findElement(By.name("button"));
		 enterinfo9.submit();
		 //Awards And Honors
		 
		 JavascriptExecutor jse8 = (JavascriptExecutor)driver;
		 jse8.executeScript("scroll(0, 610);");
		 // Click on all columns one by one
		/* List<WebElement> allElements=driver.findElements(By.xpath("/html/body/div[4]/form/div[4]/div[4]/div[3]/div[1]/div/span"));
		 int s=allElements.size();
				  System.out.println("no. of span:"+s);
				  for(int i=0;i<=s;i++)
				  {
		              allElements = driver.findElements(By.className("radio"));
				      Thread.sleep(2000);
				      allElements.get(i).click();
				      JavascriptExecutor jse81 = (JavascriptExecutor)driver;
					  jse81.executeScript("scroll(0, 660);");
				      driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
				      driver.switchTo().frame(i);
				      Thread.sleep(3000);
				      driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("This is Work Awards And Honors section");
					  driver.switchTo().defaultContent();
				      
				      
				      
				      }
				  
				  WebElement enterinfo10 = driver.findElement(By.name("button"));
				  enterinfo10.submit();
		 
		 //For two columns )
		 /*driver.findElement(By.xpath("/html/body/div[4]/form/div[4]/div[4]/div[3]/div[1]/div/span[2]")).click();
		 
		 WebElement iFrame6=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_awards_honor_attributes_second_first_col']"));
		 driver.switchTo().frame(iFrame6);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Thsi is Work Awards And Honors section");
		 driver.switchTo().defaultContent();
		 
		 WebElement iFramecol=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_awards_honor_attributes_second_second_col']"));
		 driver.switchTo().frame(iFramecol);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Thsi is Awards And Honors section");
		 driver.switchTo().defaultContent();
		 
		 WebElement enterinfo10 = driver.findElement(By.name("button"));
		 enterinfo10.submit();*/
		 /*JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.promptResponse=prompt(' How many col')");
		 
		 //Taking value from user for columns-in progress
		 //Scanner scan=new Scanner(System.in);
		 //BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		 //Console scan = System.console();
		 System.out.println("Enter many col u want to select: Select a for 1 col and b for 2 col and c for 3 col");
		 String value1=js.read();
		 String value2=js.readLine();
		 String value3=js.readLine();
		 Thread.sleep(2000);
		 if(value1=="a")
		 {
		 driver.findElement(By.id("resume_awards_honor_attributes_col_select_columns_2")).click();;
		 WebElement iFramecol=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, Rich Text Editor, resume_awards_honor_attributes_second_first_col']"));
		 driver.switchTo().frame(iFramecol);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Thsi is Work Awards And Honors section");
		 driver.switchTo().defaultContent(); 
		 }
		 else if(value2=="b")
		 {
			 WebElement col2=driver.findElement(By.id(""));
			 col2.sendKeys("col2"); 
		 }
		 else if(value3=="c")
		 {
			 WebElement col3=driver.findElement(By.id(""));
			 col3.sendKeys("col3"); 
		 }
		 else
		 { */
	//}
		     //For paragraph
			 WebElement iFrame6=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_awards_honor_attributes_first_first_col']"));
			 driver.switchTo().frame(iFrame6);
			 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("This is Work Awards And Honors section");
			 driver.switchTo().defaultContent();
			 WebElement enterinfo10 = driver.findElement(By.name("button"));
			 enterinfo10.submit();
		 
				  
		 //Professional Affiliations
		 JavascriptExecutor jse9 = (JavascriptExecutor)driver;
		 jse9.executeScript("scroll(0, 410);");
		 WebElement iFrame7=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_professional_affliation_attributes_first_first_col']"));
		 driver.switchTo().frame(iFrame7);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Thsi is Professional affiliations");
		 driver.switchTo().defaultContent();
		 WebElement enterinfo11 = driver.findElement(By.name("button"));
		 enterinfo11.submit();
		 //Project Section
		 WebElement project_name = driver.findElement(By.id("resume_projects_attributes_0_name"));
		 project_name.sendKeys("Name of Project");
		 WebElement project_startmonth = driver.findElement(By.id("resume_projects_attributes_0_from_date_2i"));
		 Select dropdown29=new Select(project_startmonth);
	     dropdown29.selectByIndex(3);
	     WebElement project_startyear = driver.findElement(By.id("resume_projects_attributes_0_from_date_1i"));
		 Select dropdown30=new Select(project_startyear);
	     dropdown30.selectByIndex(4);
	     WebElement project_endmonth = driver.findElement(By.id("resume_projects_attributes_0_to_date_2i"));
		 Select dropdown31=new Select(project_endmonth);
	     dropdown31.selectByIndex(4);
	     WebElement project_endyear = driver.findElement(By.id("resume_projects_attributes_0_to_date_1i"));
		 Select dropdown32=new Select(project_endyear);
	     dropdown32.selectByIndex(5);
	     System.out.println("Error found:proj1 ");
	     WebElement iFrame8=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_projects_attributes_0_description']"));
	     driver.switchTo().frame(iFrame8);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("This is Project Section");
		 driver.switchTo().defaultContent();
		 WebElement project_label = driver.findElement(By.id("resume_projects_attributes_0_project_labels_attributes_0_name"));
		 Select dropdown33=new Select(project_label);
	     dropdown33.selectByIndex(3);
	     WebElement project_labeldesc = driver.findElement(By.id("resume_projects_attributes_0_project_labels_attributes_0_description"));
	     project_labeldesc.sendKeys("Description of Label of Project.Description of Label of Project.Description of Label of Project");
		 WebElement enterinfo12 = driver.findElement(By.name("button"));
		 enterinfo12.submit();
		 //Extra Curricular Activities
		 JavascriptExecutor jse10 = (JavascriptExecutor)driver;
		 jse10.executeScript("scroll(0, 450);");
		 WebElement iFrame9=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_extracurricular_activity_attributes_first_first_col']"));
		 driver.switchTo().frame(iFrame9);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("This is Extra Curricular activities Section");
		 driver.switchTo().defaultContent();
		 WebElement enterinfo13 = driver.findElement(By.name("button"));
		 enterinfo13.submit();
		 //Computer Proficiency Page
		 JavascriptExecutor jse11 = (JavascriptExecutor)driver;
		 jse11.executeScript("scroll(0, 450);");
		 WebElement os_name = driver.findElement(By.id("resume_computer_proficiency_attributes_operating_systems_attributes_0_name"));
		 os_name.sendKeys("Name of Operating Systems");
		 WebElement software_name = driver.findElement(By.id("resume_computer_proficiency_attributes_softwares_attributes_0_name"));
		 software_name.sendKeys("Name of Software");
		 WebElement enterinfo14 = driver.findElement(By.name("button"));
		 enterinfo14.submit();
		 //Engineering/Technology Page
		 JavascriptExecutor jse14 = (JavascriptExecutor)driver;
		 jse14.executeScript("scroll(0, 450);");
		 WebElement compt_lang = driver.findElement(By.id("resume_computer_proficiency_attributes_computer_languages_attributes_0_name"));
		 compt_lang.sendKeys("Computer Language Name");
		 WebElement compt_webserver = driver.findElement(By.id("resume_computer_proficiency_attributes_web_servers_attributes_0_name"));
		 compt_webserver.sendKeys("Web Server");
		 WebElement compt_webcomp = driver.findElement(By.id("resume_computer_proficiency_attributes_web_components_attributes_0_name"));
		 compt_webcomp.sendKeys("Web Component Name");
		 WebElement compt_devtool = driver.findElement(By.id("resume_computer_proficiency_attributes_development_tools_attributes_0_name"));
		 compt_devtool.sendKeys("Web development Tool Name");
		 WebElement compt_dbname = driver.findElement(By.id("resume_computer_proficiency_attributes_databases_attributes_0_name"));
		 compt_dbname.sendKeys("Database Name");
		 WebElement compt_netname = driver.findElement(By.id("resume_computer_proficiency_attributes_networks_attributes_0_name"));
		 compt_netname.sendKeys("Network Name");
		 WebElement compt_cmsname = driver.findElement(By.id("resume_computer_proficiency_attributes_cms_attributes_0_name"));
		 compt_cmsname.sendKeys("Content management System Name");
		 WebElement compt_hardwarename = driver.findElement(By.id("resume_computer_proficiency_attributes_hardwares_attributes_0_name"));
		 compt_hardwarename.sendKeys("Hardware Name");
		 WebElement enterinfo15 = driver.findElement(By.name("button"));
		 enterinfo15.submit();
		 //Languages Page
		 JavascriptExecutor jse15 = (JavascriptExecutor)driver;
		 jse15.executeScript("scroll(0, 480);");
		 WebElement languages = driver.findElement(By.id("resume_languages_attributes_0_name"));
		 Select dropdown34=new Select(languages);
	     dropdown34.selectByIndex(5);
	     WebElement enterinfo16 = driver.findElement(By.name("button"));
		 enterinfo16.submit();
		 //Personal Information Page
		 System.out.println("Error found:1 ");
		 JavascriptExecutor jse16 = (JavascriptExecutor)driver;
		 jse16.executeScript("scroll(0, 490);");
		 WebElement add_image= driver.findElement(By.id("upload_image"));
		 System.out.println("Error found:2 ");
		 Thread.sleep(3000);
		 add_image.click();
		 System.out.println("Error found:3 ");
		 String MainWindow=driver.getWindowHandle();
		 Set<String> s1 = driver.getWindowHandles();
		 Iterator<String> i1=s1.iterator();
		 while(i1.hasNext())
		{
			 String ChildWindow=i1.next();
			 {
			 if(!MainWindow.equalsIgnoreCase(ChildWindow));
			 JavascriptExecutor jse17 = (JavascriptExecutor)driver;
			 jse17.executeScript("scroll(0, 10);");	 
			 Thread.sleep(3000);
			 driver.findElement(By.name("resume[personal_information_attributes][avatar]")).sendKeys("E:\\images\\image1.jpg");
		     Thread.sleep(3000);
		     WebElement upload_image=driver.findElement(By.id("submit_button_for_image_upload"));
		     System.out.println("Error found:8 ");
		     Thread.sleep(4000);
		     upload_image.submit();
		     System.out.println("Error found:9");
		     Thread.sleep(7000);
		     WebElement close_popup=driver.findElement(By.id("cboxClose"));
		     close_popup.click();
		     driver.switchTo().window(MainWindow);
		     
		     }
	   }
	
		 WebElement birth_month = driver.findElement(By.id("resume_personal_information_attributes_birthdate_2i"));
		 Select dropdown35=new Select(birth_month);
	     dropdown35.selectByIndex(2);
	     WebElement birth_day = driver.findElement(By.id("resume_personal_information_attributes_birthdate_3i"));
		 Select dropdown36=new Select(birth_day);
	     dropdown36.selectByIndex(1);
	     WebElement birth_year = driver.findElement(By.id("resume_personal_information_attributes_birthdate_1i"));
		 Select dropdown37=new Select(birth_year);
	     dropdown37.selectByIndex(20);
	     WebElement nationality = driver.findElement(By.id("resume_personal_information_attributes_country"));
		 Select dropdown38=new Select(nationality);
	     dropdown38.selectByIndex(0);
	     WebElement gender = driver.findElement(By.id("resume_personal_information_attributes_gender"));
		 Select dropdown39=new Select(gender);
	     dropdown39.selectByIndex(2);
	     WebElement marital_status = driver.findElement(By.id("resume_personal_information_attributes_marital_status"));
		 Select dropdown40=new Select(marital_status);
	     dropdown40.selectByIndex(2);
	     System.out.println("Error found:passport");
	     Thread.sleep(3000);
	     JavascriptExecutor jse171 = (JavascriptExecutor)driver;
		 jse171.executeScript("scroll(0, 510);");	 
	     driver.findElement(By.name("resume[personal_information_attributes][passport_number]")).sendKeys("passport no");
	     Thread.sleep(3000);
	     System.out.println("Error found:passport1 ");
	     JavascriptExecutor jse1711 = (JavascriptExecutor)driver;
		 jse1711.executeScript("scroll(0, 810);");
	     WebElement passport_expiry_date = driver.findElement(By.id("resume_personal_information_attributes_passport_expiry"));
	     passport_expiry_date.click();
	     List<WebElement> alldates=driver.findElements(By.xpath("//*[@id='resume_personal_information_attributes_passport_expiry']"));
	     for(WebElement ele:alldates)
	     {
	    	 String date=ele.getText();
	    	 if(date.equalsIgnoreCase("28"))
	    	 {
	    		 ele.click();
	    		 break;
	    	 }
	    	 ele.sendKeys("13-01-2022");
	     }
	     // passport_expiry_date.sendKeys("13-01-2022");
	     WebElement name_prefix = driver.findElement(By.id("resume_personal_information_attributes_father_name_prefix"));
		 Select dropdown41=new Select(name_prefix);
	     dropdown41.selectByIndex(1);
	     Thread.sleep(2000);
	     WebElement father_name = driver.findElement(By.name("resume[personal_information_attributes][father_name]"));
	     father_name.sendKeys("Name of Father");
		 WebElement signature = driver.findElement(By.id("signature_text"));
		 signature.sendKeys("Neha Raj");
		 WebElement sig_submit = driver.findElement(By.id("signature_text_submit_button"));
		 sig_submit.click();
		 Thread.sleep(9000);
	     WebElement enterinfo17 = driver.findElement(By.name("button"));
		 enterinfo17.submit();
		 //Personal Interests
		 JavascriptExecutor jse17 = (JavascriptExecutor)driver;
		 jse17.executeScript("scroll(0, 490);");	
		 WebElement iFrame10=driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, resume_personal_interest_attributes_first_first_col']"));
		 driver.switchTo().frame(iFrame10);
		 System.out.println("Error found:");
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("This is Personal Interests section");
		 driver.switchTo().defaultContent();
		 WebElement enterinfo18 = driver.findElement(By.name("button"));
		 enterinfo18.submit();
		 //Declaration Section
		 JavascriptExecutor jse181 = (JavascriptExecutor)driver;
		 jse181.executeScript("scroll(0, 580);");	
		 String MainWindow2=driver.getWindowHandle();
		 Set<String> s2 = driver.getWindowHandles();
		 Iterator<String> i2=s2.iterator();
		 while(i2.hasNext())
		{
			 String ChildWindow2=i2.next();
			 {
			 if(!MainWindow2.equalsIgnoreCase(ChildWindow2));
			 JavascriptExecutor jse18 = (JavascriptExecutor)driver;
			 jse18.executeScript("scroll(0, 580);");	 
			 Thread.sleep(3000);
			 WebElement decl=driver.findElement(By.id("dec_statement_atag"));
			 decl.click();
		     Thread.sleep(2000);
		     WebElement radio1=driver.findElement(By.name("resume[declaration_statement_attributes][statement]"));
		     radio1.click();
		     Thread.sleep(3000);
		     WebElement decl_save = driver.findElement(By.id("submit_dec_form_statement"));
		     decl_save.submit();
		     driver.switchTo().window(MainWindow);
		     
		     }
	   }
		 String MainWindow3=driver.getWindowHandle();
		 Set<String> s3 = driver.getWindowHandles();
		 Iterator<String> i3=s3.iterator();
		 while(i3.hasNext())
		{
			 String ChildWindow3=i3.next();
			 {
			 if(!MainWindow3.equalsIgnoreCase(ChildWindow3));
			 JavascriptExecutor jse19 = (JavascriptExecutor)driver;
			 jse19.executeScript("scroll(0, 580);");	 
			 Thread.sleep(3000);
			 WebElement add_location=driver.findElement(By.id("dec_location_atag"));
			 add_location.click();
		     Thread.sleep(2000);
		     WebElement loc_radio1=driver.findElement(By.name("resume[declaration_statement_attributes][declaration_location]"));
		     loc_radio1.click();
		     Thread.sleep(3000);
		     WebElement loc_save = driver.findElement(By.id("submit_dec_form_location"));
		     loc_save.submit();
		     driver.switchTo().window(MainWindow);
		     
		     }
	   }
		 Thread.sleep(2000);
		 driver.findElement(By.id("resume_declaration_statement_attributes_use_my_picture")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("resume_declaration_statement_attributes_use_my_qrcode")).click();
		 Thread.sleep(2000);
		 //driver.findElement(By.name("resume[declaration_statement_attributes][use_my_signature]")).click();
		 WebElement enterinfo19 = driver.findElement(By.name("button"));
		 enterinfo19.submit();
		 //Reference section
		 WebElement ref_prefix = driver.findElement(By.id("resume_references_attributes_0_prefix"));
		 Select dropdown42=new Select(ref_prefix);
		 dropdown42.selectByIndex(1);
		 WebElement ref_fname = driver.findElement(By.id("resume_references_attributes_0_first_name"));
		 ref_fname.sendKeys("firstname");
		 WebElement ref_lname = driver.findElement(By.id("resume_references_attributes_0_last_name"));
		 ref_lname.sendKeys("lastname");
		 WebElement ref_org = driver.findElement(By.id("resume_references_attributes_0_company_organization"));
		 ref_org.sendKeys("Name of organization");
		 WebElement ref_jobtitle = driver.findElement(By.id("resume_references_attributes_0_job_title"));
		 ref_jobtitle.sendKeys("Name of job/title");
		 WebElement ref_add1 = driver.findElement(By.id("resume_references_attributes_0_address1"));
		 ref_add1.sendKeys("Address 1");
		 WebElement ref_add2 = driver.findElement(By.id("resume_references_attributes_0_address2"));
		 ref_add2.sendKeys("Address 2");
		 WebElement ref_countryname = driver.findElement(By.id("resume_references_attributes_0_country"));
		 Select dropdown43=new Select(ref_countryname);
	     dropdown43.selectByIndex(0);
	     WebElement ref_city = driver.findElement(By.id("resume_references_attributes_0_city"));
	     ref_city.sendKeys("City name 1");
	     WebElement ref_state = driver.findElement(By.id("resume_references_attributes_0_state"));
		 Select dropdown44=new Select(ref_state);
	     dropdown44.selectByIndex(6);
	     WebElement ref_pincode = driver.findElement(By.id("resume_references_attributes_0_pincode"));
	     ref_pincode.sendKeys("110098");
	     WebElement ref_phoneno = driver.findElement(By.id("resume_references_attributes_0_phonenumber"));
	     ref_phoneno.sendKeys("8054426845");
		 WebElement ref_emailid = driver.findElement(By.id("resume_references_attributes_0_email"));
		 ref_emailid.sendKeys("neha@madhulata.com");
		 WebElement enterinfo20 = driver.findElement(By.name("button"));
		 enterinfo20.submit();
		 Thread.sleep(2000);
		 WebElement enterinfo21 = driver.findElement(By.name("button"));
		 enterinfo21.submit();
		 WebElement download_pdf = driver.findElement(By.cssSelector(".donload_btn "));
		 download_pdf.click();
		 
		 	 
		 		 


	}


	private static void Preview(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.cssSelector("body > div.container.clearfix.resumeshow > div.cre_purch_buy_resu > ul > li:nth-child(1) > div > div.left_con_gr > div > div > ul > li:nth-child(4) > a")).click();
		  //WebElement tembutton=driver.findElement(By.xpath("//body[contains(@class,'orange_buttontempltebtn')]"));
		  WebElement tembutton=driver.findElement(By.cssSelector(".orange_button.templtebtn"));
		  tembutton.click();
		  System.out.println("Error found:1 ");
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
			 jse.executeScript("scroll(0, 380);");
			 System.out.println("Error found:2 ");
		  List<WebElement> allElements =driver.findElements(By.xpath("/html/body/div[4]/div[5]/div[2]/ul/li"));
			 System.out.println("Error found: 3");
		 // List<WebElement> allElements = driver.findElements(By.xpath("//body[contains(@class,'click')]"));
		  int s=allElements.size();
		  System.out.println("no. of lists:"+s);
		  for(int i=0;i<=s;i++)
		  {
			  
			  System.out.println("Error found: 5");
		      allElements = driver.findElements(By.className("click"));
		      Thread.sleep(2000);
		      allElements.get(i).click();
		      System.out.println("Error found: 6");
		      //driver.findElement(By.className("//body[contains(@class'orange_button downlbtn')]")).click();
		      driver.findElement(By.cssSelector(".orange_button.downlbtn")).click();
		      System.out.println("Error found: 7");
		      WebElement download_pdf = driver.findElement(By.cssSelector(".donload_btn "));
		      download_pdf.click();
		      driver.navigate().back();
		      Thread.sleep(2000);
		      WebElement tembutton1=driver.findElement(By.cssSelector(".orange_button.templtebtn"));
			  tembutton1.click();
		      Thread.sleep(2000);
		      //allElements.get(i).click();
		  }
	}

	


	private static void Allimage(ChromeDriver driver) {
		// TODO Auto-generated method stub
		
		List<WebElement> allimages = driver.findElements(By.tagName("img"));
		int totimages=allimages.size();
		 System.out.println("Total images: "+totimages);
		 int counter=0;
		 for(WebElement image:allimages)
	        {
	            if(image.isDisplayed())
	            {
	                counter++;
	                System.out.println(image.getAttribute("alt"));
	            }
	            
	        }
		 
		driver.close();
	}


	private static void del(ChromeDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul/li"));
		 int total_resume=allElements.size();
		 System.out.println("Total Resume: "+total_resume);
		 
		 WebElement setting=driver.findElement(By.xpath("//div[contains(@class,'setting_icon')]"));
		 System.out.println("error1: ");
		 setting.click();
		 
		 List<WebElement> setting_Elements = driver.findElements(By.cssSelector("li.resumesshow:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(4)>div:nth-child(2)>ul:nth-child(2)>li"));
		 int total_icons=setting_Elements.size();
		 System.out.println("Total Icon: "+total_icons);
		
		 for(int x=1;x<total_icons-1;x++){
			 setting_Elements.get(x+1).click();
			 Thread.sleep(7000);
			 
			 List<WebElement> Elementsdel = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul/li"));
			 System.out.println("error6531: ");
			 Thread.sleep(2000);
			 int finalresume=Elementsdel.size();
			 System.out.println("error6532: ");
			 System.out.println("Total Resume:"+finalresume);
			 System.out.println("error6533: ");
			 int final_resumedash=finalresume+1;
			 System.out.println("error6534: ");
			 if(total_resume==final_resumedash)
			 {
				 System.out.println("Works fine1");
			 }
		 }
	}


	private static void duplicate(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		//count no. of resume
		 List<WebElement> allElements = driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul/li"));
		 int total_resume=allElements.size();
		 System.out.println("Total Resume: "+total_resume);
		 
		//delete resume 
		 Thread.sleep(2000);
		 WebElement setting=driver.findElement(By.xpath("//div[contains(@class,'setting_icon')]"));
		 System.out.println("error1: ");
		 setting.click();
		 System.out.println("error2: ");
		 List<WebElement> setting_Elements = driver.findElements(By.cssSelector("li.resumesshow:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(4)>div:nth-child(2)>ul:nth-child(2)>li"));
		 int total_icons=setting_Elements.size();
		 System.out.println("Total Icon: "+total_icons);
		 for(int x=1;x<total_icons-1;x++)
		 {
			 System.out.println("error11: ");
		 /*Actions actions = new Actions(driver);
		 System.out.println("error12: ");
		 actions.moveToElement((WebElement) setting_Elements);
		 System.out.println("error13: ");
		 actions.sendKeys();
		 System.out.println("error14: ");
		 actions.build().perform();*/
		 System.out.println("error15: ");
		 setting_Elements.get(x+2).click();
		 System.out.println("error61: ");
		 //switch to pop up
		 //Alert al=driver.switchTo().alert();
		 String MainWindow=driver.getWindowHandle();
		 Set<String> s1 = driver.getWindowHandles();
		 Iterator<String> i1=s1.iterator();
		 while(i1.hasNext())
		{
			 String ChildWindow=i1.next();
			 {
			 if(!MainWindow.equalsIgnoreCase(ChildWindow));
			  
			 Thread.sleep(3000);
		 driver.findElement(By.id("delete_resume_text")).sendKeys("Delete");
		 System.out.println("error62: ");
		 driver.findElement(By.cssSelector(".orange_button.delete_resume_confirm_btn")).click();
		 Thread.sleep(2000);
		 //driver.findElement(By.cssSelector(".undobtn.btndelte.process_resume_dustbin_delete"));
		 //driver.findElement(By.id("p_delete_text")).sendKeys("Delete");
		// WebElement close_popup=driver.findElement(By.id("cboxClose"));
	     //close_popup.click();
	     driver.switchTo().window(MainWindow);
		 
			 }
		}
		 //To undo
		//driver.findElement(By.cssSelector(".undobtn.btndelte.process_resume_dustbin"));
		 //To delete
		 System.out.println("error63: ");
		 driver.findElement(By.cssSelector(".undobtn.btndelte.process_resume_dustbin_delete")).click();
		 System.out.println("error64: ");
		 //Alert al1=driver.switchTo().alert();
		 System.out.println("error65: ");
		 Thread.sleep(2000);
		 String MainWindow1=driver.getWindowHandle();
		 Set<String> s2 = driver.getWindowHandles();
		 Iterator<String> i2=s2.iterator();
		 while(i2.hasNext())
		{
			 String ChildWindow1=i2.next();
			 {
			 if(!MainWindow1.equalsIgnoreCase(ChildWindow1));
			 System.out.println("error651: ");
		 driver.findElement(By.id("p_delete_text")).sendKeys("Delete");
		 System.out.println("error652: ");
		 driver.findElement(By.id("conf_prm_del_resume")).click();
		 System.out.println("error653: ");
		 //al1.accept();
		 driver.switchTo().defaultContent();
		  }
		}
		 
		//count no. of resume
		 Thread.sleep(2000);
		 List<WebElement> Elementsdel = driver.findElements(By.xpath("/html/body/div[5]/div[2]/ul/li"));
		 System.out.println("error6531: ");
		 Thread.sleep(2000);
		 int finalresume=Elementsdel.size();
		 System.out.println("error6532: ");
		 System.out.println("Total Resume:"+finalresume);
		 System.out.println("error6533: ");
		 int final_resumedash=finalresume-1;
		 System.out.println("error6534: ");
		 if(total_resume==final_resumedash)
		 {
			 System.out.println("Works fine1");
		 }
		 
	 }
		 
	}
}
