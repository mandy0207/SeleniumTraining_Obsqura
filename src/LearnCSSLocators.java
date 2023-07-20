import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCSSLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		/** Css Syntaxes
		 * 
		 * 1) if className is unique = .ClassName
		 * 2) if we have id = #id
		 * 3) if we have multiple classes we can ommit space between them and use . operator
		 *  eg <input class="button-1 login-button valid", name="password>
		 *  css locator can be = .button-1.login-button
		 * 
		 * 4) if you have enough attrbutes ;general syntax for css locator is
		 *    tagname[attribute ='value']  or [attribute='value']
		 * 
		 * 5) Tagname[@attribute=’value’]:nth-child(index)
		 *
		 *  6) using regular expressions = input[type*='pass']
		 */


		
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		
		driver.findElement(By.cssSelector(".password")).sendKeys("mypassword");
		//driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.cssSelector("[class='list'] li:nth-child(4) a")).click();
		driver.findElement(By.cssSelector("a[title*='3rd Album'] img")).click();
		
		
	}

}
