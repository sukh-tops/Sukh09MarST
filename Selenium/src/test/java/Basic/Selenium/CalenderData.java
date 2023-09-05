package Basic.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderData {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
//		WebElement ele = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[2]/p/iframe"));
//		driver.switchTo().frame(ele);
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		driver.findElement(By.id("datepicker")).click();
//		String myDate = "1";
//		String myMonth = "April";
//		String myYear = "2000";
////		String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
////		System.out.println(currentMonth);
//		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
//		System.out.println(currentYear);
//		int y1 = Integer.parseInt(myYear);// 2000
//		int y2 = Integer.parseInt(currentYear);// 2023
//		while (!myYear.equals(driver.findElement(By.className("ui-datepicker-year")).getText())) {
//			if (y1 < y2) {
//				driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();
//			} else {
//				driver.findElement(By.xpath("//*[@data-handler='next']/span")).click();
//			}
//		}
//		while (!myMonth.equals(driver.findElement(By.className("ui-datepicker-month")).getText())) {
//			driver.findElement(By.xpath("//*[@data-handler='prev']/span")).click();
//		}
//		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
//		for (WebElement date : dates) {
//			String dt = date.getText();
//			if (dt.equals(myDate)) {
//				date.click();
//			}
//		}
		
//		WebElement DatePicker2 = driver.findElement(By.id("DropDown DatePicker"));
//		DatePicker2.click();
//		WebElement ele = driver.findElement(By.xpath("//*[@class='resp-tabs-container']/div[2]/p/iframe"));
//		driver.switchTo().frame(ele);
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
////			 TODO: handle exception
//			e.printStackTrace();
//		}
//		WebElement dropdownpicker = driver.findElement(By.id("datepicker"));
//		dropdownpicker.click(); 
//		WebElement MonthPicker = driver.findElement(By.className("ui-datepicker-month"));
//		Select Month = new Select(MonthPicker); 
//		Month.selectByIndex(7);
//		WebElement DatePicker = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr[3]//td[2]"));
//		DatePicker.click();
//		WebElement YearPicker = driver.findElement(By.className("ui-datepicker-year"));
//		Select Year = new Select(YearPicker);
//		Year.selectByValue("2025");
		
		WebElement DatePicker3 = driver.findElement(By.id("Icon Trigger"));
		DatePicker3.click();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
//			 TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
