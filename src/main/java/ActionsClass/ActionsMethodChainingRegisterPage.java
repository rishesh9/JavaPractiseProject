package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegisterPage {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		 	
				driver = new ChromeDriver();

				driver.get(
						"https://naveenautomationlabs.com/opencart/index.php?route=account/register");

				driver.manage().window().maximize();
				
				
				
				WebElement firstname=driver.findElement(By.id("input-firstname"));
				
				Actions act=new Actions(driver);
				
				act.sendKeys(firstname,"Rishesh")
				.sendKeys(Keys.TAB).pause(500)
				.sendKeys("JHa").build().perform();
			
		
	}

}
