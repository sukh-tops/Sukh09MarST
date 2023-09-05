package Basic.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT)
		       .sendKeys("learn java")
		       .keyUp(Keys.SHIFT)
		       .pause(Duration.ofSeconds(2))
		       .sendKeys(Keys.ARROW_DOWN)
		       .sendKeys(Keys.ENTER)
		       .build().perform();
	}
}
