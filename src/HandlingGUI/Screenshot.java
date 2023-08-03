package HandlingGUI;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.amazon.ca/");
		  
		/**
		 * Cast your driver to TakesScreenshot Interface
		 * call getScreenshotmethod and you can recieve a file as an output
		 * copy the file in your desired directory/folder
		 */
		
		      TakesScreenshot scrshot = (TakesScreenshot)driver;
		      File srcfile=scrshot.getScreenshotAs(OutputType.FILE);
		      File destfile = new File("C:\\Sask\\Code\\workspace\\MyFirstJavaProject\\screenshot.png"); 
		      FileUtils.copyFile(srcfile, destfile);
		      driver.quit();
		     
		      
		      
		      
		    
		      
	}

}
