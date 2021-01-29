package pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;

By txtUserName=By.name("username");
By txtPassWord=By.name("password");
By btnLogin=By.xpath("//input[@type='submit']");

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}


public void enterUserName()
{
	driver.findElement(txtUserName).sendKeys("manty");
}
public void enterPassword()
{
	driver.findElement(txtPassWord).sendKeys("manty1");
}
public void clickLogin()
{
	driver.findElement(btnLogin).click();
}

}
