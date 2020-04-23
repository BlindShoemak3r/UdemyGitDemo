import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\My Stuff\\Learning Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*= 'Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("password");
		driver.findElement(By.cssSelector("input#password")).sendKeys("username");
		//driver.findElement(By.xpath("//input[contains(@value='Go')]")).click();  //Doesn't work
		//driver.findElement(By.cssSelector("body > div > div.content-area > div.rhs-area.floatR > div.login-area-free.floatR > div > form > div > div:nth-child(6) > div:nth-child(1) > input[type='submit']")).click();	//Long form, works
		driver.findElement(By.cssSelector("input[type='submit']")).click();		//Short form, works
		
		
		
		
		
	}

}
