package amazon;

//import java.io.IOException;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class school_demo_teacher {
	
		public static void main(String args[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://school.demo.moodle.net/");
			
			
			//login button
			driver.findElement(By.xpath("html/body/div[1]/nav/ul[2]/li[2]/div/span/a")).click();
			//username
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/div[1]/input")).sendKeys("teacher");
			//password
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/div[2]/input")).sendKeys("moodle");
			//login button
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/button")).click();
			//site home
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='nav-drawer']/nav/a[2]/div/div/span[2]")).click();
			//go to courses
			//Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='region-main']/div/div/div/div/div/div/div[2]/div/div[1]/p[2]/a")).click();
			//art and media
			//Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/section/div/div/div[1]/div[1]/div/div[2]/div/p[3]/a[1]")).click();
			//calender
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/div[1]/div[3]/nav/a[3]")).click();
			//private files
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/div[1]/div[3]/nav/a[4]")).click();
			Thread.sleep(3000);
			//log ou button
			driver.findElement(By.xpath("html/body/div[1]/nav/ul[2]/li[2]/div/div/div/div/div/a")).click();
			Thread.sleep(3000);
			//log out
			driver.findElement(By.xpath("html/body/div[1]/nav/ul[2]/li[2]/div/div/div/div/div/div/a[6]")).click();
			
			/*driver.findElement(By.xpath("")).click();
			
			driver.findElement(By.xpath("")).click();
			
			driver.findElement(By.xpath("")).click();
			
			driver.findElement(By.xpath("")).click();
			
	*/		
		
	
	
	
	}
}
