package HandlingGUI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicTable {

	static int index;
	public static void main(String[] args) {
        ChromeOptions opts = new ChromeOptions();
        opts.setBinary("C:\\Users\\msingh\\Desktop\\Chrome 115x\\chrome-win64//Chrome.exe");

        WebDriver driver = new ChromeDriver(opts);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");
       List<WebElement> columns = driver.findElements(By.xpath("//*[@id='table1']//thead//tr//th"));
      for(int i =0;i<columns.size();i++) {
    	  if(columns.get(i).getText().equals("Website")) {
   		   System.out.println(i);
   		   index=i;
   		   break;
   	   }
      }
       List<WebElement> rows = driver.findElements(By.xpath("//*[@id='table1']//tbody//tr"));
      // System.out.println(rows.size());
        for(WebElement row:rows) {
        	System.out.println(row.findElement(By.xpath("td["+(index+1)+"]")).getText());
        }
	}
	
}
