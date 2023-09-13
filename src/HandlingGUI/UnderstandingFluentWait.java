package HandlingGUI;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class UnderstandingFluentWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//button[normalize-space()='Remove']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		
		  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).
		  withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		  
		 /**
		  * Fluent wait provides us mechanism to poll waiting time and ignore some kind of exceptions
		  * Fluent wait provides apply method in which we can write custom logic according to our need
		  */
		  
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add']")));
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		
		
//		 WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//		     public WebElement apply(WebDriver driver) {
//		       return driver.findElement(By.id("foo"));
//		     }
//		   });
		
		//driver.quit();
		

	}

}
