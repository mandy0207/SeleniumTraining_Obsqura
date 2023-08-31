package HandlingGUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethods_ToolTip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msingh\\Desktop\\Chrome 115x\\chromedriver.exe");
		ChromeOptions opts = new ChromeOptions();
		opts.setBinary("C:\\Users\\msingh\\Desktop\\Chrome 115x\\chrome-win64//Chrome.exe");

		WebDriver driver = new ChromeDriver(opts);
		driver.manage().window().maximize();
		driver.get("https://yatra.com");
		/**
		 * How to get attribute value of any element
		 */
		WebElement hotels = driver.findElement(By.xpath("//*[@id='booking_engine_hotels']"));
		String titleValue = hotels.getAttribute("title");
		String linkValue = hotels.getAttribute("href");
		System.out.println("Attibute="+titleValue);
		System.out.println("Attibute="+linkValue);
		
		/**
		 * How to get cssValue for any WebElement
		 */
		String paddingValue = hotels.getCssValue("padding");
		System.out.println(paddingValue);
	
		/**
		 * How to grab Tagname of any element
		 */
		String tagName=hotels.getTagName();
		System.out.println("Tagname is equal :- "+tagName);
	
		/**
		 * Counting elements of webpage
		 */
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		/**
		 * ToolTip is nothing but a title attribute of any webelement
		 * 
		 * 
		 */
		
		WebElement roundTrip = driver.findElement(By.cssSelector(".selc-flight-options li:nth-child(2) a"));
		
		String toolTip = roundTrip.getAttribute("title");
		System.out.println("ToolTip :- "+toolTip);
		
		driver.quit();

	}

}
