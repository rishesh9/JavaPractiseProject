package XpathCreation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ESPNCricInfo {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/india-in-sri-lanka-2024-1442984/sri-lanka-vs-india-3rd-odi-1442992/full-scorecard");

		driver.manage().window().maximize();

		wicketTakerName("Kusal Mendis");
		wicketTakerName("Dunith Wellalage");

		batsmanDetails("Maheesh Theekshana");

	}

	public static void wicketTakerName(String variable) {

		By wickettaker = By.xpath("//span[text()='" + variable + "']/ancestor::td/following-sibling::td/span");

		WebElement wictaker = driver.findElement(wickettaker);

		String text = wictaker.getText();

		System.out.println("Wicket taker name is :" + text);

	}

	public static void batsmanDetails(String variable) {

		By BatsmanDetails = By.xpath(
				"//span[text()='"+variable+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]");

		List<WebElement> details = driver.findElements(BatsmanDetails);

		ArrayList<Object> batsmandetails = new ArrayList<Object>();

		for (WebElement e : details) {
			String text = e.getText();

			batsmandetails.add(text);
		}

		System.out.println(batsmandetails);

	}

}
