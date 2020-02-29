package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage1 {
	WebDriver driver;
	
public  Homepage1(WebDriver driver)
{
	this.driver=driver;
	}
public void name()
{

	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("smitapradhan@gmail.com");
}
public void password()
{
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("smitp123");
}
public void next()
{
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}
}