import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	//static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\My Stuff\\Learning Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("ThisIsMyFirstCode");			//browser created xpath
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("FirstCode");	//created xpath
		//driver.findElement(By.name("pass")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("password");
		//driver.findElement(By.xpath("//*[@value = 'Log In']")).click();
		driver.findElement(By.linkText("Forgot account?")).click(); 		//Case sensitive
		
		//When have the same identifier use xpath or css
		//driver.findElement(By.className("inputtext")).sendKeys("HelloWorld");
		
		//Same steps user created CSS
		/*driver.findElement(By.cssSelector("input[name = 'email']")).sendKeys("email acct");
		driver.findElement(By.cssSelector("input[id = 'pass']")).sendKeys("drowssap");
		driver.findElement(By.cssSelector("[value = 'Log In']")).click();*/
		
		/*
		driver.findElement(By.cssSelector("input#email")).sendKeys("email acct");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("drowssap");
		driver.findElement(By.cssSelector("input[value = 'Log In']")).click();
		*/
		

	}

}

/*
 classes cannot have spaces in the name, called compound classes
browser tools can generate xpaths/css, but not 100% reliable
1. Inspect the selected element
2. right click the highlighted portion in the dev tools
3. copy -> copy xpath

double quotes w/n double quotes is not accepted
if xpath starts with /html/ not reliable, switch to chrome

Validate xpaths:
1. get the xpath using the above steps
2. navigate to the console
3. if no error already type $x("")
4. paste the xpath within, be sure to remove the xpath's double quotes
5. press Enter
6. Hover over the result, if it highlights what was intended, then valid xpath
7. If returns null, then not valid

Validate css:
1. same steps as above instead type $("") into the console
2. If returns null, then not valid

driver.getCurrentUrl();
driver.findElement(By.cssSelector("input#email")).sendKeys(driver.getCurrentUrl());

*/