package HandlingGUI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opts = new ChromeOptions();
		opts.setBinary("C:\\Users\\msingh\\Desktop\\Chrome 115x\\chrome-win64//Chrome.exe");

		WebDriver driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//*[@id='start']//button")).click();
        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']")));
	
		String text = driver.findElement(By.xpath("//*[@id='finish']")).getText();
		
		
		System.out.println(text);
		driver.quit();

	}
}
