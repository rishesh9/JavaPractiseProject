package CSSSelectorCreation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownUsingCSS {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://orangehrm.com/30-day-free-trial/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement firstname=driver.findElement(By.cssSelector("#Form_getForm_Name"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(firstname));
		firstname.sendKeys("Rishesh");
		
		
		
		
		
		List<WebElement> country=driver.findElements(By.cssSelector("select#Form_getForm_Country > option"));
		
		for(WebElement e:country) {
			String text=e.getText();
			
			System.out.println(text);
			
			if(text.equals("India"))
			{
				e.click();
				break;
			}
		}
		
		
		
		
	}

}
