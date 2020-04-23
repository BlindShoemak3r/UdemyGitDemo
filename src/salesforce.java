import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	//static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\My Stuff\\Learning Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("ThisIsMyFirstCode");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		//with xPaths
		driver.findElement(By.xpath("//*[@id='video-link']")).click();
		driver.navigate().back();
		driver.navigate().back();
		//with CSS selector
		driver.findElement(By.cssSelector("#signup_link")).click();
		driver.navigate().back();
		driver.findElement(By.id("username")).sendKeys("ThisIsMyFirstCode");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		driver.close();
		
		
		
		
		
	}

}
