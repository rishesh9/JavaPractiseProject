package XpathCreation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HoverOverMenu {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		

		
			driver = new ChromeDriver();
			
			
			driver.get("https://ddrxqa.credable.in/");
			
			By email= By.id("email");
			By password= By.id("password");
			By submit=By.id("submit");
			
			driver.findElement(email).sendKeys("test@bt.maker");
			driver.findElement(password).sendKeys("credo@123");
			driver.findElement(submit).click();
			
			Thread.sleep(10000);
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // 10 seconds timeout
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='heading1']")));
			
			
			Actions ac=new Actions(driver);
				// By Navigations=By.xpath("//div[text()[normalize-space() ='Admin']]/parent::div[@class='menu-text']");
				 
				 WebElement navigate=driver.findElement(By.xpath("//div[text()[normalize-space() ='Buyers']]/parent::div[@class='menu-text']"));
				
			WebElement profile=driver.findElement(By.id("travelx-sidebar"));
				
			ac.moveToElement(profile).perform();
			
				ac.moveToElement(navigate).click().build().perform();
			
			//driver.findElement(By.id("adminName-option")).click();

		    
	}

}
