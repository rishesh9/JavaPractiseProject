package SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get(	"https://orangehrm.com/30-day-free-trial/");
		
		
		WebElement Executive=driver.findElement(By.xpath("//a[normalize-space(text())='Executive Profile']"));
		
		WebElement Press=driver.findElement(By.xpath("(//a[normalize-space(text())='Press Releases'])[3]"));
		
		Actions act=new Actions(driver);
		
		
		act.scrollToElement(Executive).click(Executive).build().perform();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
	//	act.scrollToElement(Press).click(Press).build().perform();
		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//
//		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(4000);
		
		Executive.click();
		Press.click();
		
		
		

		
		

	}

}
