package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SeleniumMiniProject.UtilityClass;

public class PractiseMouseHover {

	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		UtilityClass execute = new UtilityClass(driver);
	
	   driver.get("https://corporate.spicejet.com/visaServices.aspx");

		// execute.launchbrowser("chrome")

		Thread.sleep(3000);

		WebElement addons = driver.findElement(By.id("highlight-addons"));
		WebElement spciemax = driver.findElement(By.xpath("//a[text()='SpiceMAX ']"));

		// a[text()='Add-Ons']

		execute.usingActions("Add-Ons", "SpiceMAX");

	}

}
