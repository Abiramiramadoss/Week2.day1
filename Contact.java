package week2.day1.ass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Abi");
         driver.findElement(By.id("lastNameField")).sendKeys("Akr");
		 driver.findElement(By.name("submitButton")).click();
		
		
		 String FirstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		 String title = driver.getTitle();
		System.out.println(title);
		 System.out.println(FirstName);
		// Close the Browser
		 driver.close();
		
		
		

	}

}
