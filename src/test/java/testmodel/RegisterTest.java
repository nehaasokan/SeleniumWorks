package testmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import pagemodel.RegisterPage;

public class RegisterTest {


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
	    
	    public void register()
	    {
	    
	    	RegisterPage rp= new RegisterPage(driver);
	    	rp.Register();
	    	rp.firstName();
	    	rp.lastName();
	    	rp.addressStreet();
	    	rp.addressCity();
	    	rp.addressState();
	    	rp.addressZip();
	    	rp.phoneNo();
	    	rp.ssn();
	    	rp.userName();
	    	rp.password();
	    	rp.repeatPassword();
	    	rp.submit();
	    }
	@AfterClass
	  public void tearDown()
	  {
		driver.close();
		driver.quit();
	  }

	
}
