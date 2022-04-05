package test;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
  @Test
  public void f() {
	  WebElement uname = driver.findElement(By.id ("username"));
	  uname.sendKeys("mrunalidalal25"); 
	  driver.findElement(By.id("password")).sendKeys("Mrunali@123");
	  driver.findElement(By.id("login")).click();

  }
  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://adactinhotelapp.com");
	 driver.manage().window().maximize();
  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
