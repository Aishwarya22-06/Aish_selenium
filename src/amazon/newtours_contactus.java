package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtours_contactus {
	

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\install\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://http://newtours.demoaut.com//");
			
			//
			driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a")).click();

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
