package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonLoop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement Option1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		
		List<WebElement> RadioGroup1 = driver.findElements(By.name("webform"));
		for (int i=0; i < RadioGroup1.size(); i++);
		
		WebElement Option2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		WebElement Option3 = driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
    	Option1.click();
		Option2.click();
		Option3.click();
		
	}
}
