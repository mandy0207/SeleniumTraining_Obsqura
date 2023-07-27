package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleintProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.co.in/");

		driver.findElement(By.xpath("//*[@aria-label='Going to']")).click();
		driver.findElement(By.xpath("//*[@data-stid='destination_form_field-menu-input']")).sendKeys("mon");
		Thread.sleep(4000);
		List<WebElement> elements = driver
				.findElements(By.xpath("//*[@data-stid='destination_form_field-result-item-button']"));
		System.out.println(elements.size());
		for (WebElement element : elements) {

			String text = element.getAttribute("aria-label");
			System.out.println(text);

		}

	}

}
