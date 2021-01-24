package SeleniumWebdriver.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explorer {

	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.iedriver().setup();	
   
    driver=new InternetExplorerDriver();
    driver.get("https://www.msn.com");
   
	System.out.println("The URL of the current page is" + driver.getCurrentUrl());

	System.out.println("The Title of the current page is" + driver.getTitle());
	System.out.println("The page source is" + driver.getPageSource());
	driver.close();
	driver.quit();
	
	}

}
