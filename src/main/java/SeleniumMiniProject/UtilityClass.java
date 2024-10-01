package SeleniumMiniProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {

	private WebDriver driver;
	private Actions act;

	public UtilityClass(WebDriver driver) {
		
		if(driver==null) {
			 throw new IllegalArgumentException("Initialize driver before creating the object or calling the object");
		}
		this.driver = driver;
		act=new Actions(driver);
	}

	public WebDriver launchbrowser(String browser) {

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();

			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:

			System.out.println("User provided Browser cannot be executed");
			throw new HandleException("NOT A CORRECT BROWSER");

			// break;
		}

		
		driver.manage().window().maximize();
		return driver;

	}

	public void launchUrl() {
		driver.get("https://ddrxqa.credable.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public String getTitleText() {
		return driver.getTitle();
	}

	public WebElement getWebelements(By locator) {
		return driver.findElement(locator);

	}

	public void doSendKeys(By locator, String value) {
		getWebelements(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getWebelements(locator).click();
	}

	public void doClick(By locator, String Variable) {
		getWebelements(locator).click();
	}

	public WebElement hoverOverNaviagtions(WebDriver driver) {

		// String Variable="Admin";

		By Navigations = By.id("travelx-sidebar");

		WebElement navigate = driver.findElement((Navigations));

		Actions ac = new Actions(driver);
		ac.moveToElement(navigate).perform();

		return navigate;
	}

	By BuyersVisible = By.xpath("//span[text()[normalize-space() ='Buyers']]");
	// String Variable1="Country";

	public void doSendKeys(WebDriver driver, WebElement element, String Variable, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(BuyersVisible));
		element.sendKeys(Variable);
	}
	
	public void clickWithJS(WebElement BuyerCity) {
	JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll the element into view
    js.executeScript("arguments[0].scrollIntoView(true);", BuyerCity);

    // Click the element
    js.executeScript("arguments[0].click();", BuyerCity);
    
	}
	
	public void scrollPage(WebElement element) {
		Actions ac = new Actions(driver);
		ac.scrollToElement(element);
	}

	public void storeAllDropDownValues(By element, WebElement select, String City) {

		List<WebElement> elements = driver.findElements(element);
		System.out.println(elements.size());

		for (WebElement e : elements) {
			String text = e.getAttribute("value");
			System.out.println(text);

			if (text.equals(City)) {
				clickWithJS(select);
				break;
			}
		}

	}
	
	
public  void usingActions(String Parent,String Child) {
		
		
		act.moveToElement(getElement(By.xpath("//a[text()='"+Parent+"']"))).perform();
		
		act.moveToElement(getElement(By.xpath("//a[normalize-space(text()) = '"+Child+"']"))).click().build().perform();

	}
	
	public WebElement getElement(By element) {
		
		return driver.findElement(element);
		
	}
	
	public void clickonSpecificElement(String elements,By element, String text) {
		 List<WebElement> rightclick=driver.findElements(By.cssSelector(elements));
			//act.click(rightclick).perform();
		    getElement(element);
			
		}

}
