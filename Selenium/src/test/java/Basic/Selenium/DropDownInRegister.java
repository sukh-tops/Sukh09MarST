package Basic.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownInRegister {
	public static void main(String[] args) {
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		WebElement CountryPicker = driver.findElement(By.name("country"));
		CountryPicker.click();
		Select country = new Select(CountryPicker);
		country.selectByValue("INDIA");
	}
}
