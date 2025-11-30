package d2_24sep2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_HRM
{
  WebDriver driver;

public Login_HRM (WebDriver driver)
{
	this.driver=driver;
}
	By usernme=By.name("username");
	By pw=By.id("password");
	By login=By.xpath("//button[@type='submit']");
	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public void enterusn()
	{
		driver.findElement(usernme).sendKeys("Admin");
	}
	public void enterpw()
	{
		driver.findElement(pw).sendKeys("admin123");	
	}
	public void clicklogin()
	{
		driver.findElement(login).click();
	}
	public void callingclass()
	{
		By profile=By.className("CallingPOMobject");
		By login=By.className("CallingPOMobject");
		
	}
	
}
	

