package SeleniumWebdriver.learning;


import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parabank {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
	Login();
    Register();
	ForgetLogin();	
	Admin();
}

    public static void Login()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.html");
	  //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("manty");
		driver.findElement(By.name("password")).sendKeys("manty1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='smalltext']")));
		
}
	public static void Register()
	{
		
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
     driver.manage().window().maximize();
     String UserName,WelcomeString;
		int RandomNumber;
		
		Random  RandomObj = new Random();
		RandomNumber=RandomObj.nextInt();
		UserName = "UserName"+RandomNumber;
		
	 driver.get("https://parabank.parasoft.com/parabank/index.htm");
	 
	 driver.findElement(By.linkText("Register")).click();	
     driver.findElement(By.id("customer.firstName")).sendKeys("people");
	 driver.findElement(By.id("customer.lastName")).sendKeys("str");
	 driver.findElement(By.id("customer.address.street")).sendKeys("230 merge street");
	 driver.findElement(By.id("customer.address.city")).sendKeys("Auckland");
	 driver.findElement(By.id("customer.address.state")).sendKeys("Auckland");
	 driver.findElement(By.id("customer.address.zipCode")).sendKeys("52");
	 driver.findElement(By.id("customer.phoneNumber")).sendKeys("123455");
	 driver.findElement(By.id("customer.ssn")).sendKeys("rty");
	 driver.findElement(By.id("customer.username")).sendKeys("people");
	 driver.findElement(By.id("customer.password")).sendKeys("people1");
	 driver.findElement(By.id("repeatedPassword")).sendKeys("people1");
	 
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	 
	 WelcomeString = (driver.findElement(By.className("title")).getText()).replace("Welcome ", "");
		try{
			Assert.assertEquals(UserName,WelcomeString);
			System.out.println("Test is passed ");
		}
		catch(Error e) {
			System.out.println(e.toString());
		}
		//driver.close();
		//driver.quit();
	 
	}
	
	public static void ForgetLogin()
	{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://parabank.parasoft.com/parabank/index.htm");
	     driver.findElement(By.linkText("Forgot login info?")).click();
	     driver.findElement(By.id("firstName")).sendKeys("people");
	     driver.findElement(By.id("lastName")).sendKeys("str");
	     driver.findElement(By.id("address.street")).sendKeys("230 merge street");
	     driver.findElement(By.id("address.city")).sendKeys("Auckland");
	     driver.findElement(By.id("address.state")).sendKeys("Auckland");
	     driver.findElement(By.id("address.zipCode")).sendKeys("52");
	     driver.findElement(By.id("ssn")).sendKeys("rty");
	     driver.findElement(By.xpath("//input[@type='submit']")).click();
	     
	}
	
	public static void Admin()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://parabank.parasoft.com/parabank/index.htm");
	     driver.findElement(By.linkText("Admin Page")).click();
	    
	     driver.findElement(By.name("action")).click();
	     driver.findElement(By.name("accessMode")).click();
	     driver.findElement(By.name("soapEndpoint")).sendKeys("End");
	     
	     WebElement dropdown = driver.findElement(By.name("loanProvider"));
			Select obj = new Select(dropdown);
		obj.selectByIndex(1); 
			
	     WebElement dropdown1=driver.findElement(By.name("loanProcessor"));
	     Select obj1=new Select(dropdown1);
	     obj1.selectByIndex(1);
	}
	

}