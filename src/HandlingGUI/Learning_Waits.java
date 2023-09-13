package HandlingGUI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning_Waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
	
		driver.findElement(By.xpath("//*[@id='save']")).click();
		String Name=driver.findElement(By.xpath("//h5")).getText();
	
		System.out.println(Name);
		
		/**
		 * Implicit wait applicable globally
		 * 
		 */
		
		driver.findElement(By.xpath("//a[@id='progress-bars']")).click();
		driver.findElement(By.xpath("//*[@id='downloadButton']")).click();
		
        WebElement progressBar=driver.findElement(By.cssSelector("div[class='progress-label']"));
     
		/**
		 * Explicit Wait
		 */
        
        WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(12));
		wait.until(ExpectedConditions.textToBePresentInElement(progressBar, "Complete!"));
		 WebElement closeBtn = driver.findElement(By.cssSelector("button[class='ui-button ui-corner-all ui-widget']"));
		System.out.println(closeBtn.getText());

     	closeBtn.click();
		



	}

}
