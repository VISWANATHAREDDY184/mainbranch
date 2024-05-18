package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
	
 WebDriver driver = new ChromeDriver();
		 
 		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 //waits
		 
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		 Thread.sleep(3000);
		 
		 System.out.println("completed");
		 driver.quit();
		 
		 
	
	}

}
