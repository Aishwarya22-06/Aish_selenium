import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autopratice {

	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
			driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")).sendKeys("aishwaryadinni22@gmail.com");
			driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")).sendKeys("aish@123");
			driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
			
				driver.findElement(By.xpath("html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();			
		
		
				 Actions action=new Actions(driver);
				   action.moveToElement(driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img"))).build().perform();
				
				driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
				Thread.sleep(1000);
				  
				driver.findElement(By.xpath("//a[contains(@href,'http://automationpractice.com/index.php?controller=order')]")).click();
				driver.findElement(By.xpath("//a[contains(@href,'http://automationpractice.com/index.php?controller=order&step=1')]")).click();
				driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
				driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")).click();
				driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/div/form/p/button")).click();
				driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
				driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/p/button")).click();
		
		}

	}
	
	
	
	




