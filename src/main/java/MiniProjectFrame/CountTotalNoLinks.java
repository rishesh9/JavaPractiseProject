package MiniProjectFrame;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTotalNoLinks {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> linklist= new LinkedList< >() ;
		linklist= driver.findElements(By.tagName("a"));
		
		int linklistsize=linklist.size();
		
		System.out.println("Total number of links on page is :" +linklistsize);
		
		for(int i=0;i<linklistsize;i++) {
			
			String linktext=linklist.get(i).getText();
			
			if(linktext.length()!=0) {
			
			System.out.println(i + " = "+linklist.get(i).getText());
			
		}
		
		}


	}

}
