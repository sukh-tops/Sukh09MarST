package Basic.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
		String mainWin = driver.getWindowHandle();
		System.out.println("mainWin");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allwins = driver.getWindowHandles();
		for(String win : allwins)
		{
			if(!win.equals(mainWin)) 
			{
				driver.switchTo().window(win);
			}
		}
		
		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
		driver.close();
		driver.switchTo().window(mainWin);
	}

}
