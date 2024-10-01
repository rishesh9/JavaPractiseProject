package SeleniumMiniProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownRevision {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		WebElement countrylist=driver.findElement(By.id("Form_getForm_Country"));
		
		Select sc=new Select(countrylist);
		
		//sc.selectByIndex(300);
		sc.selectByValue("Niger");
		
		

	}

}
