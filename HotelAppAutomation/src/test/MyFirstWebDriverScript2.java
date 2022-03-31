package test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class MyFirstWebDriverScript2 {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.adactinhotelapp.com");
				WebElement uname= driver.findElement(By.name("username"));
				uname.sendKeys("mrunalidalal25");
				driver.findElement(By.name("password")).sendKeys("Mrunali@123");
				driver.findElement(By.name("login")).click();
				driver.quit();
			}

		}
		