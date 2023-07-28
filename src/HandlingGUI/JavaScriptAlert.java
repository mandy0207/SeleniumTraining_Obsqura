package HandlingGUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");

		driver.findElement(By.xpath(" //button[@class='btn btn-success']")).click();

		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		/**
		 * We can grab text of alert by using getText() method
		 */
		System.out.println(alert.getText());
		/**
		 * We can accept alert by using accept() method
		 */
		alert.accept();

		/**
		 * Here we are clicking second alert
		 */

		driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		/**
		 * dismiss() is used to cancel the alert
		 */
		// alert.dismiss();
		alert.dismiss();
		
		

	}

}
