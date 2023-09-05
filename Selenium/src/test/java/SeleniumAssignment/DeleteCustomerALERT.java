package SeleniumAssignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCustomerALERT {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			
			WebElement CustomerId = driver.findElement(By.name("cusid"));
			CustomerId.sendKeys("53920");
			
			WebElement Submit = driver.findElement(By.name("submit"));
			Submit.click();
			
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			
	}
}
