package TestCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class LoginTests {
WebDriver driver;
	@BeforeTest
public void startUp() {
	System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
}
	/**
	 * This test can check that logo is displaying or not .
	 * if logo is displaying then it will make b  (boolean ) as  true .
	 * @author pritesh
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority=1)
	public void logoTest() throws InterruptedException {
		driver.get("https://eagercrow.com/Home");
		
		
		boolean b = driver.findElement(By.xpath("//a[@class='logo active']/img[@alt='IMG-LOGO']")).isDisplayed();
		System.out.println(b);

		
	}
	/**
	 * this method is used to test the sign in with email and passsword
	 * 
	 * @author pritesh
	 * @throws InterruptedException
	 */
	@Test(priority= 2)
	public void signin() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='header-icons']/a[@routerlink='/SignIn']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign in with email')]")).click();
		driver.findElement(By.xpath("//input[@name='email' and @autocomplete='username']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
