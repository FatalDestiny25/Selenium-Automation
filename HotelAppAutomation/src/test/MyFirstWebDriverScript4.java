package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstWebDriverScript4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactinhotelapp.com");
		WebElement uname= driver.findElement(By.cssSelector("#username"));
		uname.sendKeys("mrunalidalal25");
		driver.findElement(By.cssSelector("#password")).sendKeys("Mrunali@123");
		driver.findElement(By.cssSelector("#login")).click();
	}

}
	


