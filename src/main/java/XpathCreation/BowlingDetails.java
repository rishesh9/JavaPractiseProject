package XpathCreation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BowlingDetails {

	static WebDriver driver;

	static By bowlingCard = By
			.xpath("(//th[text()='BOWLING'])[last()]/following-sibling::th[contains(@class,'ds-text-right')]");

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/india-in-sri-lanka-2024-1442984/sri-lanka-vs-india-3rd-odi-1442992/full-scorecard");

		driver.manage().window().maximize();

//		bowlingCard();
//		onlyBowlerCard("Maheesh Theekshana");
//		bowlerDetails("Jeffrey Vandersay");
		bowlerrCard("Maheesh Theekshana ");

	}

	public static List<WebElement> bowlingCard() {
		// WebElement bowlCard;
		ArrayList<String> details = new ArrayList<String>();

		List<WebElement> bowlCardDetails = driver.findElements(bowlingCard);

		for (WebElement e : bowlCardDetails) {
			String text = e.getText();

			details.add(text);
		}

		System.out.println(details.size());
		System.out.println(details);

		return bowlCardDetails;

	}

	public static void onlyBowlerCard(String Playername) {
		By bowlerelement = By
				.xpath("(//th[text()='BOWLING'])[last()]/ancestor::thead/following-sibling::tbody/tr[3]//span");

		ArrayList<String> allbowlers = new ArrayList<String>();
		List<WebElement> bowler = driver.findElements(bowlerelement);

		for (WebElement e : bowler) {
			String text = e.getText();
			allbowlers.add(text);

		}

		for (int i = 0; i < allbowlers.size(); i++) {

			if (Playername.equals(allbowlers.get(i))) {
				;
			System.out.println("Player is found");
			}
			
			else {
				System.out.println("We could not find the player");
			}

			break;
           
			
		}
		System.out.println(allbowlers);

	}

	public static void bowlerDetails(String variable) {
		ArrayList<String> details = new ArrayList<String>();

		List<WebElement> bowlCardDetails = driver.findElements(bowlingCard);

		for (WebElement f : bowlCardDetails) {
			String text1 = f.getText();

			details.add(text1);
		}
		HashMap<String, String> bowlerscorecard = new HashMap<String, String>();

		By BatsmanDetails = By.xpath("//span[text()='" + variable
				+ "']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]");

		List<WebElement> bowldetails = driver.findElements(BatsmanDetails);

		for (int i = 0; i < bowldetails.size(); i++) {
			for (WebElement e : bowldetails) {
				String text = bowldetails.get(i).getText();
				bowlerscorecard.put(details.get(i), text);

			}

		}

		System.out.println(bowlerscorecard);
		System.out.println(bowlerscorecard.get(details.get(4)));

	}
	
	public static void bowlerrCard(String variable) {
		By bowlercard=By.xpath("//span[text()='"+variable.trim()+"']/ancestor::tbody/preceding-sibling::thead/child::tr/child::th[text()='BOWLING']/ancestor::thead/following-sibling::tbody/child::tr[3]/child::td/following-sibling::td[contains(@class,'ds-text-right')]");
		
		List<WebElement> bowler = driver.findElements(bowlercard);
		ArrayList<Object> allbowlers = new ArrayList<Object>();
		

		for (WebElement e : bowler) {
			String text = e.getText();
			allbowlers.add(text);

		}
		System.out.println(allbowlers);
	}
	
}
