package HandlingGUI;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://selenium.obsqurazone.com/date-picker.php");
		driver.findElement(By.xpath("(//*[@class='fa fa-calendar'])[1]")).click();
		WebElement month = driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]"));
		while(!month.getText().contains("January")) {
			driver.findElement(By.xpath("(//*[@class='next'])[1]")).click();
		
			
		}
		
		Thread.sleep(2000);
		List<WebElement> Days = driver.findElements(By.xpath("//*[@class='day']"));
		System.out.println(Days.size());
		for(int i =0; i<Days.size();i++) {
			if(Days.get(i).getText().contains("5")) {
				Days.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@id='button-one']")).click();

	}

}
