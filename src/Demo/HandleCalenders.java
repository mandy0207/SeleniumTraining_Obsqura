package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalenders {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/date-picker.php");
	 driver.findElement(By.xpath("//div[@data-provide='datepicker']//span[@id='basic-addon1']")).click();
		
		WebElement month = driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1] "));
		while(!month.getText().contains("October")) {
			
			driver.findElement(By.xpath("(//*[@class='next'])[1]")).click();
		}
		
		List<WebElement> Days = driver.findElements(By.cssSelector("[class='day']"));
		
		for(WebElement day :Days) {
			if(day.getText().equals("12")) {
				day.click();
				break;
				
			}
		}
		
		driver.findElement(By.xpath("//button[@id='button-one']")).click();

	}

}
