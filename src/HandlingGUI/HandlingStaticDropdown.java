package HandlingGUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HandlingStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select staticDropdown = new Select(dropdown);
		
		
		
		staticDropdown.selectByValue("Yellow");
		Thread.sleep(2000);
		GetText(driver.findElement(By.xpath("//*[@id='message-one']")).getText(), "Yellow");
		
		
		staticDropdown.selectByIndex(3);
		Thread.sleep(2000);
		GetText(driver.findElement(By.xpath("//*[@id='message-one']")).getText(), "Green");
		staticDropdown.selectByVisibleText("Red");
		GetText(driver.findElement(By.xpath("//*[@id='message-one']")).getText(), "Red");
		
		/**
		 * Optional for your understanding
		 */
//		List<WebElement> optionsofWeblements= staticDropdown.getOptions();
//		for(WebElement element : optionsofWeblements) {
//			System.out.println("Text present = "+element.getText());
//		}

		driver.quit();	
	}
	
	public static void GetText(String str, String ExpectedText) {
		
		String actualText=str.split(": ")[1];
		System.out.println(actualText);
		//Actual testing is happening here
	    Assert.assertEquals(actualText, ExpectedText);
		
		
	}

}
