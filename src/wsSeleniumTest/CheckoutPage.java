package wsSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage
{
	
	public CheckoutPage()
	{
		String url = "https://secure.williams-sonoma.com/shoppingcart/";
	}
	
	protected String cartProductText(Webdriver driver)
	{
	    String productHeader = ".cart-table-row-title";
	    Webdriver productText = driver.findElements(By.cssSelector(productHeader));
	    return getSelectorAsString(productText);
	}
	
	protected void saveForLater(Webdriver driver)
	{
		String saveLink = ".moveToSFLt";
		Webdriver saveLinkProduct = driver.findElements(By.cssSelector(saveLink));
		driver.waitForVisible(saveLinkProduct);
		driver.click(saveLinkProduct);
	}
	
	protected String saveForLaterProductText(Webdriver driver)
	{
	    String saveForLaterHeader = ".cart-table-row-title";
	    Webdriver saveForLaterText = driver.findElements(By.cssSelector(saveForLaterHeader));
	    return getSelectorAsString(saveForLaterText);
	}
}