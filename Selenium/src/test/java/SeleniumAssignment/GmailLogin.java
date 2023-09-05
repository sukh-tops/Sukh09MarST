package SeleniumAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailLogin {
public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://support.google.com/mail/answer/56256?hl=en");
	driver.manage().window().maximize();
	WebElement createaccount = driver.findElement(By.linkText("Create an account"));
	createaccount.click();
	String mainwin = driver.getWindowHandle();
//	driver.findElement(By.linkText("Click Here")).click();
	
	Set<String> allwins = driver.getWindowHandles();
	for(String win : allwins)
	{
		if(!win.equals(mainwin)) 
		{
			driver.switchTo().window(win);
		}
	}
	WebElement firstname = driver.findElement(By.id("firstName"));
	firstname.sendKeys("Sukh");
	WebElement lastname = driver.findElement(By.id("lastName"));
	lastname.sendKeys("Patel");
	WebElement next = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
	next.click();
	try {
		Thread.sleep(1000);
	} catch (Exception e) {
//		 TODO: handle exception
		e.printStackTrace();
	}
	WebElement MonthPicker = driver.findElement(By.id("month"));
	MonthPicker.click();
	Select month = new Select(MonthPicker);
	month.selectByValue("8");
	WebElement Day = driver.findElement(By.name("day"));
	Day.sendKeys("14");
	WebElement Year = driver.findElement(By.name("year"));
	Year.sendKeys("1999");
	WebElement GenderPicker = driver.findElement(By.id("gender"));
	GenderPicker.click();
	Select gender = new Select(GenderPicker);
	gender.selectByValue("2");
	WebElement Next = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
	Next.click();
	WebElement Gmail = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div/div[1]/div/div[3]/div"));
	Gmail.click();
}
}
