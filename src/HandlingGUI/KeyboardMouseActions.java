package HandlingGUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		/**
		 * whenever we need to handle any element with keyboard and mouse 
		 * we need to make object of Actions class
		 */
		
		Actions act = new Actions(driver);
		WebElement others=driver.findElement(By.cssSelector("#others"));
		/**
		 * Hover over a webelement
		 */
		act.moveToElement(others).build().perform();
		
		//To right click on the element
		act.moveToElement(others).contextClick().build().perform();
		//act.moveToElement(others).doubleClick().build().perform();
		
		//WebElement textBox = driver.findElement(By.cssSelector("[placeholder='Message']"));
	
		//act.moveToElement(textBox).click().sendKeys("jasmine").build().perform();
		/**
		 * Keyddown is used to hold key on keyboard
		 * here in this example we are holding shift key
		 */
		//act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("misha").build().perform();
		
		
	}

}
