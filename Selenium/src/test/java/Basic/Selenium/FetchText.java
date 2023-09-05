package Basic.Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	
	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());
	WebElement f1 = driver.findElement(By.id("frame1"));
	driver.switchTo().frame(f1);
	
	WebElement element = driver.findElement(By.id("sampleHeading"));
	String data = element.getText();
	System.out.println(data);
}
}
