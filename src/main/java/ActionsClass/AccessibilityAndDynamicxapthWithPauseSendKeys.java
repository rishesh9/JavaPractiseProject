package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccessibilityAndDynamicxapthWithPauseSendKeys {

		static WebDriver driver;
		
		
		public static void main(String args[]) throws InterruptedException {
			
			By container=By.cssSelector("div.left-pane-results-container span");
			
			String amazonurl="https://amazon.in";
			
			
			AccessibilityAndDynamicxapth(container ,amazonurl,"Macbook Air","m2 case");
		}
		

		public static boolean AccessibilityAndDynamicxapth(By locator,String url,String value,String casetext) throws InterruptedException {
			
			 	
					driver = new ChromeDriver();

					driver.get(url);
					
					Actions act=new Actions(driver);
					
					char ch[]=value.toCharArray();
				 	act.sendKeys(Keys.TAB)
					.pause(300).sendKeys(Keys.TAB)
					.pause(300).sendKeys(Keys.TAB)
					.pause(300).sendKeys(Keys.TAB)
					.pause(300).sendKeys(Keys.TAB)
					.sendKeys(value).build().perform();
				 	
				 	Thread.sleep(5000);
				 
		
				 List<WebElement> list=driver.findElements(locator);
				 
				 boolean flag;
				 
				 int size=list.size();
				 System.out.println("Total macbook laptop suggestion is : " +size);
				 
				 for(WebElement laptop:list) {
					 String text=laptop.getText();
					 
					 System.out.println("Suggested laptops are : " + text);
					 if(text.contains(casetext)) {
						 laptop.click();
						 flag=true;
						 break;
					 }
					 
				 }
				 
		if(flag=true)	{
			System.out.println("We have matched the given case and clicked as welll : " );
			return true;
		}
		
		else if(flag=false){
			System.out.println("We could not find the given case : " );
			return false;
		}
		return flag;

}
}
