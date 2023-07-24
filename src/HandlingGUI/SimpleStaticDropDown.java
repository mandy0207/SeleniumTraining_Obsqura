package HandlingGUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SimpleStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		/**
		 * In order to select static dropdown there must be a select tag and option tag
		 * We can use 3 methods to make selection of any element from static dropdown
		 * 
		 * selectByIndex()
		 * selectByValue()
		 * selectByVisivleText()
		 */
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select staticDropdown = new Select(dropdown);
		
		staticDropdown.selectByValue("Yellow");
		Thread.sleep(2000);
		
		
		
		staticDropdown.selectByIndex(3);
		Thread.sleep(2000);
		
		staticDropdown.selectByVisibleText("Red");
		


		//driver.close();	

	}

}
