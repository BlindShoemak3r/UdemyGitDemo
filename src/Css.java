import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\My Stuff\\Learning Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("*[id='username']")).sendKeys("username goes here");
		driver.findElement(By.cssSelector("*[id='password']")).sendKeys("pawwsord");
		//driver.findElement(By.cssSelector("*#Login")).click();
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();	  //same as above

	}

}

/*
  
xpath = //tagname[@attribute = 'value']
css = tagname[attribute = 'value']


*/