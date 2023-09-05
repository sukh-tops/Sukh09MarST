package Basic.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSignUpPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement span = driver.findElement(By.className("nav-icon nav-arrow"));
		span.click();
		WebElement a = driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/div/a"));
		a.click(); 
		WebElement SigninPage = driver.findElement(By.id("createAccountSubmit"));
		SigninPage.click();
		WebElement YourName = driver.findElement(By.name("customerName"));
		YourName.sendKeys("Selenium");
		WebElement CountryCode = driver.findElement(By.className("a-dropdown-prompt"));
		CountryCode.click();
		WebElement MobileNumber = driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]"));
		MobileNumber.findElements(By.xpath("987654321"));
	}
}
