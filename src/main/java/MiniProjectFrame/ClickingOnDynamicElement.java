package MiniProjectFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickingOnDynamicElement {

	static WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();

		driver.get("https://google.com");

		// driver.manage().window().maximize();

	}

	@Test
	public void launchURL() throws InterruptedException {

		By search = By.xpath("//textarea[@name='q']");
		driver.findElement(search).sendKeys("naveen automation");
		Thread.sleep(4000);
		By searchpattern = By.xpath("//div[@class='OBMEnb']//li");

		List<WebElement> webelement = driver.findElements(searchpattern);
		int searchsize = webelement.size();
		System.out.println("Total number of Webelements are :" + searchsize);

		int count = 0;
		for (WebElement web : webelement) {

			System.out.println(count + "=" + web.getText());
			
			String matchingtext=web.getText();
			
			if(matchingtext.contains("playwright")) {
				web.click();
				break;
			}
			count++;
		}

	}

	@Test(enabled = false)
	public void testme() {

		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.findElement(By.id("pass")).sendKeys("");
		// boolean t5 = driver.findElement(By.id("input-firstname")).isSelected();
		// System.out.println("Is firstName textbox selected: " +t5);
	}

}
