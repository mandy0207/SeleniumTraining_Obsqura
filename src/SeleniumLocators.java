import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		/**
		 * Here we are using following locator
		 * 
		 * ID, ClassName, Name, LinkText, PartialLinktext
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About")).click();
		System.out.println("Title of about page="+driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Logo")).click();
		
		/**
		 * getTitle() method is used to get title of page under control of webDRiver
		 */
		System.out.println("Title of Login page="+driver.getTitle());
		
		/**
		 * GetText() method is used to grab text inside any webelement
		 */
		String text = driver.findElement(By.className("login_logo")).getText();
		System.out.println(text);
		driver.quit();
	
	}

}
