package MiniProjectFrame;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountBlankandFilledTextLinks {

	// static int totalblanklinks;
	//int static count;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		List<WebElement> linklist = new LinkedList<>();
		linklist = driver.findElements(By.tagName("a"));

		int totallinks = linklist.size();
		System.out.println("Total linklist size of given page is : " + totallinks);

	int totalblanklinks = 0;
		
		int count = 0;
		
		for (WebElement e : linklist) {
			

			String filledtext = linklist.get(count).getText();
			
			

			if (filledtext.length() == 0) {
			totalblanklinks++;
				

				System.out.println(count + " = " + e.getText());
				
			}
			count = count + 1;	
			
		}
		

		
		System.out.println("Total blank filled links are : " + totalblanklinks);
		
		int difference = totallinks - totalblanklinks;

		System.out.println("Total number of filled links are : " + difference);

	}

}
