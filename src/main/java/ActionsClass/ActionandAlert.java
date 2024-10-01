package ActionsClass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionandAlert {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		Actions act = new Actions(driver);

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		clickonSpecificElement(driver,"right click me", "Copy");

	}

	public static void clickonSpecificElement(WebDriver driver, String element, String text) {
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='" + element + "']"))).perform();

		driver.findElement(By.xpath("//span[text()='" + text + "']")).click();

	}

	public static void actionAndAlert(Actions act) throws InterruptedException {

		List<WebElement> list = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		for (WebElement e : list) {
			String text = e.getText();

			if (text.equals("Copy"))
				;

			Thread.sleep(5000);

			act.click(e).perform();
			break;
		
		}

	}

}
