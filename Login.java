package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// set the driver
		WebDriverManager.chromedriver().setup();
		
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		
	//Load the url
		driver.get("http://leaftaps.com/opentaps/");
		 
		//Maximize the browser
		driver.manage().window().maximize();
		
		//get the title
		String title = driver.getTitle();
		System.out.println(title);
		
// Enter the username
 WebElement username = driver.findElement(By.id("username"));
 username.sendKeys("DemoSalesManager");
 
 // enter the password
 driver.findElement(By.id("password")).sendKeys("crmsfa");
 //Click on Loginbutton
 driver.findElement(By.className("decorativeSubmit")).click();
 
 //click on CRM/SFA link
 driver.findElement(By.linkText("CRM/SFA")).click();
 //click  lead
 driver.findElement(By.linkText("Leads")).click();
 //click create lead
 driver.findElement(By.linkText("Create Lead")).click();
 
 //enter the company name
 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
 //enter the first name
 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abi");
 //enter the lastname
 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("akr");
 //Click on create lead button
 driver.findElement(By.name("submitButton")).click();
 
 
 //Close the Browser
 //driver.close();
 
 
	}

}
