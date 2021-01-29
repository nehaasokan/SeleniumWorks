package pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetLoginPage {
	
	WebDriver driver;
	By lnkForgetLogin=By.linkText("Forgot login info?");
	By txtFirstName=By.id("firstName");
	By txtLastName=By.id("lastName");
	By txtAddressStreet=By.id("address.street");
	By txtAddressCity=By.id("address.city");
	By txtAddressState=By.id("address.state");
	By txtZipcode=By.id("address.zipCode");
	By tstSsn=By.id("ssn");
	By btnSubmit=By.xpath("//input[@type='submit']");
	public ForgetLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void forgetLogin()
	{
		driver.findElement(lnkForgetLogin).click();
	}
	public void enterFirstName()
	{
		driver.findElement(txtFirstName).sendKeys("Him");
	}
	public void enterLastName()
	{
		driver.findElement(txtLastName).sendKeys("JLK");
	}
	public void enterStreet()
	{
		driver.findElement(txtAddressStreet).sendKeys("Nikau");
	}
	public void enterCity()
	{
		driver.findElement(txtAddressCity).sendKeys("Christchurch");
	}
	public void enterState()
	{
		driver.findElement(txtAddressState).sendKeys("Christchurch");
	}
	public void enterZip()
	{
		driver.findElement(txtZipcode).sendKeys("8765");
	}
	public void enterSsn()
	{
		driver.findElement(tstSsn).sendKeys("gtr");
	}
	public void clickSubmit()
	{
		driver.findElement(btnSubmit).click();
	}
}
