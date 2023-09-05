package Websites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver" ,"C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.manage().window().maximize();
		
		
		
		
	}
}
