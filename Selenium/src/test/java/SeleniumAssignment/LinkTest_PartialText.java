package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest_PartialText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
     // LinkText :-
		// WebElement btn =driver.findElement(By.linkText("Create new account"));
		// btn.click();
		
	 // Partial_LinkText :-
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
        System.out.println(links.size());
        for(WebElement link : links) {
          System.out.println(link.getText());
           }
        links.get(1).click();
        
	}
}
