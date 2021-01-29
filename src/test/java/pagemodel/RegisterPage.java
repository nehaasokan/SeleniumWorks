package pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;
	By clickRegister=By.linkText("Register");
	By txtFirstName=By.id("customer.firstName");
	By txtLastName=By.id("customer.lastName");
	By txtAddressStreet=By.id("customer.address.street");
	By txtAddressCity=By.id("customer.address.city");
	By txtAddressState=By.id("customer.address.state");
	By txtAddressZip=By.id("customer.address.zipCode");
	By txtPhoneNo=By.id("customer.phoneNumber");
	By txtSsn=By.id("customer.ssn");
	By txtUserName=By.id("customer.username");
	By txtPassWord=By.id("customer.password");
	By txtRepeatPwd=By.id("repeatedPassword");
	By btnRegister=By.xpath("//input[@value='Register']");
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Register()
	{
		driver.findElement(clickRegister).click();
	}
	public void firstName()
	{
		driver.findElement(txtFirstName).sendKeys("man");
	}
	
	public void lastName()
	{
		driver.findElement(txtLastName).sendKeys("man1");
	}
	public void addressStreet()
	{
	driver.findElement(txtAddressStreet).sendKeys("QueenMary");	
	}
	public void addressCity()
	{
	driver.findElement(txtAddressCity).sendKeys("Hamilton");
	}
	public void addressState()
	{
	driver.findElement(txtAddressState).sendKeys("Hamilton");	
	}
	public void addressZip()
	{
	driver.findElement(txtAddressZip).sendKeys("6789");	
	}
	public void phoneNo()
	{
	driver.findElement(txtPhoneNo).sendKeys("888888");	
	}
	public void ssn()
	{
	driver.findElement(txtSsn).sendKeys("ght");	
	}
	public void userName()
	{
	driver.findElement(txtUserName).sendKeys("man");	
	}
	public void password()
	{
	driver.findElement(txtPassWord).sendKeys("man1");	
	}
	public void repeatPassword()
	{
	driver.findElement(txtRepeatPwd).sendKeys("man1");	
	}
	public void submit()
	{
		driver.findElement(btnRegister).click();
	}
}




