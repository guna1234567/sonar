package Screenshot1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Newscreeen {
  @Test
  public void HariScreen() throws IOException {
System.getProperty("webdriver.chrome.driver", "C:\\Users\\phari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.facebook.com//");
	  
	   File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		File s1 = new File("C:\\Users\\phari\\OneDrive\\Pictures\\Saved Pictures\\fb.jpg");
	
		FileHandler.copy(s, s1);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8247580546");
		driver.findElement(By.name("pass")).sendKeys("hari1234");
				
        File s3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		File s2 = new File("C:\\Users\\phari\\OneDrive\\Pictures\\Saved Pictures\\loging .jpg");
	
		FileHandler.copy(s3, s2);
		
		
		driver.findElement(By.name("login")).click();
		File s4 =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File s5 =new File("C:\\Users\\phari\\OneDrive\\Pictures\\Saved Pictures\\fb\\openfb.jpg");
		FileHandler.copy(s4, s5);
		
		

		
		System.out.println("screen Shot successfully in driver");
		System.out.println("screen Shot successfully in driver");
		  
  }
}
