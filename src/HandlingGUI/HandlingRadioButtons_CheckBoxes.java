package HandlingGUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons_CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id='gridCheck']"));
	
		System.out.println("Is my checkbox selected: "+checkBox.isSelected());
	
		checkBox.click();
		System.out.println("Is my checkbox selected: "+checkBox.isSelected());
		
		driver.findElement(By.partialLinkText("Radio Buttons")).click();
		
		WebElement radioBtn=driver.findElement(By.id("inlineRadio1"));
		System.out.println("Is my RadioBtn selected: "+radioBtn.isSelected());
		radioBtn.click();
		System.out.println("Is my RadioBtn selected: "+radioBtn.isSelected());
	
		driver.quit();
		

	}

}
