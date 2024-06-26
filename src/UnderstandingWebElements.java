import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UnderstandingWebElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement userName = driver.findElement(By.cssSelector("#user-name"));
		userName.sendKeys("standard_user");
		WebElement passWord = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		passWord.sendKeys("secret_sauce");
		WebElement loginBtn = driver.findElement(By.cssSelector(".submit-button"));
		loginBtn.click();
		
		/**
		 * How to use WebElements
		 */

		
		List<WebElement> addToCart = driver.findElements(By.cssSelector(".btn_small.btn_inventory"));
		int itemNumbers = addToCart.size();
		System.out.println("Size of List = "+addToCart.size());
		
		for(int i =0;i<addToCart.size();i++) {
			addToCart.get(i).click();
		}
		
		driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		List<WebElement> products = driver.findElements(By.cssSelector(".cart_item"));
        int pNumber = products.size(); 
        
		Assert.assertEquals(pNumber,itemNumbers);
		
		driver.findElement(By.cssSelector("#checkout")).click();
		
		driver.findElement(By.cssSelector("#first-name")).sendKeys("Mandy");
		driver.findElement(By.id("last-name")).sendKeys("Singh");
		driver.findElement(By.cssSelector("#postal-code")).sendKeys("143521");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		String actualtext = driver.findElement(By.cssSelector(".complete-header")).getText();
		System.out.println("Actual Text="+actualtext);
		Assert.assertEquals(actualtext, "Thank you for your order!");
		
	
		driver.quit();
		
		
	}

}
