package HandlingGUI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id='validationCustom01']"));

		WebElement lastName = driver.findElement(By.xpath("//*[@id='validationCustom02']"));
	
		Thread.sleep(2000);
		/**
		 * 
		 * To send text on an element
		 */
		js.executeScript("arguments[0].value='Misha';", firstName);
		js.executeScript("arguments[0].value='Dass';", lastName);
		
        WebElement submitBtn = driver.findElement(By.xpath("//*[@type='submit']"));
        /**
		 * To click on an element using javascript executor
		 */
        js.executeScript("arguments[0].click();", submitBtn);
        
        
	}

}
