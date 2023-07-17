import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowsers {
 
//  static WebDriver driver;
	public static void main(String[] args) {
		 WebDriver driver=null;;
		  
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");
			
			 driver = new ChromeDriver();	
				
		}
		
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.mandy.driver",
					"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\msedgedriver.exe");
			
			    driver = new EdgeDriver();
		}
		
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\geckodriver.exe");
			
			    driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("Please find proper driver");
		}
		
	
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		String pageSource=driver.getPageSource();
		
		//System.out.println(pageSource);
		
		driver.quit();
		
	
		
		
	}

}
