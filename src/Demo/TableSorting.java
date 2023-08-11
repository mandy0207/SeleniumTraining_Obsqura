package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='dtBasicExample']//tr//td[1]"));
		
		ArrayList<String> nameList = new ArrayList<String>();
		for(int i =0;i<list.size();i++) {
			String name = list.get(i).getText();
			nameList.add(name);
		}
		
		System.out.println(nameList);
		System.out.println("*************************************************");
		
		Collections.sort(nameList);
		System.out.println(nameList);
		driver.quit();

	}

}
