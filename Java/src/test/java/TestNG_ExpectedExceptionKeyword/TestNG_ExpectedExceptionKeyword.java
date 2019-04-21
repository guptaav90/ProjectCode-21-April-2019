package TestNG_ExpectedExceptionKeyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_ExpectedExceptionKeyword {
	
	WebDriver driver;
	
	  @Test(expectedExceptions=NoSuchElementException.class)
	  public void CRMPROLoginPageTest() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Newfolder\\AviGupta\\Automation\\AutomationSoftware\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.crmpro.com");
		  
		  driver.findElement(By.name("username")).sendKeys("guptaav90");
		  driver.findElement(By.name("password")).sendKeys("cspl@2020");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@value='Loginn']")).click();

	  }
}
