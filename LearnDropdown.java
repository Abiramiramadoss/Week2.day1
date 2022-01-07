package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		
		driver.manage().window().maximize();
		//Locate the ele with select tag
        WebElement dd = driver.findElement(By.id("dropdown1"));
        //create object for select class
        Select dropdown = new Select(dd);
        //choose option
       // dropdown.selectByVisibleText("Appium");
        //dropdown.selectByValue("3");
        dropdown.selectByIndex(1);
        
        
        
        
		

	}

}
