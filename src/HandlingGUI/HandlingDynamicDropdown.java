package HandlingGUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='combobox'])[2]")).sendKeys("ne");
	    List<WebElement> states = driver.findElements(By.cssSelector(".select2-results__options li"));
	    System.out.println("Total elements found= "+states.size());
		
	    for(int i =0;i<states.size();i++) {
	    	if(states.get(i).getText().equalsIgnoreCase("New Mexico")) {
	    		
	    		states.get(i).click();
	    		break;
	    		
	    	}
	    }
	    
	    driver.close();
		

	}
	

}
