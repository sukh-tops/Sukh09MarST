package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfWebsites {
public static void main(String[] args) {
	System.out.println("https://phptravels.com/demo/");
	
	System.getProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://phptravels.com/demo/");
	driver.manage().window().maximize();
	WebElement FirstName = driver.findElement(By.name("first_name"));
	FirstName.sendKeys("Sukh");
	WebElement LastName = driver.findElement(By.name("last_name"));
	LastName.sendKeys("Patel");
	WebElement BusinessName = driver.findElement(By.name("business_name"));
	BusinessName.sendKeys("QA");
	WebElement Email = driver.findElement(By.name("email"));
	Email.sendKeys("sukh@gmail.com");
	System.out.println("	");
	
	System.out.println("http://thedemosite.co.uk/");
	System.out.println("	");
	
	System.getProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver1 = new ChromeDriver();
	driver1.get("https://thedemosite.co.uk/contact/");
	driver1.manage().window().maximize();
	WebElement FirstName1 = driver1.findElement(By.xpath("//*[@id=\"post-24\"]/div/div/form/div[1]/input"));
	FirstName1.sendKeys("Sukh");
	WebElement LastName1 = driver1.findElement(By.xpath("//*[@id=\"post-24\"]/div/div/form/div[2]/input"));
	LastName1.sendKeys("Patel");
	WebElement Email1 = driver1.findElement(By.xpath("//*[@id=\"post-24\"]/div/div/form/div[3]/input"));
	Email1.sendKeys("sukh@gmail.com");
	WebElement Message = driver1.findElement(By.xpath("//*[@id=\"post-24\"]/div/div/form/div[4]/textarea"));
	Message.sendKeys("Hello Java");
	WebElement Submit = driver1.findElement(By.xpath("//*[@id=\"post-24\"]/div/div/form/div[7]/button/div"));
	Submit.click();
	System.out.println(" ");
	
	System.out.println("http://newtours.demoaut.com/");
	System.out.println("ERROR IN WEBSITE");
	System.out.println(" ");
	
	System.out.println("http://the-internet.herokuapp.com/");
	System.out.println("ERROR IN WEBSITE");
	System.out.println(" ");
	
	System.out.println("http://automationpractice.com/index.php");
	System.out.println("ERROR IN WEBSITE");
	System.out.println(" ");
	
	System.out.println("http://book.theautomatedtester.co.uk/");
	System.out.println("ERROR IN SERVER");
	System.out.println(" ");
	
	System.out.println("https://s1.demo.opensourcecms.com/wordpress/");
	System.out.println("ERROR");
	System.out.println(" ");

	System.out.println("W.A.J.Script for Selecting multiple items in a drop dropdown");
	System.out.println(" ");
	
	System.out.println("W.A.J. script to use different methods to manage the windows-alerts and pop ups.");
	System.out.println(" ");
	
	System.out.println("1. Alert");
	System.out.println("driver.findElement(By.id(\"alertButton\")).click();");
	System.out.println("Alert alert = driver.switchTo().alert();");
	System.out.println("System.out.println(alert.getText());");
	System.out.println("alert.accept();");
	System.out.println(" ");
	
	System.out.println("2. TimerAlertButton");
	System.out.println("driver.findElement(By.id(\"timerAlertButton\")).click();");
	System.out.println("Alert alert1 = driver.switchTo().alert();");
	System.out.println("alert1.accept();");
	System.out.println(" ");
	
	System.out.println("3. ConfirmButton");
	System.out.println("WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));");
	System.out.println("driver.findElement(By.id(\"confirmButton\")).click();");
	System.out.println("wait.until(ExpectedConditions.alertIsPresent());");
	System.out.println("Alert alert3 = driver.switchTo().alert();");
	System.out.println("alert3.accept();");
	System.out.println(" ");
	
	System.out.println("4. PromtButton");
	System.out.println("driver.findElement(By.id(\"promtButton\")).click();");
	System.out.println("Alert alert4 = driver.switchTo().alert();");
	System.out.println("alert4.sendKeys(\"hello alert\");");
	System.out.println("alert4.accept();");
	System.out.println(" ");
	
  }
}
