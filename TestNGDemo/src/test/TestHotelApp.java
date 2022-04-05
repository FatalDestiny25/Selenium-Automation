package test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHotelApp {
	public static WebDriver driver;
  @Test
  public void TestHotelApp() {
	  System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.navigate().to("https://adactinhotelapp.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Opening Chrome window");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("Closing the Browser");
  }

}
