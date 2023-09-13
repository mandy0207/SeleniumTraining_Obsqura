package HandlingGUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioBtn = driver.findElement(By.id("inlineRadio1"));
		
		System.out.println(maleRadioBtn.isSelected());
		maleRadioBtn.click();
		System.out.println(maleRadioBtn.isSelected());
		
		
		WebElement showSelectedValueBtn = driver.findElement(By.xpath("//*[@id='button-one']"));
		System.out.println("Is it displayed : "+showSelectedValueBtn.isDisplayed());
		
		System.out.println("AM I ENABLED :"+showSelectedValueBtn.isEnabled());
		
		driver.quit();

	}

}
