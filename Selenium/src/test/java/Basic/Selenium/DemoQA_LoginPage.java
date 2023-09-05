package Basic.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQA_LoginPage {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	WebElement FirstName = driver.findElement(By.id("firstName"));
	FirstName.sendKeys("Sukh");
	WebElement LastName = driver.findElement(By.id("lastName"));
	LastName.sendKeys("Patel");
	WebElement Email = driver.findElement(By.id("userEmail"));
	Email.sendKeys("sukh@gmail.com");
	List<WebElement> gender = driver.findElements(By.id("gender-radio-2"));
	gender.get(1).click();
	WebElement MobileNumber = driver.findElement(By.id("userNumber"));
	MobileNumber.sendKeys("9876543210");
	WebElement DateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
	DateOfBirth.click();
	WebElement MonthPicker = driver.findElement(By.className("react-datepicker__month-select"));
	Select Month = new Select(MonthPicker);
	Month.selectByIndex(7);
	WebElement YearPicker = driver.findElement(By.className("react-datepicker__year-select"));
	Select Year = new Select(YearPicker);
	Year.selectByValue("1999");
	WebElement Date = driver.findElement(By.className("react-datepicker__day react-datepicker__day--014"));
	Date.click();
	}
}
