package SeleniumMiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExecuatableClass {

	public static void main(String args[]) {

		UtilityClass execute = new UtilityClass(null);

		WebDriver driver = execute.launchbrowser("chrome");

		execute.launchUrl();
		String title = execute.getTitleText();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		System.out.println("Title of the page is : " + title);
		if (title.equals("Register Account")) {
			System.out.println("Title is correct");
		} else
			System.out.println("Title of the page doesn not match");

		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By submit= By.xpath("//input[@type='submit']");
		By Password=By.xpath("//*[@id=\"input-confirm\"]");

		execute.doSendKeys(firstname, "Rishesh");
		execute.doSendKeys(lastname, "Jha");
		
		execute.doClick(submit);
		
	   
		
		
	}

}
