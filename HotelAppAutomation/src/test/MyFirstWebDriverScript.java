package test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MyFirstWebDriverScript {
public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.adactinhotelapp.com");
WebElement uname= driver.findElement(By.id("username"));
uname.sendKeys("mrunalidalal25");
driver.findElement(By.id("password")).sendKeys("Mrunali@123");
driver.findElement(By.id("login")).click();
driver.quit();
}
}








	


