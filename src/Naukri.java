import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=contact");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select/option[2]")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/p[4]/input")).sendKeys("testautomate@gmail.com");
		//driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[2]/div/select")).sendKeys("OCVAJ");
		
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/p[5]/div/input")).sendKeys("D:\\aishresume.txt");//upload text
		

	}

}
