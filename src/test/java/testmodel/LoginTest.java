package testmodel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagemodel.LoginPage;

public class LoginTest {
	WebDriver driver;
    @BeforeClass
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.html");

	}
    
    @Test
    
    public void login()
    {
    
    	LoginPage lp= new LoginPage(driver);
    	lp.enterUserName();
    	lp.enterPassword();
    	lp.clickLogin();
    	
    }
@AfterClass
  public void tearDown()
  {
	driver.close();
	driver.quit();
  }

}
