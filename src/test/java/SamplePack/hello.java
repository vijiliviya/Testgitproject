package SamplePack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class hello 
{
	public WebDriver driver;

	@Test
	public void openMyBlog() {
		driver.get("https://www.softwaretestingmaterial.com/");
	}

	@BeforeClass
	public void beforeClass() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vraja\\workspace\\SampleMavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
		System.out.println("afterclass");
		System.out.println("new");
		System.out.println("example");
		System.out.println("new");
		System.out.println("example");
		System.out.println("newqq");
		System.out.println("example");
		System.out.println("newqq");
		System.out.println("newqq");
		System.out.println("example");
		System.out.println("newqq");
	}}


