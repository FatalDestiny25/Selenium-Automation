package test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PromptHandling {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get ("https://demoqa.com/alerts");
			driver.manage().window().maximize();
			WebElement element = driver.findElement(By.id("promtButton"));
			((JavascriptExecutor) driver).executeScript ("arguments[0].click()", element);
			Alert promptAlert = driver.switchTo ().alert (); String alertText = promptAlert.getText ();
			System.out.println("Alert text is " + alertText);
			promptAlert.sendKeys ("Mrunali");
			promptAlert.accept();
			}

		}
	


