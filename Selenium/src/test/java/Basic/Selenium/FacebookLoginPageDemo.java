package Basic.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPageDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//	WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys("selenium@gmail.com");
//	WebElement password = driver.findElement(By.id("pass"));
//	password.sendKeys("1234");
//	WebElement login = driver.findElement(By.name("login"));
//	login.click();
//	driver.findElement(By.linkText("Create new account")).clear();
		WebElement btn = driver.findElement(By.linkText("Create new account"));
		btn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Selenium");
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("selenium");
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("selenium@gmail.com");

//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.33.0-win-aarch64\\geckodriver.exe");
//	WebDriver driver1 = new FirefoxDriver();
//	driver1.get("https://www.facebook.com/");
//	driver1.manage().window().maximize();
//	WebElement email1 = driver1.findElement(By.id("email"));
//	email1.sendKeys("selenium@gmail.com");
//	WebElement password1 = driver1.findElement(By.id("pass"));
//	password1.sendKeys("1234");
//	WebElement login1 = driver1.findElement(By.name("login"));
//	login1.click();
//		
//	System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\msedgedriver.exe");
//	WebDriver driver2 = new EdgeDriver();
//	driver2.get("https://www.facebook.com/");
//	driver2.manage().window().maximize();
//	WebElement email2 = driver2.findElement(By.id("email"));
//	email2.sendKeys("selenium@gmail.com");
//	WebElement password2 = driver2.findElement(By.id("pass"));
//	password2.sendKeys("1234");
//	WebElement login2 = driver2.findElement(By.name("login"));
//	login2.click();

	}
}
