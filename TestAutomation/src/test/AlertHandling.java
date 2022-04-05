package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.*;

public class AlertHandling {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			
			driver.findElement(By.id("timerAlertButton")).click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			
			//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			Alert alert=wait.until(ExpectedConditions.alertIsPresent());
			//wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			System.out.println("Alert Accepted");
			
			
				driver.quit();	
		}

	}
		
		
	
