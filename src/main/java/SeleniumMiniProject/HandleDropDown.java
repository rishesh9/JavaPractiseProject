package SeleniumMiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {

		UtilityClass execute = new UtilityClass(null);

		WebDriver driver = execute.launchbrowser("chrome");

		execute.launchUrl();
		String title = execute.getTitleText();
		System.out.println("Title of the page is : " + title);

		By email = By.id("email");
		By password = By.id("password");
		By submit = By.id("submit");

		execute.doSendKeys(email, "test@bt.maker");
		execute.doSendKeys(password, "credo@123");

		execute.doClick(submit);

		Thread.sleep(6000);
		
		WebElement verifylogo=driver.findElement(By.cssSelector(".credableLogoSize"));
		boolean flag=verifylogo.isDisplayed();
		System.out.println(flag);

		execute.hoverOverNaviagtions(driver);

		String Variable = "Buyers";

		By MenuBuyers = By
				.xpath("//div[text()[normalize-space() ='" + Variable + "']]/parent::div[@class='menu-text']");

		execute.doClick(MenuBuyers, Variable);

		By AddNewBuyer = By.xpath("//button[text()[normalize-space() ='Add New Buyer']]");

		execute.doClick(AddNewBuyer);

		// WebElement
		// Country=driver.findElement(By.xpath("//label[text()[normalize-space()
		// ='Country']]"));
		WebElement Country = driver.findElement(By.id("countryAdd"));

		// execute.doSendKeys(driver, Country, "India", 3);

		By CityDropdown = By.xpath("//div[@id='countryListToAdd']/descendant::input");

//		WebElement Countryelement = driver.findElement(By.xpath("//label[text()='Country ']"));
//		execute.scrollPage(Countryelement);
//
//		Thread.sleep(3000);

		String city = "India";
		// WebElement foundcity =
		// driver.findElement(By.xpath("//div[@id='countryListToAdd']/descendant::input[@value='"
		// + city + "']"));
		WebElement retrcity = driver.findElement(By.xpath("//input[@value='" + city + "']/following-sibling::ins"));

		execute.storeAllDropDownValues(CityDropdown, retrcity, "India");

	}

}
