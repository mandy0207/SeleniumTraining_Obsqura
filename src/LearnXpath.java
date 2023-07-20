import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\msingh\\Desktop\\Selenium Session\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	/**
	 * xpath syntax 
	 * 
	 * 1) //tagname[@attribute='value']
	 *  
	 * 2) //tagname
	 * 3) (//tagname[@attribute='value'])[1], (//tagname[@attribute='value'])[2]  --- xpath indexing
	 * 
	 * 4) //*[contains(text(),'Text')]
	 * 5) //button[contains(@class,'submit')] - using regular expression
	 * 
	 * 
	 * 
	 */
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("(//div[@class='inputs'])[2]/input")).sendKeys("mypassword");
		driver.findElement(By.xpath("//*[@value='Log in']")).click();
		driver.findElement(By.xpath("(//*[@class='list'])[1]/li[4]/a")).click();
	
	    driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Casual')]")).click();
	    //we are using regular expression xpath here
	    WebElement qtyBox = driver.findElement(By.xpath("//*[contains(@id,'_EnteredQuantity')]"));
	    qtyBox.clear();
	    qtyBox.sendKeys("3");
	    
	    driver.quit();
		

	}

}
