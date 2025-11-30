package d2_11sep2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class Parent
{
	WebDriver driver;//parent class
	@Test
	
	public void launchbrowser()
	{
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}


public class Depenceonmethods extends Parent//extending sub class from super/parent class
{
	@Test (dependsOnMethods="launchbrowser")
	public void login()
	{
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
