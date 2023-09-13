
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowsers {

	public static void main(String[] args) {
		WebDriver driver = null;

		String browser = "chrome";

		if (browser.equals("chrome")) {

			driver = new ChromeDriver();

		}

		else if (browser.equals("edge")) {

			driver = new EdgeDriver();
		}

		else if (browser.equals("firefox")) {

			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Please find proper driver");
		}

		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com/");
		String pageSource = driver.getPageSource();

		// System.out.println(pageSource);

		driver.quit();

	}

}
