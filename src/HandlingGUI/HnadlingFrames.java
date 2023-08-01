package HandlingGUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HnadlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		String heading = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(heading);
		/**
		 * 1)When ever any element is present inside frame. We have to switch inside frame to perform operations
		 * 2) We can switch inside frame by three ways
		 *  using id or name of frame, using index of frame or using webelement of frame
		 */
		
		
		driver.switchTo().frame("mce_0_ifr");
		
		WebElement msgBox=driver.findElement(By.cssSelector("[id='tinymce'] "));
		msgBox.clear();
		msgBox.sendKeys("I am misha");
		/**
		 * With following statement driver will come out of frame
		 */
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		driver.quit();

	}

}
