package MiniProjectFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterLinkClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()])//li)[last()]")).click();
		
		
		
		
		
		

	}

}
