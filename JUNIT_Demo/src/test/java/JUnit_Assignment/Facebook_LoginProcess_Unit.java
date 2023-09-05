package JUnit_Assignment;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginProcess_Unit {
	@RunWith(Parameterized.class)
	public class Facebook_loginProcess_Junit {
		
		String email;
		String password;
		
		public Facebook_loginProcess_Junit(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}

		@Test 
		public void testlogin() {
			String url = "https://www.facebook.com/";
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
		}
		@Parameters
		public List<Object[]> passData() {
			Object o[][]= new Object[1][2];
			
			o[0][0] = "selenium@gmail.com";
			o[0][1] = "selenium123";
			
			return Arrays.asList(o);
}
}
}