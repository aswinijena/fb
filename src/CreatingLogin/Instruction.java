package CreatingLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Loginpage.Homepage1;

public class Instruction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Homepage1 f=new Homepage1(driver);
	f.name();
	Thread.sleep(3000);
	f.password();
	Thread.sleep(3000);
	f.next();
	Thread.sleep(3000);
	driver.close();
	}

}
