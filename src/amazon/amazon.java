package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	
	
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=23771e6b-7bd5-48c5-9e06-acb8ae27b494&ie=UTF8");
				
				
				 Actions action=new Actions(driver);
				   action.moveToElement(driver.findElement(By.xpath("html/body/div[1]/header/div/div[3]/div[1]/div[2]/a/span[2]"))).build().perform();
				   driver.findElement(By.xpath("html/body/header/div/div[1]/div[4]/div[4]/div[2]/span[8]/span")).click();
				   
				   Actions action1=new Actions(driver);
				   action1.moveToElement(driver.findElement(By.xpath(""))).build().perform();
				   driver.findElement(By.xpath("html/body/header/div/div[1]/div[4]/div[4]/div[2]/span[8]/span")).click();
				
				
}
}