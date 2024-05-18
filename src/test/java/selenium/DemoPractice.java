package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoPractice {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://tutorialsninja.com/demo/");
		
		  driver.findElement(By.name("search")).sendKeys("iMac");
	        driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"]")).click();
	        driver.findElement(By.xpath("//img[@class=\"img-responsive\"]")).click();
	        WebElement compare = driver.findElement(By.xpath("//button[@class='btn btn-default']//i[@class='fa fa-exchange']"));
	        //for your Xpath it is locating for 2 elements kindly 
	        //i[@class=\"fa fa-exchange\"]
	        Actions a=new Actions(driver);
	        // you can give the build and perform so it should work
	        a.moveToElement(compare).click().build().perform();
	        driver.findElement(By.xpath("//a[text()=\"product comparison\"]")).click();


		
		
		
		

	}

}
