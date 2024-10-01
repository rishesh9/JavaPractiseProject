package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get(
					"https://www.aqi.in/dashboard/canada");
			
			Thread.sleep(5000);
			
			
			WebElement element=driver.findElement(By.linkText("Flin Flon, Canada"));
			
			String rank=driver.findElement(with(By.tagName("p")).toLeftOf(element)).getText();
		System.out.println(rank);
		
		String rank1=driver.findElement(with(By.tagName("p")).above(element)).getText();
		System.out.println(rank1);
		
		String rank2=driver.findElement(with(By.tagName("p")).below(element)).getText();
		System.out.println(rank2);
		
		
		
	}

}
