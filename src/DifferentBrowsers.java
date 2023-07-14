import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DifferentBrowsers {
 
    static WebDriver driver;
	public static void main(String[] args) {
		 
		   
		String browser = "edge";
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");
			
			 driver = new ChromeDriver();	
				
		}
		
		else if(browser.equals("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\msedgedriver.exe");
			
			    driver = new EdgeDriver();
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
