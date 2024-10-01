package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionIntUses {


	static WebDriver driver;
	
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
			
		
		   driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		   
		   
		   Actions ac=new Actions(driver);
		   
		 Action act=  ac.sendKeys(driver.findElement(By.id("input-firstname")), "Rishesh").build();
		 
		 act.perform();
		 
		 WebElement clickcheckbox=driver.findElement(By.name("agree"));
        Action tick= ac.click(clickcheckbox).build();
        tick.perform();
		   
		   
		
		

	}

}
