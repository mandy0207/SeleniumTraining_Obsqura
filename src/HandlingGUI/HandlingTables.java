package HandlingGUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tr[3]//td"));
		System.out.println(list.size());
		
		for(int i =0;i<list.size();i++) {
			
			String textofTD = list.get(i).getText();
			System.out.println(textofTD);
		}
		
		driver.quit();
	}

}
