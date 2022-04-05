package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyFirstWebScript {
	public static WebDriver driver;
	public static Properties prop;
	public static String sAppURL;
	public static String usename;
	public static String password;
	public static void main(String[] args) throws  FileNotFoundException,IOException   {
		try {
			Properties prop=new Properties();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		prop.load(new FileInputStream("G:\\thinkQuotient\\TestAutomation\\Configuration\\HA_Configuration.properties"));
		sAppURL=prop.getProperty("sAppURL");
		String username=prop.getProperty("usename");
		password=prop.getProperty("password");
	System.out.println(sAppURL);
	System.out.println(usename);
	System.out.println(password);

	System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.adactinhotelapp.com");

	WebElement uname= driver.findElement(By.id("username"));
	uname.sendKeys("mrunalidalal25");
	driver.findElement(By.id("password")).sendKeys("Mrunali@123");
	driver.findElement(By.id("login")).click();
		
	}
}
	
	
