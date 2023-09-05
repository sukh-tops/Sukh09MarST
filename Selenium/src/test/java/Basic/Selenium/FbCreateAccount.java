package Basic.Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAccount {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement CreateNewAccount = driver.findElement(By.linkText("Create new account"));
	CreateNewAccount.click();	
	Thread.sleep(2000);
	WebElement Firstname = driver.findElement(By.name("firstname"));
	Firstname.sendKeys("Sukh");
	WebElement Lastname = driver.findElement(By.name("lastname"));
	Lastname.sendKeys("Patel");
	WebElement email = driver.findElement(By.name("reg_email__"));
	email.sendKeys("sukh@gmail.com");
	WebElement ReenterEmail = driver.findElement(By.name("reg_email_confirmation__"));
	ReenterEmail.sendKeys("sukh@gmail.com");
	WebElement NewPassword = driver.findElement(By.name("reg_passwd__"));
	NewPassword.sendKeys("sukh12345");
	WebElement day = driver.findElement(By.id("day"));
	Select days = new Select (day);
	days.selectByIndex(13);
	WebElement month = driver.findElement(By.id("month"));
	Select months = new Select (month);
	months.selectByIndex(7);
	WebElement year = driver.findElement(By.id("year"));
	Select years = new Select (year);
	years.selectByIndex(24);
	List<WebElement> gender = driver.findElements(By.name("sex"));
	gender.get(0).click();
	WebElement Submit = driver.findElement(By.name("websubmit"));
	Submit.click();
}
}
