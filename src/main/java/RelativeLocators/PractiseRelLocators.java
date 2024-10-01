package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class PractiseRelLocators {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get(
				"https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement firstname=driver.findElement(By.xpath("//label[text()='First Name']"));
		WebElement lastname=driver.findElement(By.xpath("//label[text()='Last Name']"));
		WebElement Email=driver.findElement(By.xpath("//label[text()='E-Mail']"));
		WebElement PasswordSection=driver.findElement(By.xpath("//legend[text()='Your Password']"));
		WebElement password=driver.findElement(By.xpath("//label[text()='Password']"));
		WebElement privacyandpolicy=driver.findElement(By.linkText("Privacy Policy"));
		WebElement termsandcondition=driver.findElement(By.xpath("//div[contains(text(),'I have read')]"));
		
		
		 WebElement agree=driver.findElement(By.xpath("//input[@name='agree']"));
		
		
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		driver.findElement(with(By.id("input-firstname")).toRightOf(firstname)).sendKeys("Rishesh");
		driver.findElement(with(By.id("input")).toRightOf(lastname)).sendKeys("Jha");
		
		driver.findElement(with(By.tagName("input")).toRightOf(Email)).sendKeys("rishesh.jha@email.com");
		driver.findElement(with(By.id("input-password")).toRightOf(password)).sendKeys("Sanosan");
		driver.findElement(with(By.xpath("//input[@name='agree']")).toLeftOf(privacyandpolicy)).click();
		
		
		driver.getWindowHandles();
		
	}

}
