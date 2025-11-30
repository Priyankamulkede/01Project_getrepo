package d1_1sep2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ornghrmannotations {
	WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //to make it fast like thread.sleep
	}
		@Test(priority=1)//priority used to lauch the below one based on priority
		public void login()
		{
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		@Test(priority=2)
		public void homepage(	)
		{
			String dash=driver.findElement(By.xpath("//div[@id='app']")).getText();
			/*if (dash.equals("Dashboard"))
			{
				System.out.println("Testcase is Passed: successfully logged in");
			}
			else
			{
				System.out.println("Testcase is Failed: successfully not logged in");
			}*/
			Assert.assertNotEquals(dash, "Dashboard","I doing it deliberately");
		}
			@Test(priority=3)
			public void logout() throws InterruptedException
			{
				driver.findElement(By.className("oxd-userdropdown-name")).click();
				driver.findElement(By.linkText("Logout")).click();
				Thread.sleep(5000);
			}
			@AfterSuite
			public void tearDown() throws InterruptedException
			{
				Thread.sleep(5000);
				driver.quit();
			}
			
		}
	
	


