package SeleniumMiniProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonFooterLink {
	
  static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get(
				"https://amazon.in");

		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		By firstlement=By.id("DealMessage-496c2413-18a3-4405-a907-19ff678a1121");
		act.scrollToElement(driver.findElement(firstlement)).build().perform();
		
		
		List<WebElement> footerLink=driver.findElements(By.cssSelector("div.navFooterLinkCol.navAccessibility > .navFooterColHead"));
		
		//List<WebElement> footers=driver.findElements(By.xpath("//div[text()='"+Link+"s']/following-sibling::ul//li"));
		
		int a=footerLink.size();
		System.out.println(a);
		
		//ArrayList<String> list=new ArrayList<>();
		
		for(WebElement e:footerLink) {
			String text=e.getText();
			
			System.out.println(text);
				
				List<WebElement> footers=driver.findElements(By.xpath("//div[text()='"+text+"']/following-sibling::ul//li"));
				
				System.out.println("Total no of footers in " +text + "is: " +footers.size() );
				
				for(WebElement j:footers) {
					String footerxtext=j.getText();
					System.out.println(footerxtext);
			
		}
		
		
		}
		
	}

}