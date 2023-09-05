package Websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\HP\\\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		
		WebElement Register = driver.findElement(By.linkText("Register"));
		Register.click();
		WebElement FirstName = driver.findElement(By.id("customer.firstName"));
		FirstName.sendKeys("Java");
		WebElement LastName = driver.findElement(By.id("customer.lastName"));
		LastName.sendKeys("Demo");
		WebElement Address = driver.findElement(By.id("customer.address.street"));
		Address.sendKeys("Vastral");
		WebElement City = driver.findElement(By.id("customer.address.city"));
		City.sendKeys("Ahmedabad");
		WebElement State = driver.findElement(By.id("customer.address.state"));
		State.sendKeys("Gujarat");
		WebElement ZipCode = driver.findElement(By.id("customer.address.zipCode"));
		ZipCode.sendKeys("382418");
		WebElement Phone = driver.findElement(By.id("customer.phoneNumber"));
		Phone.sendKeys("9876543210");
		WebElement Username = driver.findElement(By.id("customer.username"));
		Username.sendKeys("Demo");
		WebElement Password = driver.findElement(By.id("customer.password"));
		Password.sendKeys("Demo123");
		WebElement Confirm = driver.findElement(By.id("repeatedPassword"));
		Confirm.sendKeys("Demo123");
		WebElement RegisterButton = driver.findElement(By.className("button"));
		RegisterButton.click();
		
		
		
		
	}
}
