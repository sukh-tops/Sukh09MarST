package Basic.Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.findElement(By.id("alertButton")).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	
	driver.findElement(By.id("timerAlertButton")).click();
	Thread.sleep(6000);
	Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	 
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	driver.findElement(By.id("confirmButton")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	Alert alert3 = driver.switchTo().alert();
	alert3.accept();
	
	driver.findElement(By.id("promtButton")).click();
	Alert alert4 = driver.switchTo().alert();
	alert4.sendKeys("hello alert");
	alert4.accept();
}
}
