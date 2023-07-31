package HandlingGUI;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector(".example a")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();

		String parentWindow = it.next();
		String childWindow= it.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle());
		String TextPresent = driver.findElement(By.xpath("//h3")).getText();
		System.out.println("Text Present on page="+TextPresent);
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());
		
	}

}
