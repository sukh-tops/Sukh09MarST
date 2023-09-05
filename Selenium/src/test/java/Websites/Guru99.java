package Websites;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement Register = driver.findElement(By.linkText("REGISTER"));
		Register.click();
		WebElement FirstName = driver.findElement(By.name("firstName"));
		FirstName.sendKeys("Sukh");
		WebElement LastName = driver.findElement(By.name("lastName"));
		LastName.sendKeys("Patel");
		WebElement Number = driver.findElement(By.name("phone"));
		Number.sendKeys("9876543210");
		WebElement Email = driver.findElement(By.id("userName"));
		Email.sendKeys("sukhdemo@gmail.com");
		WebElement Address = driver.findElement(By.name("address1"));
		Address.sendKeys("Vastral");
		WebElement City = driver.findElement(By.name("city"));
		City.sendKeys("Ahmedabad");
		WebElement State = driver.findElement(By.name("state"));
		State.sendKeys("Gujarat");
		WebElement PostalCode = driver.findElement(By.name("postalCode"));
		PostalCode.sendKeys("382418");
		WebElement CountryPicker = driver.findElement(By.name("country"));
		CountryPicker.click();
		Select country = new Select(CountryPicker);
		country.selectByValue("INDIA");
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("Sukh");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("Sukh");
		WebElement ConfirmPassword = driver.findElement(By.name("confirmPassword"));
		ConfirmPassword.sendKeys("Sukh");
		WebElement Submit = driver.findElement(By.name("submit"));
		Submit.click();
		
		try {
		Thread.sleep(1000);
	} catch (Exception e) {
//		 TODO: handle exception
		e.printStackTrace();
	}
		WebElement Home = driver.findElement(By.linkText("Home"));
		Home.click();// Till here it is done 
		//Switch is not working
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
//			 TODO: handle exception
			e.printStackTrace();
		}
	
//		WebElement Close = driver.findElement(By.id("dismiss-button"));
//		Close.click();
		WebElement UserName = driver.findElement(By.name("userName"));
		UserName.sendKeys("Sukh");
		WebElement Pswd = driver.findElement(By.name("password"));
		Pswd.sendKeys("Sukh");
		WebElement Submit1 = driver.findElement(By.name("submit"));
		Submit1.click();
//		
		
		WebElement Flights = driver.findElement(By.linkText("Flights"));
		Flights.click();
		WebElement Type = driver.findElement(By.name("tripType"));
		Type.click();
		WebElement Passenger = driver.findElement(By.name("passCount"));
		Passenger.click();
		Select passengers = new Select(Passenger);
		passengers.selectByValue("2");
		WebElement DepartingFrom = driver.findElement(By.name("fromPort"));
		DepartingFrom.click();
		Select Depart = new Select(DepartingFrom);
		Depart.selectByValue("Paris");
		WebElement On = driver.findElement(By.name("fromMonth"));
		On.click();
		Select On1 = new Select(On);
		On1.selectByValue("8");
		WebElement date = driver.findElement(By.name("fromDay"));
		date.click();
		Select Date = new Select(date);
		Date.selectByValue("14");
		WebElement ArrivingIn = driver.findElement(By.name("toPort"));
		ArrivingIn.click();
		Select Arriving = new Select(ArrivingIn);
		Arriving.selectByValue("London");
		WebElement Returning = driver.findElement(By.name("toMonth"));
		Returning.click();
		Select Return = new Select(Returning);
		Return.selectByValue("9");
		WebElement ToDate = driver.findElement(By.name("toDay"));
		ToDate.click();
		Select ReturnDate = new Select(ToDate);
		ReturnDate.selectByValue("23");
		List<WebElement> ServiceClass = driver.findElements(By.name("servClass"));
		ServiceClass.get(1).click();
		WebElement Continue = driver.findElement(By.name("findFlights"));
		Continue.click();
	}
}
