package SeleniumWebdriver.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://skryabin.com/webdriver/html/sample.html");
		System.out.println("application opened");
		
	//	WebElement dropdown = driver.findElement(By.name("countryOfOrigin"));
		//Select obj = new Select(dropdown);
	//obj.selectByIndex(1); // austria
		//obj.selectByValue("China"); //china
		//obj.selectByVisibleText("Canada");//canada
		
	WebElement formData =driver.findElement(By.name("carMake"));	
	Select obj1=new Select(formData);
	obj1.selectByIndex(0);
	obj1.selectByValue("Ford");
	obj1.selectByVisibleText("Toyota");
	obj1.deselectByIndex(0);
	obj1.deselectAll();
		
		//List<WebElement> genders = driver.findElements(By.name("gender123"));
		//genders.get(0).click(); // male
		//genders.get(1).click();//female
		//System.out.println(genders.size());
		
		System.out.println("The URL of the current page is" + driver.getCurrentUrl());

		System.out.println("The Title of the current page is" + driver.getTitle());
//		System.out.println("The page source is" + driver.getPageSource());
		
//		driver.quit();
//		driver.close();
	}
}
