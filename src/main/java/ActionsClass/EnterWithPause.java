package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v126.dom.DOM.GetElementByRelationRelation;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EnterWithPause {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://ddrxqa.credable.in/");

		// WebElement firstname=driver.findElement(By.id("input-firstname"));

		By firstname = By.id("input-firstname");
		By email=By.id("email");
		By Password=By.id("password");

//		String name="Rishesh Jha";
//		
//		
//		
//		Actions act=new Actions(driver);
//		
//		String [] str=name.split(" ");
//		
//		for(String s:str) {
//	    Action ac=	act.sendKeys(firstname, s).pause(500).build();
//	    ac.perform();
//		
//		
//		}

		//doSendKeysCharWithPause(firstname, "Rishesh Automation Tester", 500);
		
		doSendKeysCharWithPause(email, "test@bt.maker", 500);
		
		doSendKeysCharWithPause(Password, "credo@123", 500);

		driver.findElement(By.id("submit")).click();
	}

	public static void doSendKeysStringWithPause(By element, String value, long time) {
		Actions act = new Actions(driver);

		String[] str = value.split(" ");

		for (String s : str) {
			Action ac = act.sendKeys(getElement(element), s).pause(time).build();
			ac.perform();

		}
	}

	public static void doSendKeysCharWithPause(By element, String value, long time) {
		Actions act = new Actions(driver);

		char[] ch = value.toCharArray();

		for (char c : ch) {
			Action ac = act.sendKeys(getElement(element), String.valueOf(c)).pause(time).build();
			ac.perform();

		}

	}

	public static WebElement getElement(By element) {

		return driver.findElement(element);

	}

}
