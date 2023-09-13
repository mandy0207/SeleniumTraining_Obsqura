import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSession2 {

	public static void main(String[] args) {

		

		/**
		 * Below statement initiates a driver and open the browser window
		 */
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		
		/**
		 * get is used to open the page or link
		 */
		driver.get("https://www.obsqurazone.com/");

		String title = driver.getTitle();

		System.out.println("Title of Page is =" + title);

		String url = driver.getCurrentUrl();

		System.out.println("Current Url=" + url);
		
//		driver.navigate().back();
//		driver.navigate().forward();
		
		/**
		 * close- closes only current window.
		 * But if there's only one window opened in browser it will close
		 */
		
		driver.close();     
		
		/**
		 * quit closes entire browser
		 * because it kills the driver scope
		 */
	//	driver.quit();
		
	}
}
