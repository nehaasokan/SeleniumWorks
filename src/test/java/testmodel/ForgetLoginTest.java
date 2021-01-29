package testmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagemodel.ForgetLoginPage;


public class ForgetLoginTest {
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
    
    	ForgetLoginPage fp= new ForgetLoginPage(driver);
    	fp.forgetLogin();
    	fp.enterFirstName();
    	fp.enterLastName();
    	fp.enterStreet();
    	fp.enterCity();
    	fp.enterState();
    	fp.enterZip();
    	fp.enterSsn();
    	fp.clickSubmit();
    
    	
    }
   @AfterClass
   public void tearDown()
    {
	  driver.close();
	  driver.quit();
    }
}
