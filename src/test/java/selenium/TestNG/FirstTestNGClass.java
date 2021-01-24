package selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNGClass {
	
  @Test
  public void Login() {
	  WebDriver driver;
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  
	  driver.get("https://parabank.parasoft.com/parabank/index.html");
	 
		driver.findElement(By.name("username")).sendKeys("manty");
		driver.findElement(By.name("password")).sendKeys("manty1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url, "https://parabank.parasoft.com/parabank/index.html");
	  
	  if(url.contains("parasoft")) {
		  System.out.println("logged in successfully");
		  
	  }
	  
  }
}
