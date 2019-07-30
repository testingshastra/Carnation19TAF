package TestCases;

public class LoginTests {
WebDriver driver;
	@BeforeMethod
public void startUp() {
	System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	
}
	/**
	 * This test can check that logo is displaying or not .
	 * if logo is displaying then it will make b  (boolean ) as  true .
	 * @author pritesh
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void logoTest() throws InterruptedException {
		driver.get("https://eagercrow.com/Home");
		Thread.sleep(2000);
		boolean b = driver.findElement(By.xpath("//a[@class='logo active']/img[@alt='IMG-LOGO']")).isDisplayed();
		System.out.println(b);

	}


}
